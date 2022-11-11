package xyz.hlmy.modules.sys.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import xyz.hlmy.modules.sys.mapper.SysUserMapper;
import xyz.hlmy.modules.sys.service.SysUserService;
import xyz.hlmy.modules.sys.entity.SysUser;
import org.springframework.stereotype.Service;

/**
* @author lipenghui
* @description 针对表【SYS_USER(用户)】的数据库操作Service实现
* @createDate 2022-11-11 14:36:13
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService {

}




