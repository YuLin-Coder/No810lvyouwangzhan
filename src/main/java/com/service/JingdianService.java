package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JingdianEntity;
import java.util.Map;

/**
 * 景点 服务类
 * @author 
 * @since 2021-04-03
 */
public interface JingdianService extends IService<JingdianEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}