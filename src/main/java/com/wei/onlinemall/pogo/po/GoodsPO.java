package com.wei.onlinemall.pogo.po;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2022-09-22 16:37
 */

@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Builder

@Table(name = "goodstable")
public class GoodsPO implements Serializable {
    @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "goods_id")
    private String goods_id;

    @Column(name = "gname")
    private String gname;

    @Column(name = "goprice")
    private double goprice;

    @Column(name = "grprice")
    private double grprice;

    @Column(name = "gpicture")
    private String gpricture;

    @Column(name = "gstore")
    private String gstore;

    @Column(name = "isRecommend")
    private String isRecommend;

    @Column(name = "isAdvertisement")
    private String isAdvertisement;

//    @Column(name = "goodstype_id")
//    private String goodstypeid;


//    @OneToOne(
//            optional = true,
//            fetch = FetchType.LAZY,
//            targetEntity = GoodsTypePO.class,
//            cascade = CascadeType.ALL
//    )
//    @JoinColumn(
//            name = "goodstype_id",
//            referencedColumnName = "goodstype_id",
//            unique = true
//    )

    @ManyToOne(
            cascade = {CascadeType.MERGE , CascadeType.REFRESH},
            optional = false
    )
    @JoinColumn(name = "goodstype_id")
    @JsonIgnore
    private GoodsTypePO goodsType;


    @ManyToMany(mappedBy = "goods")
    @JsonIgnore
    private List<OrderBasePO> orderBases;
}

