//package com.wei.onlinemall.exception;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//import java.sql.SQLException;
//
///**
// * @Author WeiJinLong
// * @Date 2022-09-22 14:11
// */
////@ControllerAdvice
////@ResponseBody
//
//@RestControllerAdvice
//public class GlobalExceptionHandlerControllerAdvice {
//    @ExceptionHandler(value = Exception.class)
//    public String handlerException(@Autowired Exception ex){
//        if (ex instanceof SQLException){
//            return "发生了sql异常";
//        }else if (ex instanceof BusinessException){
//            return "发生了业务异常";
//        }else {
//            return "发生了未知异常";
//        }
//    }
//
//}
