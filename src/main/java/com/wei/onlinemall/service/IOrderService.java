package com.wei.onlinemall.service;

import com.wei.onlinemall.pogo.po.OrderBasePO;

import java.util.List;

/**
 * @author 15415
 */
public interface IOrderService {
    OrderBasePO getOrderbaseById(String orderid);

    List<OrderBasePO> getOrderByStatus(boolean status);
}
