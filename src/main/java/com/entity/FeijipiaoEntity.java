package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 飞机票
 *
 * @author 
 * @email
 * @date 2021-04-03
 */
@TableName("feijipiao")
public class FeijipiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public FeijipiaoEntity() {

	}

	public FeijipiaoEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 飞机班次
     */
    @TableField(value = "feijipiao_name")

    private String feijipiaoName;


    /**
     * 飞机
     */
    @TableField(value = "feiji_types")

    private Integer feijiTypes;


    /**
     * 飞机型号
     */
    @TableField(value = "feijipiao_xinghao_types")

    private Integer feijipiaoXinghaoTypes;


    /**
     * 出发地
     */
    @TableField(value = "feijipiao_chufadi")

    private String feijipiaoChufadi;


    /**
     * 目的地
     */
    @TableField(value = "feijipiao_mudidi")

    private String feijipiaoMudidi;


    /**
     * 飞机照片
     */
    @TableField(value = "feijipiao_photo")

    private String feijipiaoPhoto;


    /**
     * 出发时间
     */
    @TableField(value = "feijipiao_time")

    private String feijipiaoTime;


    /**
     * 票价
     */
    @TableField(value = "feijipiao_new_money")

    private Integer feijipiaoNewMoney;


    /**
     * 飞机票详情
     */
    @TableField(value = "feijipiao_content")

    private String feijipiaoContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：飞机班次
	 */
    public String getFeijipiaoName() {
        return feijipiaoName;
    }


    /**
	 * 获取：飞机班次
	 */

    public void setFeijipiaoName(String feijipiaoName) {
        this.feijipiaoName = feijipiaoName;
    }
    /**
	 * 设置：飞机
	 */
    public Integer getFeijiTypes() {
        return feijiTypes;
    }


    /**
	 * 获取：飞机
	 */

    public void setFeijiTypes(Integer feijiTypes) {
        this.feijiTypes = feijiTypes;
    }
    /**
	 * 设置：飞机型号
	 */
    public Integer getFeijipiaoXinghaoTypes() {
        return feijipiaoXinghaoTypes;
    }


    /**
	 * 获取：飞机型号
	 */

    public void setFeijipiaoXinghaoTypes(Integer feijipiaoXinghaoTypes) {
        this.feijipiaoXinghaoTypes = feijipiaoXinghaoTypes;
    }
    /**
	 * 设置：出发地
	 */
    public String getFeijipiaoChufadi() {
        return feijipiaoChufadi;
    }


    /**
	 * 获取：出发地
	 */

    public void setFeijipiaoChufadi(String feijipiaoChufadi) {
        this.feijipiaoChufadi = feijipiaoChufadi;
    }
    /**
	 * 设置：目的地
	 */
    public String getFeijipiaoMudidi() {
        return feijipiaoMudidi;
    }


    /**
	 * 获取：目的地
	 */

    public void setFeijipiaoMudidi(String feijipiaoMudidi) {
        this.feijipiaoMudidi = feijipiaoMudidi;
    }
    /**
	 * 设置：飞机照片
	 */
    public String getFeijipiaoPhoto() {
        return feijipiaoPhoto;
    }


    /**
	 * 获取：飞机照片
	 */

    public void setFeijipiaoPhoto(String feijipiaoPhoto) {
        this.feijipiaoPhoto = feijipiaoPhoto;
    }
    /**
	 * 设置：出发时间
	 */
    public String getFeijipiaoTime() {
        return feijipiaoTime;
    }


    /**
	 * 获取：出发时间
	 */

    public void setFeijipiaoTime(String feijipiaoTime) {
        this.feijipiaoTime = feijipiaoTime;
    }
    /**
	 * 设置：票价
	 */
    public Integer getFeijipiaoNewMoney() {
        return feijipiaoNewMoney;
    }


    /**
	 * 获取：票价
	 */

    public void setFeijipiaoNewMoney(Integer feijipiaoNewMoney) {
        this.feijipiaoNewMoney = feijipiaoNewMoney;
    }
    /**
	 * 设置：飞机票详情
	 */
    public String getFeijipiaoContent() {
        return feijipiaoContent;
    }


    /**
	 * 获取：飞机票详情
	 */

    public void setFeijipiaoContent(String feijipiaoContent) {
        this.feijipiaoContent = feijipiaoContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Feijipiao{" +
            "id=" + id +
            ", feijipiaoName=" + feijipiaoName +
            ", feijiTypes=" + feijiTypes +
            ", feijipiaoXinghaoTypes=" + feijipiaoXinghaoTypes +
            ", feijipiaoChufadi=" + feijipiaoChufadi +
            ", feijipiaoMudidi=" + feijipiaoMudidi +
            ", feijipiaoPhoto=" + feijipiaoPhoto +
            ", feijipiaoTime=" + feijipiaoTime +
            ", feijipiaoNewMoney=" + feijipiaoNewMoney +
            ", feijipiaoContent=" + feijipiaoContent +
            ", createTime=" + createTime +
        "}";
    }
}
