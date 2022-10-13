package com.wei.onlinemall.service;

import com.wei.onlinemall.pogo.po.GoodsPO;
import com.wei.onlinemall.pogo.po.GoodsTypePO;


import java.util.List;

public interface IGoodsService {
    List<GoodsPO> getAllGoods();

    List<GoodsPO> getGoodsByPrice(double price);

    GoodsTypePO getGoodsByType(String typeid);
}

