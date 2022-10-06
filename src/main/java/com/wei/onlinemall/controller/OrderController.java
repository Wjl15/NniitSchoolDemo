package com.wei.onlinemall.controller;

import com.wei.onlinemall.pogo.po.OrderBasePO;
import com.wei.onlinemall.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2022-09-29 21:48
 */
@RestController

public class OrderController {
    private IOrderService orderService;
@Autowired
    public void setOrderService(IOrderService orderService) {
        this.orderService = orderService;
    }
    @GetMapping("/order/{orderid}")
    public OrderBasePO getOrderbaseById(@PathVariable String orderid){
        return orderService.getOrderbaseById(orderid);
    }

    @GetMapping("/order/status/{status}")
    public List<OrderBasePO> getOrderByStatus(@PathVariable boolean status){
    return orderService.getOrderByStatus(status);

    }
}
