package com.wei.onlinemall.service.impl;

import com.wei.onlinemall.dao.GoodsRepository;
import com.wei.onlinemall.dao.GoodsTypeRepository;
import com.wei.onlinemall.pogo.po.GoodsPO;
import com.wei.onlinemall.pogo.po.GoodsTypePO;
import com.wei.onlinemall.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.Id;
import java.util.Collections;
import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2022-09-22 16:40
 */
@Service

public class GoodsServiceImpl implements IGoodsService {

    private GoodsRepository goodsRepository;
    private GoodsTypeRepository goodsTypeRepository;
    @Autowired
    public void setGoodsService(GoodsRepository goodsRepository) {
        this.goodsRepository = goodsRepository;
    }
    @Autowired
    public void setGoodsTypeRepository(GoodsTypeRepository goodsTypeRepository) {
        this.goodsTypeRepository = goodsTypeRepository;
    }

    @Override
    public Page<GoodsPO> getAllGoods(int page , int size) {
        return goodsRepository.findAll(PageRequest.of(page-1,size));
    }

    @Override
    public List<GoodsPO> findGoodsById(String id) {
        return goodsRepository.findAllById(Collections.singleton(id));
    }

    @Override
    public List<GoodsPO> deleteGoodsById(String id) {
        goodsRepository.deleteById(id);
        return goodsRepository.findAll();

    }

    @Override
    public List<GoodsPO> addCategory(GoodsPO goods) {
        goodsRepository.save(goods);
        return goodsRepository.findAll();
    }

    @Override
    public List<GoodsPO> getGoodsByPrice(double price) {
        return goodsRepository.findByGrpriceLessThan(price);
    }

    @Override
    public GoodsTypePO getGoodsByType(String typeid) {
        return goodsTypeRepository.getById(typeid);
    }


}



