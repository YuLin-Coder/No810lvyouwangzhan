package com.dao;

import com.entity.JiudianCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudianCollectionView;

/**
 * 酒店收藏 Dao 接口
 *
 * @author 
 * @since 2021-04-03
 */
public interface JiudianCollectionDao extends BaseMapper<JiudianCollectionEntity> {

   List<JiudianCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
