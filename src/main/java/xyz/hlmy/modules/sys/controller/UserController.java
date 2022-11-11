package xyz.hlmy.modules.sys.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.hlmy.common.util.R;

/**
 * @ProjectName: LearningRights
 * @ClassName: UserController
 * @Author: lipenghui
 * @Description: 用户控制器
 * @Date: 2022/11/11 16:17
 */
@RestController
@RequestMapping("/sys/user")
public class UserController {


    @GetMapping("/test")
    public String test() {
        return R.ok();
    }
}
