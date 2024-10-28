package com.dao;

import com.entity.JingdianLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JingdianLiuyanView;

/**
 * 景点评价 Dao 接口
 *
 * @author 
 * @since 2021-04-03
 */
public interface JingdianLiuyanDao extends BaseMapper<JingdianLiuyanEntity> {

   List<JingdianLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
