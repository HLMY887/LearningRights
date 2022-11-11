package xyz.hlmy.common.init;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import xyz.hlmy.modules.sys.service.SysMessageService;

import javax.annotation.PostConstruct;

/**
 * @ProjectName: LearningRights
 * @ClassName: MagInitialization
 * @Author: lipenghui
 * @Description: 信息初始化
 * @Date: 2022/11/11 15:10
 */
@Configuration
public class MagInitialization {

    public final Logger log = LoggerFactory.getLogger(MagInitialization.class);

    private final SysMessageService messageService;

    @Autowired
    public MagInitialization(SysMessageService messageService) {
        this.messageService = messageService;
    }

    @PostConstruct
    public void init() {
        log.info("信息加载中~~~~~~~~~");
        messageService.messageInitialization();
        log.info("信息加载完毕~~~~~~~~~");
    }
}
