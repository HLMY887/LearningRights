package xyz.hlmy.common.constant;

/**
 * @ProjectName: LearningRights
 * @ClassName: Constant
 * @Author: lipenghui
 * @Description: 信息常量
 * @Date: 2022/11/11 15:08
 */
public enum Constant {
    SUCCESS(200),

    REQUEST_PARAMS_ERROR(1002),
    NOT_LOGIN(1003),
    NOT_PERMISSION(1004),
    NOT_ROLE(1005),
    REQUEST_ERROR(1006),

    SYS_ERROR(9000),
    ;
    private final Integer code;

    Constant(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }
}
