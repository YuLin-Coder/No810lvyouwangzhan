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
 * 火车票
 *
 * @author 
 * @email
 * @date 2021-04-03
 */
@TableName("huochepiao")
public class HuochepiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public HuochepiaoEntity() {

	}

	public HuochepiaoEntity(T t) {
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
     * 火车班次
     */
    @TableField(value = "huochepiao_name")

    private String huochepiaoName;


    /**
     * 火车
     */
    @TableField(value = "huochepiao_types")

    private Integer huochepiaoTypes;


    /**
     * 火车型号
     */
    @TableField(value = "huochepiao_xinghao_types")

    private Integer huochepiaoXinghaoTypes;


    /**
     * 出发地
     */
    @TableField(value = "huochepiao_chufadi")

    private String huochepiaoChufadi;


    /**
     * 目的地
     */
    @TableField(value = "huochepiao_mudidi")

    private String huochepiaoMudidi;


    /**
     * 飞机照片
     */
    @TableField(value = "huochepiao_photo")

    private String huochepiaoPhoto;


    /**
     * 出发时间
     */
    @TableField(value = "huochepiao_time")

    private String huochepiaoTime;


    /**
     * 票价
     */
    @TableField(value = "huochepiao_new_money")

    private Integer huochepiaoNewMoney;


    /**
     * 火车票详情
     */
    @TableField(value = "huochepiao_content")

    private String huochepiaoContent;


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
	 * 设置：火车班次
	 */
    public String getHuochepiaoName() {
        return huochepiaoName;
    }


    /**
	 * 获取：火车班次
	 */

    public void setHuochepiaoName(String huochepiaoName) {
        this.huochepiaoName = huochepiaoName;
    }
    /**
	 * 设置：火车
	 */
    public Integer getHuochepiaoTypes() {
        return huochepiaoTypes;
    }


    /**
	 * 获取：火车
	 */

    public void setHuochepiaoTypes(Integer huochepiaoTypes) {
        this.huochepiaoTypes = huochepiaoTypes;
    }
    /**
	 * 设置：火车型号
	 */
    public Integer getHuochepiaoXinghaoTypes() {
        return huochepiaoXinghaoTypes;
    }


    /**
	 * 获取：火车型号
	 */

    public void setHuochepiaoXinghaoTypes(Integer huochepiaoXinghaoTypes) {
        this.huochepiaoXinghaoTypes = huochepiaoXinghaoTypes;
    }
    /**
	 * 设置：出发地
	 */
    public String getHuochepiaoChufadi() {
        return huochepiaoChufadi;
    }


    /**
	 * 获取：出发地
	 */

    public void setHuochepiaoChufadi(String huochepiaoChufadi) {
        this.huochepiaoChufadi = huochepiaoChufadi;
    }
    /**
	 * 设置：目的地
	 */
    public String getHuochepiaoMudidi() {
        return huochepiaoMudidi;
    }


    /**
	 * 获取：目的地
	 */

    public void setHuochepiaoMudidi(String huochepiaoMudidi) {
        this.huochepiaoMudidi = huochepiaoMudidi;
    }
    /**
	 * 设置：飞机照片
	 */
    public String getHuochepiaoPhoto() {
        return huochepiaoPhoto;
    }


    /**
	 * 获取：飞机照片
	 */

    public void setHuochepiaoPhoto(String huochepiaoPhoto) {
        this.huochepiaoPhoto = huochepiaoPhoto;
    }
    /**
	 * 设置：出发时间
	 */
    public String getHuochepiaoTime() {
        return huochepiaoTime;
    }


    /**
	 * 获取：出发时间
	 */

    public void setHuochepiaoTime(String huochepiaoTime) {
        this.huochepiaoTime = huochepiaoTime;
    }
    /**
	 * 设置：票价
	 */
    public Integer getHuochepiaoNewMoney() {
        return huochepiaoNewMoney;
    }


    /**
	 * 获取：票价
	 */

    public void setHuochepiaoNewMoney(Integer huochepiaoNewMoney) {
        this.huochepiaoNewMoney = huochepiaoNewMoney;
    }
    /**
	 * 设置：火车票详情
	 */
    public String getHuochepiaoContent() {
        return huochepiaoContent;
    }


    /**
	 * 获取：火车票详情
	 */

    public void setHuochepiaoContent(String huochepiaoContent) {
        this.huochepiaoContent = huochepiaoContent;
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
        return "Huochepiao{" +
            "id=" + id +
            ", huochepiaoName=" + huochepiaoName +
            ", huochepiaoTypes=" + huochepiaoTypes +
            ", huochepiaoXinghaoTypes=" + huochepiaoXinghaoTypes +
            ", huochepiaoChufadi=" + huochepiaoChufadi +
            ", huochepiaoMudidi=" + huochepiaoMudidi +
            ", huochepiaoPhoto=" + huochepiaoPhoto +
            ", huochepiaoTime=" + huochepiaoTime +
            ", huochepiaoNewMoney=" + huochepiaoNewMoney +
            ", huochepiaoContent=" + huochepiaoContent +
            ", createTime=" + createTime +
        "}";
    }
}
