package com.entity.view;

import com.entity.FeijipiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 飞机票
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-03
 */
@TableName("feijipiao")
public class FeijipiaoView extends FeijipiaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 飞机的值
		*/
		private String feijiValue;
		/**
		* 飞机型号的值
		*/
		private String feijipiaoXinghaoValue;



	public FeijipiaoView() {

	}

	public FeijipiaoView(FeijipiaoEntity feijipiaoEntity) {
		try {
			BeanUtils.copyProperties(this, feijipiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 飞机的值
			*/
			public String getFeijiValue() {
				return feijiValue;
			}
			/**
			* 设置： 飞机的值
			*/
			public void setFeijiValue(String feijiValue) {
				this.feijiValue = feijiValue;
			}
			/**
			* 获取： 飞机型号的值
			*/
			public String getFeijipiaoXinghaoValue() {
				return feijipiaoXinghaoValue;
			}
			/**
			* 设置： 飞机型号的值
			*/
			public void setFeijipiaoXinghaoValue(String feijipiaoXinghaoValue) {
				this.feijipiaoXinghaoValue = feijipiaoXinghaoValue;
			}



















}
