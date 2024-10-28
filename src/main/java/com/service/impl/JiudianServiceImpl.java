package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;

import com.dao.JiudianDao;
import com.entity.JiudianEntity;
import com.service.JiudianService;
import com.entity.view.JiudianView;

/**
 * 酒店 服务实现类
 * @author 
 * @since 2021-04-03
 */
@Service("jiudianService")
@Transactional
public class JiudianServiceImpl extends ServiceImpl<JiudianDao, JiudianEntity> implements JiudianService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<JiudianView> page =new Query<JiudianView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
