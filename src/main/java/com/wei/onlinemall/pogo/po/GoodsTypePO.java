package com.wei.onlinemall.pogo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;


import java.io.Serializable;
import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2022-09-29 14:33
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@TableName("goodstype")
public class GoodsTypePO implements Serializable {
    @TableId(value = "goodstype_id" ,type = IdType.AUTO)

    private String goodstype_id;
    private String typename;



}
