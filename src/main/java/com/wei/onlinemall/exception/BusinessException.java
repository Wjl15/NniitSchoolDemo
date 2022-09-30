package com.wei.onlinemall.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @Author Wei0JinLong
 * @Date 2022-09-22 14:04
 */

public class BusinessException extends Exception{
    public BusinessException() {
    }
    public BusinessException(String message) {
        super(message);
    }
}
