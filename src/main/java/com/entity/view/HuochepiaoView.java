package com.entity.view;

import com.entity.HuochepiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 火车票
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-03
 */
@TableName("huochepiao")
public class HuochepiaoView extends HuochepiaoEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 火车的值
		*/
		private String huochepiaoValue;
		/**
		* 火车型号的值
		*/
		private String huochepiaoXinghaoValue;



	public HuochepiaoView() {

	}

	public HuochepiaoView(HuochepiaoEntity huochepiaoEntity) {
		try {
			BeanUtils.copyProperties(this, huochepiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 火车的值
			*/
			public String getHuochepiaoValue() {
				return huochepiaoValue;
			}
			/**
			* 设置： 火车的值
			*/
			public void setHuochepiaoValue(String huochepiaoValue) {
				this.huochepiaoValue = huochepiaoValue;
			}
			/**
			* 获取： 火车型号的值
			*/
			public String getHuochepiaoXinghaoValue() {
				return huochepiaoXinghaoValue;
			}
			/**
			* 设置： 火车型号的值
			*/
			public void setHuochepiaoXinghaoValue(String huochepiaoXinghaoValue) {
				this.huochepiaoXinghaoValue = huochepiaoXinghaoValue;
			}



















}
