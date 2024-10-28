package com.dao;

import com.entity.FeijipiaoOrderEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FeijipiaoOrderView;

/**
 * 飞机订单 Dao 接口
 *
 * @author 
 * @since 2021-04-03
 */
public interface FeijipiaoOrderDao extends BaseMapper<FeijipiaoOrderEntity> {

   List<FeijipiaoOrderView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
