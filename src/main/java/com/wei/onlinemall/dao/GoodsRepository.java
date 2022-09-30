package com.wei.onlinemall.dao;

import com.wei.onlinemall.pogo.po.GoodsPO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author WeiJinLong
 * @Date 2022-09-22 16:41
 */
public interface GoodsRepository extends JpaRepository<GoodsPO, String> {
    List<GoodsPO> findByGrpriceLessThan(double price);
}
