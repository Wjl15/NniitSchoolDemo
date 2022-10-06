package com.wei.onlinemall.controller;

import com.wei.onlinemall.pogo.po.GoodsPO;
import com.wei.onlinemall.pogo.po.GoodsTypePO;
import com.wei.onlinemall.pogo.po.OrderBasePO;
import com.wei.onlinemall.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
//    public String getAllGoods(Model model) {
//        List<GoodsPO> goods = goodsService.getAllGoods();
//        model.addAttribute("goods", goods);
//        return "goods";
//
//    }
    public Page<GoodsPO> getAllGoods(@Param("page")int page, @Param("page")int size){
        return goodsService.getAllGoods(page,size);
    }

    @RequestMapping("/goodsById")
    public String findGoodsById(String id, Model model) {
        List<GoodsPO> goods = goodsService.findGoodsById(id);
        model.addAttribute("goods", goods);
        return "goodsid";
    }

    @RequestMapping("/deleteById")
    public String deleteGoodsById(String id, Model model) {
        List<GoodsPO> goods = goodsService.deleteGoodsById(id);
        model.addAttribute("goods", goods);
        return "deletegoods";

    }

//    @RequestMapping("/insert")
//    public String addCategory(Model model){
//        GoodsPO goods = GoodsPO.builder()
//                .goods_id("1").gname("小红").goprice(111)
//                .grprice(100).gpricture("小红图片").gstore("100")
//                .isAdvertisement("1").isRecommend("1").build();
//        goodsService.addCategory(goods);
//        List<GoodsPO> good1= goodsService.getAllGoods();
//        model.addAttribute("goods",good1);
//        return "add";
//    }

    @GetMapping("/less/{price}")
    public  List<GoodsPO> getGoodsByPriceLess( @PathVariable double price){

        return goodsService.getGoodsByPrice(price);

    }

    @GetMapping("/type/{typeid}")

    public GoodsTypePO getGoodsByType(@PathVariable String typeid){
    return goodsService.getGoodsByType(typeid);
    }


}
