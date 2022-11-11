package xyz.hlmy.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.hlmy.common.constant.SysConstant;
import xyz.hlmy.modules.sys.entity.SysMessage;
import xyz.hlmy.modules.sys.mapper.SysMessageMapper;
import xyz.hlmy.modules.sys.service.SysMessageService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author lipenghui
 * @description 针对表【SYS_MESSAGE】的数据库操作Service实现
 * @createDate 2022-11-11 15:23:36
 */
@Service
public class SysMessageServiceImpl extends ServiceImpl<SysMessageMapper, SysMessage> implements SysMessageService {


    @Override
    public void messageInitialization() {
        List<SysMessage> messages = super.list(new QueryWrapper<SysMessage>().orderByAsc("\"code\""));
        for (SysMessage message : messages) {
            SysConstant.MESSAGE.put(message.getCode(), message.getMsgDoc());
        }
    }
}




