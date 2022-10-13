package com.wei.onlinemall.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wei.onlinemall.pogo.po.GoodsPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 15415
 */
@Mapper
public interface GoodsMapper extends BaseMapper<GoodsPO> {
    List<GoodsPO> getAllGoods();

}
