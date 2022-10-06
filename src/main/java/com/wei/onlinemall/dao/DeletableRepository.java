package com.wei.onlinemall.dao;

import com.wei.onlinemall.pogo.po.OrderBasePO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * @author 15415
 */
@NoRepositoryBean
public interface DeletableRepository extends CrudRepository<OrderBasePO,String> {
}
