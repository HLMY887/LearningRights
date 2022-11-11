package xyz.hlmy.common.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @ProjectName: LearningRights
 * @ClassName: LocalDateTimeSerializerConfig
 * @Author: lipenghui
 * @Description: LocalDateTime 序列化程序配置
 * @Date: 2022/11/11 14:40
 */
@Configuration
public class LocalDateTimeSerializerConfig {


    /**
     * 主要针对 LocalDateTime类型的时间进行处理
     * @return ObjectMapper
     */
    @Bean
    public ObjectMapper serializingObjectMapper() {
        JavaTimeModule javaTimeModule = new JavaTimeModule();
        LocalDateTimeDeserializer deserializer = new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        LocalDateTimeSerializer serializer = new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        javaTimeModule.addDeserializer(LocalDateTime.class, deserializer);
        javaTimeModule.addSerializer(serializer);
        return Jackson2ObjectMapperBuilder
                .json()
                .modules(javaTimeModule)
                .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS)
                .build();
    }
}
