package com.dao;

import com.entity.HuochepiaoCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.HuochepiaoCollectionView;

/**
 * 火车票收藏 Dao 接口
 *
 * @author 
 * @since 2021-04-03
 */
public interface HuochepiaoCollectionDao extends BaseMapper<HuochepiaoCollectionEntity> {

   List<HuochepiaoCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
