package com.wei.onlinemall.util;

import lombok.Data;

/**
 * @Author WeiJinLong
 * @Date 2022-09-22 14:46
 */
    @Data
    public class Result<T> {

        // 结果状态码
        private int code;

        // 响应信息
        private String msg;

        // 响应数据
        private T data;

        // 接口请求时间
        private long timestamp ;

        public Result(){
            this.timestamp = System.currentTimeMillis();
        }

        public static <T> Result<T> success(T data){
            Result result = new Result();
            result.setCode(Code.RC200.getCode());
            result.setMsg(Code.RC200.getMsg());
            result.setData(data);
            return  result;
        }

        public static <T> Result<T> fail(int code, String msg){
            Result result = new Result();
            result.setCode(code);
            result.setMsg(msg);
            return result;
        }
    }


