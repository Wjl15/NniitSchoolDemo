package com.wei.onlinemall.service.impl;

import com.wei.onlinemall.dao.GoodsMapper;
import com.wei.onlinemall.dao.GoodsTypeMapper;
import com.wei.onlinemall.pogo.po.GoodsPO;
import com.wei.onlinemall.pogo.po.GoodsTypePO;
import com.wei.onlinemall.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2022-09-22 16:40
 */
@Service

public class GoodsServiceImpl implements IGoodsService {


    private GoodsMapper goodsMapper;
    private GoodsTypeMapper goodsTypeMapper;

    @Autowired
    public void setGoodsMapper(GoodsMapper goodsMapper) {
        this.goodsMapper = goodsMapper;
    }
    @Autowired
    public void setGoodsTypeMapper(GoodsTypeMapper goodsTypeMapper) {
        this.goodsTypeMapper = goodsTypeMapper;
    }

    @Override
    public List<GoodsPO> getAllGoods() {
        return goodsMapper.selectList(null);
    }

    @Override
    public List<GoodsPO> getGoodsByPrice(double price) {
        return goodsMapper.selectList(null);
    }

    @Override
    public GoodsTypePO getGoodsByType(String typeid) {
        return goodsTypeMapper.selectOne(null);
    }


}



