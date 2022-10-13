package com.wei.onlinemall.controller;

import com.wei.onlinemall.pogo.po.GoodsPO;
import com.wei.onlinemall.pogo.po.GoodsTypePO;
import com.wei.onlinemall.pogo.po.OrderBasePO;
import com.wei.onlinemall.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2022-09-22 16:37
 */

@RestController
//@Controller
@RequestMapping("/goods")
public class GoodsController {
    private IGoodsService goodsService;


    @Autowired
    public void setGoodsService(IGoodsService goodsService){
        this.goodsService=goodsService;
    }

    @GetMapping("/findAll")

    public List<GoodsPO> getAllGoods(){
        return goodsService.getAllGoods();
    }



    @GetMapping("/less/{price}")
    public  List<GoodsPO> getGoodsByPriceLess( @PathVariable double price){

        return goodsService.getGoodsByPrice(price);

    }

    @GetMapping("/type/{typeid}")

    public GoodsTypePO getGoodsByType(@PathVariable String typeid){
    return goodsService.getGoodsByType(typeid);
    }


}
