package com.wei.onlinemall.service.impl;

import com.wei.onlinemall.dao.OrderBaseMapper;
import com.wei.onlinemall.pogo.po.OrderBasePO;
import com.wei.onlinemall.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2022-09-29 21:40
 */
@Service

public class OrderServiceImpl implements IOrderService {
    private OrderBaseMapper orderBaseMapper;

    @Autowired
    public void setOrderBaseMapper(OrderBaseMapper orderBaseMapper) {
        this.orderBaseMapper = orderBaseMapper;
    }

    @Override
    public OrderBasePO getOrderbaseById(String orderid) {
        return orderBaseMapper.selectById(orderid);
    }

    @Override
    public List<OrderBasePO> getOrderByStatus(boolean status) {
        return orderBaseMapper.selectList(null);
    }
}
