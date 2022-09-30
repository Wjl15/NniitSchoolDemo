package com.wei.onlinemall.pogo.po;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
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
@Entity
@Builder
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
@Table(name = "goodstype")
public class GoodsTypePO implements Serializable {
    @Id
    private String goodstype_id;
    private String typename;

    @OneToMany(
            mappedBy = "goodsType",
            cascade = CascadeType.ALL,
            targetEntity = GoodsPO.class,
            fetch = FetchType.EAGER
    )
    private List<GoodsPO> goods;

}
