package xyz.hlmy.modules.sys.dto;

import xyz.hlmy.common.constant.MessageCodes;

import javax.validation.constraints.NotNull;

/**
 * @ProjectName: LearningRights
 * @ClassName: UserDto
 * @Author: lipenghui
 * @Description: 用户前后端传输参数
 * @Date: 2022/11/11 16:56
 */
public class UserDto {

    @NotNull(message = MessageCodes.NOT_USER_ACCOUNT_NULL)
    private String userAccount;

    @NotNull(message = MessageCodes.NOT_USER_NAME_NULL)
    private String userName;

    private String userSex;

    private String userPassword;

    private String userAvatar;

    private String userStatus;

}
