package com.huyanlong.redis.controller;

import com.huyanlong.redis.responce.WebResponce;
import com.huyanlong.redis.util.WebResponceUtil;
import org.springframework.validation.BindException;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author huyanlong
 * @Date 2021/2/18 23:02
 */
@RestControllerAdvice
public class ExceptionControllerAdvice {
//    @ExceptionHandler(Exception.class)
    public WebResponce globalExceptionHandler(Exception e) {
        // 从异常对象中拿到ObjectError对象
        Object objectError = "系统内部异常";
        if (e instanceof BindException) {
            BindException notValidException = (BindException) e;
            objectError = notValidException.getBindingResult().getAllErrors().get(0);
        }
        // 然后提取错误提示信息进行返回
        return WebResponceUtil.error(null, objectError.toString());
    }

}
