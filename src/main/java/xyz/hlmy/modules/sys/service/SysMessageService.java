package xyz.hlmy.modules.sys.service;

import xyz.hlmy.modules.sys.entity.SysMessage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author lipenghui
 * @description 针对表【SYS_MESSAGE】的数据库操作Service
 * @createDate 2022-11-11 15:23:36
 */
public interface SysMessageService extends IService<SysMessage> {


    void messageInitialization();
}
