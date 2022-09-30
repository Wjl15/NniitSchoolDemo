package com.wei.onlinemall.service;

import com.wei.onlinemall.pogo.po.OrderBasePO;

/**
 * @author 15415
 */
public interface IOrderService {
    OrderBasePO getOrderbaseById(String orderid);
}
