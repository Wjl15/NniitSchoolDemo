package com.wei.onlinemall.service.impl;

import com.wei.onlinemall.dao.OrderBaseRepository;
import com.wei.onlinemall.pogo.po.OrderBasePO;
import com.wei.onlinemall.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author WeiJinLong
 * @Date 2022-09-29 21:40
 */
@Service
public class OrderServiceImpl implements IOrderService {
    private OrderBaseRepository orderBaseRepository;

    @Autowired
    public void setOrderBaseRepository(OrderBaseRepository orderBaseRepository) {
        this.orderBaseRepository = orderBaseRepository;
    }

    @Override
    public OrderBasePO getOrderbaseById(String orderid) {
        return orderBaseRepository.getById(orderid);
    }
}
