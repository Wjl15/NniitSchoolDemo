package com.wei.onlinemall.util;

/**
 * @Author WeiJinLong
 * @Date 2022-09-22 14:44
 */

    public enum Code {

        RC200(200, "操作成功"),
        RC500(500, "操作失败");

        // 自定义状态码
        private final int code;

        // 自定义描述
        private final String msg;

           Code(int code, String msg){
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }
    }


