package xyz.hlmy.common.handler;

import xyz.hlmy.common.constant.Constant;
import xyz.hlmy.common.constant.SysConstant;

/**
 * @ProjectName: LearningRights
 * @ClassName: BusinessException
 * @Author: lipenghui
 * @Description: 业务异常
 * @Date: 2022/11/11 15:57
 */
public class BusinessException extends RuntimeException{
    public Constant errorCode;

    public String errorMessage;

    public BusinessException(Constant errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BusinessException(Constant errorCode) {
        this.errorCode = errorCode;
        this.errorMessage = SysConstant.MESSAGE.get(errorCode.getCode());
    }

    public Constant getErrorCode() {
        return errorCode;
    }

}
