package com.wei.onlinemall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wei.onlinemall.pogo.po.OrderBasePO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author WeiJinLong
 * @Date 2022-10-06 16:00
 */
@Mapper
public interface OrderBaseMapper extends BaseMapper<OrderBasePO> {
}
