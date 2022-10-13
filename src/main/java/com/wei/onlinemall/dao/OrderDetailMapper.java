package com.wei.onlinemall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wei.onlinemall.pogo.po.OrderDetailPO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 15415
 */
@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetailPO> {
}
