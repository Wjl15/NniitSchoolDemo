package com.wei.onlinemall.dao;

import com.wei.onlinemall.pogo.po.OrderBasePO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author 15415
 */
public interface OrderBaseRepository extends JpaRepository<OrderBasePO,String> {
    @Query("select a from OrderBasePO a where a.status =:st")
    List<OrderBasePO> getByStatus(@Param("st") boolean status);
}
