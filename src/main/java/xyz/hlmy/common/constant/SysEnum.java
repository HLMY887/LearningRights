package xyz.hlmy.common.constant;

/**
 * @ProjectName: LearningRights
 * @ClassName: SysEnum
 * @Author: lipenghui
 * @Description: 系统枚举
 * @Date: 2022/11/11 16:30
 */
public enum SysEnum {

    //删除状态
    DELETE(0, "已删除"),
    NOT_DELETE(1, "未删除"),
    //菜单状态
    SHOW(0, "显示"),
    HIDE(1, "隐藏"),
    //性别状态
    UNKNOWN(0, "未知"),
    MAN(1, "男"),
    WOMAN(2, "女"),
    //权限状态
    NOT_LOGIN(4001, "未登录"),
    NOT_PERMISSION(4002, "无权限访问"),
    TOKEN_INVALID(4003, "TOKEN失效"),
    ;
    final Integer code;
    final String desc;

    SysEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public Integer getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
