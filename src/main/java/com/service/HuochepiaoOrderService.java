package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuochepiaoOrderEntity;
import java.util.Map;

/**
 * 火车票订单 服务类
 * @author 
 * @since 2021-04-03
 */
public interface HuochepiaoOrderService extends IService<HuochepiaoOrderEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}