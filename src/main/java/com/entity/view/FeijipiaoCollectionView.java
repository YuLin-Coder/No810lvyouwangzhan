package com.entity.view;

import com.entity.FeijipiaoCollectionEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;

/**
 * 飞机收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email
 * @date 2021-04-03
 */
@TableName("feijipiao_collection")
public class FeijipiaoCollectionView extends FeijipiaoCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;



		//级联表 feijipiao
			/**
			* 飞机班次
			*/
			private String feijipiaoName;
			/**
			* 飞机
			*/
			private Integer feijiTypes;
				/**
				* 飞机的值
				*/
				private String feijiValue;
			/**
			* 飞机型号
			*/
			private Integer feijipiaoXinghaoTypes;
				/**
				* 飞机型号的值
				*/
				private String feijipiaoXinghaoValue;
			/**
			* 出发地
			*/
			private String feijipiaoChufadi;
			/**
			* 目的地
			*/
			private String feijipiaoMudidi;
			/**
			* 飞机照片
			*/
			private String feijipiaoPhoto;
			/**
			* 出发时间
			*/
			private String feijipiaoTime;
			/**
			* 票价
			*/
			private Integer feijipiaoNewMoney;
			/**
			* 飞机票详情
			*/
			private String feijipiaoContent;

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

	public FeijipiaoCollectionView() {

	}

	public FeijipiaoCollectionView(FeijipiaoCollectionEntity feijipiaoCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, feijipiaoCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set feijipiao
					/**
					* 获取： 飞机班次
					*/
					public String getFeijipiaoName() {
						return feijipiaoName;
					}
					/**
					* 设置： 飞机班次
					*/
					public void setFeijipiaoName(String feijipiaoName) {
						this.feijipiaoName = feijipiaoName;
					}
					/**
					* 获取： 飞机
					*/
					public Integer getFeijiTypes() {
						return feijiTypes;
					}
					/**
					* 设置： 飞机
					*/
					public void setFeijiTypes(Integer feijiTypes) {
						this.feijiTypes = feijiTypes;
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
					* 获取： 飞机型号
					*/
					public Integer getFeijipiaoXinghaoTypes() {
						return feijipiaoXinghaoTypes;
					}
					/**
					* 设置： 飞机型号
					*/
					public void setFeijipiaoXinghaoTypes(Integer feijipiaoXinghaoTypes) {
						this.feijipiaoXinghaoTypes = feijipiaoXinghaoTypes;
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
					/**
					* 获取： 出发地
					*/
					public String getFeijipiaoChufadi() {
						return feijipiaoChufadi;
					}
					/**
					* 设置： 出发地
					*/
					public void setFeijipiaoChufadi(String feijipiaoChufadi) {
						this.feijipiaoChufadi = feijipiaoChufadi;
					}
					/**
					* 获取： 目的地
					*/
					public String getFeijipiaoMudidi() {
						return feijipiaoMudidi;
					}
					/**
					* 设置： 目的地
					*/
					public void setFeijipiaoMudidi(String feijipiaoMudidi) {
						this.feijipiaoMudidi = feijipiaoMudidi;
					}
					/**
					* 获取： 飞机照片
					*/
					public String getFeijipiaoPhoto() {
						return feijipiaoPhoto;
					}
					/**
					* 设置： 飞机照片
					*/
					public void setFeijipiaoPhoto(String feijipiaoPhoto) {
						this.feijipiaoPhoto = feijipiaoPhoto;
					}
					/**
					* 获取： 出发时间
					*/
					public String getFeijipiaoTime() {
						return feijipiaoTime;
					}
					/**
					* 设置： 出发时间
					*/
					public void setFeijipiaoTime(String feijipiaoTime) {
						this.feijipiaoTime = feijipiaoTime;
					}
					/**
					* 获取： 票价
					*/
					public Integer getFeijipiaoNewMoney() {
						return feijipiaoNewMoney;
					}
					/**
					* 设置： 票价
					*/
					public void setFeijipiaoNewMoney(Integer feijipiaoNewMoney) {
						this.feijipiaoNewMoney = feijipiaoNewMoney;
					}
					/**
					* 获取： 飞机票详情
					*/
					public String getFeijipiaoContent() {
						return feijipiaoContent;
					}
					/**
					* 设置： 飞机票详情
					*/
					public void setFeijipiaoContent(String feijipiaoContent) {
						this.feijipiaoContent = feijipiaoContent;
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
