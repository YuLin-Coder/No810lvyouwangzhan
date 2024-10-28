package com.entity.view;

import com.entity.JingdianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 景点
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-03
 */
@TableName("jingdian")
public class JingdianView extends JingdianEntity implements Serializable {
    private static final long serialVersionUID = 1L;
		/**
		* 景点类型的值
		*/
		private String jingdianValue;
		/**
		* 景点等级的值
		*/
		private String jingdianDengjiValue;



	public JingdianView() {

	}

	public JingdianView(JingdianEntity jingdianEntity) {
		try {
			BeanUtils.copyProperties(this, jingdianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 景点类型的值
			*/
			public String getJingdianValue() {
				return jingdianValue;
			}
			/**
			* 设置： 景点类型的值
			*/
			public void setJingdianValue(String jingdianValue) {
				this.jingdianValue = jingdianValue;
			}
			/**
			* 获取： 景点等级的值
			*/
			public String getJingdianDengjiValue() {
				return jingdianDengjiValue;
			}
			/**
			* 设置： 景点等级的值
			*/
			public void setJingdianDengjiValue(String jingdianDengjiValue) {
				this.jingdianDengjiValue = jingdianDengjiValue;
			}



















}
