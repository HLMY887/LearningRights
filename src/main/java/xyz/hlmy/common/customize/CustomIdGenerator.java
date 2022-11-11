package xyz.hlmy.common.customize;

import com.baomidou.mybatisplus.core.incrementer.IdentifierGenerator;

import java.util.Random;

/**
 * @ProjectName: LearningRights
 * @ClassName: CustomIdGenerator
 * @Author: lipenghui
 * @Description: 自定义ID生成器
 * @Date: 2022/11/11 14:49
 */
public class CustomIdGenerator implements IdentifierGenerator {
    private final char[] arrays = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
            'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l'
            , 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    private final Random random = new Random();

    @Override
    public Number nextId(Object entity) {

        long ops = 0L;
        for (int i = 0; i < 18; i++) {
            int tmp = random.nextInt(9) + 1;
            ops = ops * 10 + tmp;
        }
        return ops;
    }

    @Override
    public String nextUUID(Object entity) {
        StringBuilder buffer = new StringBuilder();
        String name = entity.getClass().getSimpleName().toLowerCase();
        buffer.append(name).append("-");
        for (int i = 0; i < 9; i++) {
            buffer.append(arrays[random.nextInt(26) + 10]);
            buffer.append(arrays[random.nextInt(10)]);
        }
        return buffer.toString();
    }

}
