package com.dao;

import com.entity.HuochepiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuochepiaoView;

/**
 * 火车票 Dao 接口
 *
 * @author 
 * @since 2021-04-03
 */
public interface HuochepiaoDao extends BaseMapper<HuochepiaoEntity> {

   List<HuochepiaoView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
