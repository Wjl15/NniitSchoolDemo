package com.wei.onlinemall.pogo;

import lombok.*;

/**
 * @Author WeiJinLong
 * @Date 2022-09-15 15:35
 */

@Setter
@Getter
@Builder
@ToString

public class Person {
    private String pname;
    private String password;
    private Integer page;
}
