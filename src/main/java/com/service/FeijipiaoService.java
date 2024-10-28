package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FeijipiaoEntity;
import java.util.Map;

/**
 * 飞机票 服务类
 * @author 
 * @since 2021-04-03
 */
public interface FeijipiaoService extends IService<FeijipiaoEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}