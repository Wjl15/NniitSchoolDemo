package com.wei.onlinemall.pogo.po;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.naming.Name;
import javax.persistence.*;
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
@Entity
@Builder
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
@Table(name = "orderbasetable")
public class OrderBasePO implements Serializable {
    @Id
    private  String order_id;
    private  String busertable_id;
    private double amount;
    private boolean status;
    private Timestamp orderdate;

    @ManyToMany
            @JoinTable(
                    name = "orderdetail",
                    joinColumns = @JoinColumn(name = "orderbasetable_id"),
                    inverseJoinColumns = @JoinColumn(name = "goodstable_id")
    )
    private List<GoodsPO> goods;

}
