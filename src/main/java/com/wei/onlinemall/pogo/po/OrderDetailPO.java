package com.wei.onlinemall.pogo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


import java.io.Serializable;

/**
 * @Author WeiJinLong
 * @Date 2022-09-29 16:14
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Builder

@TableName("orderdetail")
public class OrderDetailPO implements Serializable {
    @TableId(value = "order_detail_id" ,type = IdType.AUTO)
    private  String order_detail_id;
    private String orderbasetable_id;
    private String goodstable_id;
    private int shoppingnum;

}
