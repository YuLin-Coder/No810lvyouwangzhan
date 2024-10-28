package com.dao;

import com.entity.HuochepiaoOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuochepiaoOrderView;

/**
 * 火车票订单 Dao 接口
 *
 * @author 
 * @since 2021-04-03
 */
public interface HuochepiaoOrderDao extends BaseMapper<HuochepiaoOrderEntity> {

   List<HuochepiaoOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
