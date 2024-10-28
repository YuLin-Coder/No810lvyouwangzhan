package com.entity.view;

import com.entity.HuochepiaoOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 火车票订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-03
 */
@TableName("huochepiao_order")
public class HuochepiaoOrderView extends HuochepiaoOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 huochepiao
			/**
			* 火车班次
			*/
			private String huochepiaoName;
			/**
			* 火车
			*/
			private Integer huochepiaoTypes;
				/**
				* 火车的值
				*/
				private String huochepiaoValue;
			/**
			* 火车型号
			*/
			private Integer huochepiaoXinghaoTypes;
				/**
				* 火车型号的值
				*/
				private String huochepiaoXinghaoValue;
			/**
			* 出发地
			*/
			private String huochepiaoChufadi;
			/**
			* 目的地
			*/
			private String huochepiaoMudidi;
			/**
			* 飞机照片
			*/
			private String huochepiaoPhoto;
			/**
			* 出发时间
			*/
			private String huochepiaoTime;
			/**
			* 票价
			*/
			private Integer huochepiaoNewMoney;
			/**
			* 火车票详情
			*/
			private String huochepiaoContent;

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

	public HuochepiaoOrderView() {

	}

	public HuochepiaoOrderView(HuochepiaoOrderEntity huochepiaoOrderEntity) {
		try {
			BeanUtils.copyProperties(this, huochepiaoOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



















				//级联表的get和set huochepiao
					/**
					* 获取： 火车班次
					*/
					public String getHuochepiaoName() {
						return huochepiaoName;
					}
					/**
					* 设置： 火车班次
					*/
					public void setHuochepiaoName(String huochepiaoName) {
						this.huochepiaoName = huochepiaoName;
					}
					/**
					* 获取： 火车
					*/
					public Integer getHuochepiaoTypes() {
						return huochepiaoTypes;
					}
					/**
					* 设置： 火车
					*/
					public void setHuochepiaoTypes(Integer huochepiaoTypes) {
						this.huochepiaoTypes = huochepiaoTypes;
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
					* 获取： 火车型号
					*/
					public Integer getHuochepiaoXinghaoTypes() {
						return huochepiaoXinghaoTypes;
					}
					/**
					* 设置： 火车型号
					*/
					public void setHuochepiaoXinghaoTypes(Integer huochepiaoXinghaoTypes) {
						this.huochepiaoXinghaoTypes = huochepiaoXinghaoTypes;
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
					/**
					* 获取： 出发地
					*/
					public String getHuochepiaoChufadi() {
						return huochepiaoChufadi;
					}
					/**
					* 设置： 出发地
					*/
					public void setHuochepiaoChufadi(String huochepiaoChufadi) {
						this.huochepiaoChufadi = huochepiaoChufadi;
					}
					/**
					* 获取： 目的地
					*/
					public String getHuochepiaoMudidi() {
						return huochepiaoMudidi;
					}
					/**
					* 设置： 目的地
					*/
					public void setHuochepiaoMudidi(String huochepiaoMudidi) {
						this.huochepiaoMudidi = huochepiaoMudidi;
					}
					/**
					* 获取： 飞机照片
					*/
					public String getHuochepiaoPhoto() {
						return huochepiaoPhoto;
					}
					/**
					* 设置： 飞机照片
					*/
					public void setHuochepiaoPhoto(String huochepiaoPhoto) {
						this.huochepiaoPhoto = huochepiaoPhoto;
					}
					/**
					* 获取： 出发时间
					*/
					public String getHuochepiaoTime() {
						return huochepiaoTime;
					}
					/**
					* 设置： 出发时间
					*/
					public void setHuochepiaoTime(String huochepiaoTime) {
						this.huochepiaoTime = huochepiaoTime;
					}
					/**
					* 获取： 票价
					*/
					public Integer getHuochepiaoNewMoney() {
						return huochepiaoNewMoney;
					}
					/**
					* 设置： 票价
					*/
					public void setHuochepiaoNewMoney(Integer huochepiaoNewMoney) {
						this.huochepiaoNewMoney = huochepiaoNewMoney;
					}
					/**
					* 获取： 火车票详情
					*/
					public String getHuochepiaoContent() {
						return huochepiaoContent;
					}
					/**
					* 设置： 火车票详情
					*/
					public void setHuochepiaoContent(String huochepiaoContent) {
						this.huochepiaoContent = huochepiaoContent;
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
