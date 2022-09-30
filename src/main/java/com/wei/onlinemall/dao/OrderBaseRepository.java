package com.wei.onlinemall.dao;

import com.wei.onlinemall.pogo.po.OrderBasePO;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author 15415
 */
public interface OrderBaseRepository extends JpaRepository<OrderBasePO,String> {
}
