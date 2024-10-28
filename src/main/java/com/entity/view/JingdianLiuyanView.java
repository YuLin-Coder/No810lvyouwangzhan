package com.entity.view;

import com.entity.JingdianLiuyanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 景点评价
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-03
 */
@TableName("jingdian_liuyan")
public class JingdianLiuyanView extends JingdianLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 jingdian
			/**
			* 景点名
			*/
			private String jingdianName;
			/**
			* 景点类型
			*/
			private Integer jingdianTypes;
				/**
				* 景点类型的值
				*/
				private String jingdianValue;
			/**
			* 景点等级
			*/
			private Integer jingdianDengjiTypes;
				/**
				* 景点等级的值
				*/
				private String jingdianDengjiValue;
			/**
			* 景点缩略图
			*/
			private String jingdianPhoto;
			/**
			* 景点特色
			*/
			private String jingdianTese;
			/**
			* 景点路线
			*/
			private String jingdianLuxian;
			/**
			* 景点详情
			*/
			private String jingdianContent;
			/**
			* 门票参考价格
			*/
			private Integer jingdianNewMoney;

		//级联表 yonghu
			/**
			* 姓名
			*/
			private String yonghuName;
			/**
			* 性别
			*/
			private Integer sexTypes;
				/**
				* 性别的值
				*/
				private String sexValue;
			/**
			* 身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 手机号
			*/
			private String yonghuPhone;
			/**
			* 照片
			*/
			private String yonghuPhoto;

	public JingdianLiuyanView() {

	}

	public JingdianLiuyanView(JingdianLiuyanEntity jingdianLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, jingdianLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




























				//级联表的get和set jingdian
					/**
					* 获取： 景点名
					*/
					public String getJingdianName() {
						return jingdianName;
					}
					/**
					* 设置： 景点名
					*/
					public void setJingdianName(String jingdianName) {
						this.jingdianName = jingdianName;
					}
					/**
					* 获取： 景点类型
					*/
					public Integer getJingdianTypes() {
						return jingdianTypes;
					}
					/**
					* 设置： 景点类型
					*/
					public void setJingdianTypes(Integer jingdianTypes) {
						this.jingdianTypes = jingdianTypes;
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
					* 获取： 景点等级
					*/
					public Integer getJingdianDengjiTypes() {
						return jingdianDengjiTypes;
					}
					/**
					* 设置： 景点等级
					*/
					public void setJingdianDengjiTypes(Integer jingdianDengjiTypes) {
						this.jingdianDengjiTypes = jingdianDengjiTypes;
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
					/**
					* 获取： 景点缩略图
					*/
					public String getJingdianPhoto() {
						return jingdianPhoto;
					}
					/**
					* 设置： 景点缩略图
					*/
					public void setJingdianPhoto(String jingdianPhoto) {
						this.jingdianPhoto = jingdianPhoto;
					}
					/**
					* 获取： 景点特色
					*/
					public String getJingdianTese() {
						return jingdianTese;
					}
					/**
					* 设置： 景点特色
					*/
					public void setJingdianTese(String jingdianTese) {
						this.jingdianTese = jingdianTese;
					}
					/**
					* 获取： 景点路线
					*/
					public String getJingdianLuxian() {
						return jingdianLuxian;
					}
					/**
					* 设置： 景点路线
					*/
					public void setJingdianLuxian(String jingdianLuxian) {
						this.jingdianLuxian = jingdianLuxian;
					}
					/**
					* 获取： 景点详情
					*/
					public String getJingdianContent() {
						return jingdianContent;
					}
					/**
					* 设置： 景点详情
					*/
					public void setJingdianContent(String jingdianContent) {
						this.jingdianContent = jingdianContent;
					}
					/**
					* 获取： 门票参考价格
					*/
					public Integer getJingdianNewMoney() {
						return jingdianNewMoney;
					}
					/**
					* 设置： 门票参考价格
					*/
					public void setJingdianNewMoney(Integer jingdianNewMoney) {
						this.jingdianNewMoney = jingdianNewMoney;
					}

























				//级联表的get和set yonghu
					/**
					* 获取： 姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 性别
					*/
					public Integer getSexTypes() {
						return sexTypes;
					}
					/**
					* 设置： 性别
					*/
					public void setSexTypes(Integer sexTypes) {
						this.sexTypes = sexTypes;
					}


						/**
						* 获取： 性别的值
						*/
						public String getSexValue() {
							return sexValue;
						}
						/**
						* 设置： 性别的值
						*/
						public void setSexValue(String sexValue) {
							this.sexValue = sexValue;
						}
					/**
					* 获取： 身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}



}
