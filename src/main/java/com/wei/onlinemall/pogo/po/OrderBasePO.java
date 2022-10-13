package com.wei.onlinemall.pogo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.naming.Name;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2022-09-29 16:13
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Builder
@TableName("orderbasetable")

public class OrderBasePO implements Serializable {
    @TableId(value = "order_id" ,type = IdType.AUTO)
    private  String order_id;
    private  String busertable_id;
    private double amount;
    private boolean status;
    private Timestamp orderdate;



}
