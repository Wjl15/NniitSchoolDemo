package com.wei.onlinemall.pogo.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;


import java.io.Serializable;
import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2022-09-22 16:37
 */


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

@TableName("goodstable")
public class GoodsPO implements Serializable {

    @TableId(value = "goods_id" ,type = IdType.AUTO)
    private String goods_id;


    private String gname;


    private double goprice;


    private double grprice;


    private String gpicture;


    private String gstore;


    private String isRecommend;


    private String isAdvertisement;



}

