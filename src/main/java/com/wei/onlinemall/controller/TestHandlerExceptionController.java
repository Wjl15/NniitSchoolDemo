//package com.wei.onlinemall.controller;
//
//import com.wei.onlinemall.exception.BusinessException;
//import com.wei.onlinemall.util.Result;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.sql.SQLException;
//
///**
// * @Author WeiJinLong
// * @Date 2022-09-22 14:07
// */
//@RequestMapping("/htt")
//@RestController
//public class TestHandlerExceptionController {
//    @GetMapping("/db")
//    public void db() throws SQLException{
//        throw new SQLException();
//    }
//
//
//    @GetMapping("/business")
//    public void business() throws BusinessException {
//        throw new BusinessException();
//    }
//
//    @GetMapping("/ex")
//    public void exception() throws Exception{
//        throw new Exception();
//    }
//
//    @GetMapping("/getTest")
//    public Result<String> getTest(){
//        return Result.success("Hello world!");
////        return Result.fail(404,"sadsa");
//    }
//
//}
