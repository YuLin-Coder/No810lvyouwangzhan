package com.dao;

import com.entity.FeijipiaoCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.FeijipiaoCollectionView;

/**
 * 飞机收藏 Dao 接口
 *
 * @author 
 * @since 2021-04-03
 */
public interface FeijipiaoCollectionDao extends BaseMapper<FeijipiaoCollectionEntity> {

   List<FeijipiaoCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
