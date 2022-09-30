package com.wei.onlinemall.pogo.po;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Author WeiJinLong
 * @Date 2022-09-29 16:14
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
@Table(name = "orderdetail")
public class OrderDetailPO implements Serializable {
    @Id
    private  String order_detail_id;
    private String orderbasetable_id;
    private String goodstable_id;
    private int shoppingnum;

}
