package com.dao;

import com.entity.JiudianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JiudianView;

/**
 * 酒店 Dao 接口
 *
 * @author 
 * @since 2021-04-03
 */
public interface JiudianDao extends BaseMapper<JiudianEntity> {

   List<JiudianView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
