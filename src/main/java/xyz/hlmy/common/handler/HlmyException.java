package xyz.hlmy.common.handler;

import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.exception.NotPermissionException;
import cn.dev33.satoken.exception.NotRoleException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import xyz.hlmy.common.constant.Constant;
import xyz.hlmy.common.util.R;

import java.util.List;

/**
 * @ProjectName: LearningRights
 * @ClassName: HlmyException
 * @Author: lipenghui
 * @Description: 统一异常处理
 * @Date: 2022/11/11 15:46
 */
@RestControllerAdvice
public class HlmyException {
    private final Logger logger = LoggerFactory.getLogger(HlmyException.class);

    @ExceptionHandler(Exception.class)
    public String handlerException(Exception e) {
        logger.error("全局异常捕获，异常消息:" + e.getMessage());
        return R.err(Constant.SYS_ERROR);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public String handlerMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        logger.error("校验参数异常:" + e.getMessage());
        List<FieldError> fieldErrors = e.getBindingResult().getFieldErrors();
        return R.err(Constant.REQUEST_PARAMS_ERROR, fieldErrors.get(0).getDefaultMessage());
    }

    @ExceptionHandler(NotLoginException.class)
    public String handlerNotLoginException(NotLoginException e) {
        logger.error("登录失效异常:" + e.getMessage());
        return R.err(Constant.NOT_LOGIN);
    }

    @ExceptionHandler(NotPermissionException.class)
    public String handlerNotPermissionException(NotPermissionException e) {
        logger.error("权限不足异常:" + e.getMessage());
        return R.err(Constant.NOT_PERMISSION);
    }

    @ExceptionHandler(BusinessException.class)
    public String handlerBusinessException(BusinessException e) {
        logger.error("业务逻辑异常: " + e.getMessage());
        return R.err(e.getErrorCode(), e.getMessage());
    }

    @ExceptionHandler(NotRoleException.class)
    public String handlerNotRoleException(NotRoleException e) {
        logger.error("角色未知异常: " + e.getMessage());
        return R.err(Constant.NOT_ROLE, e.getMessage());
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    public String validExceptionHandler(HttpMessageNotReadableException e) {
        logger.error("请求异常: " + e.getMessage());
        return R.err(Constant.REQUEST_ERROR);
    }
}
