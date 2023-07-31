package com.test.myschool.common;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice//全局异常处理器注解
public class GlobleExceptionHandler {
    @ExceptionHandler(Exception.class)//异常处理器（此方法可以处理什么异常）,此处默认为全部
    public R handleException(Exception e){
        e.printStackTrace();
        return R.error();
    }
}
