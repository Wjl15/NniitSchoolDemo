package com.wei.onlinemall.controller;

import com.wei.onlinemall.dao.GoodsRepository;
import com.wei.onlinemall.pogo.po.GoodsPO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(SpringExtension.class)
@SpringBootTest
class GoodsControllerTest {
    @Autowired
    private GoodsRepository goodsRepository;
    @Test
    void getAllGoods() {
        Iterable<GoodsPO> goodstableIt = goodsRepository.findAll();
        for (GoodsPO goodstable : goodstableIt) {
            System.out.println("产品编号:" + goodstable.getGoods_id() + "--产品名称:" + goodstable.getGname()  + "--产品原价:" + goodstable.getGoprice()+ "--产品现价:" + goodstable.getGrprice()+"--产品库存:" + goodstable.getGstore()+
                    "--产品图片:" + goodstable.getGpricture());
//                     "-" + goodstable.getGpricture()+ "-" + goodstable.getGoodstypeid()+ + "-" + goodstable.getIsAdvertisement()+ "-" + goodstable.getIsRecommend());

        }
    }
}