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
 * 酒店
 *
 * @author 
 * @email
 * @date 2021-04-03
 */
@TableName("jiudian")
public class JiudianEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiudianEntity() {

	}

	public JiudianEntity(T t) {
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
     * 酒店名称
     */
    @TableField(value = "jiudian_name")

    private String jiudianName;


    /**
     * 酒店星级
     */
    @TableField(value = "jiudian_types")

    private Integer jiudianTypes;


    /**
     * 酒店位置
     */
    @TableField(value = "jiudian_weizhi")

    private String jiudianWeizhi;


    /**
     * 酒店缩略图
     */
    @TableField(value = "jiudian_photo")

    private String jiudianPhoto;


    /**
     * 单价
     */
    @TableField(value = "jiudian_new_money")

    private Integer jiudianNewMoney;


    /**
     * 酒店详情
     */
    @TableField(value = "jiudian_content")

    private String jiudianContent;


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
	 * 设置：酒店名称
	 */
    public String getJiudianName() {
        return jiudianName;
    }


    /**
	 * 获取：酒店名称
	 */

    public void setJiudianName(String jiudianName) {
        this.jiudianName = jiudianName;
    }
    /**
	 * 设置：酒店星级
	 */
    public Integer getJiudianTypes() {
        return jiudianTypes;
    }


    /**
	 * 获取：酒店星级
	 */

    public void setJiudianTypes(Integer jiudianTypes) {
        this.jiudianTypes = jiudianTypes;
    }
    /**
	 * 设置：酒店位置
	 */
    public String getJiudianWeizhi() {
        return jiudianWeizhi;
    }


    /**
	 * 获取：酒店位置
	 */

    public void setJiudianWeizhi(String jiudianWeizhi) {
        this.jiudianWeizhi = jiudianWeizhi;
    }
    /**
	 * 设置：酒店缩略图
	 */
    public String getJiudianPhoto() {
        return jiudianPhoto;
    }


    /**
	 * 获取：酒店缩略图
	 */

    public void setJiudianPhoto(String jiudianPhoto) {
        this.jiudianPhoto = jiudianPhoto;
    }
    /**
	 * 设置：单价
	 */
    public Integer getJiudianNewMoney() {
        return jiudianNewMoney;
    }


    /**
	 * 获取：单价
	 */

    public void setJiudianNewMoney(Integer jiudianNewMoney) {
        this.jiudianNewMoney = jiudianNewMoney;
    }
    /**
	 * 设置：酒店详情
	 */
    public String getJiudianContent() {
        return jiudianContent;
    }


    /**
	 * 获取：酒店详情
	 */

    public void setJiudianContent(String jiudianContent) {
        this.jiudianContent = jiudianContent;
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
        return "Jiudian{" +
            "id=" + id +
            ", jiudianName=" + jiudianName +
            ", jiudianTypes=" + jiudianTypes +
            ", jiudianWeizhi=" + jiudianWeizhi +
            ", jiudianPhoto=" + jiudianPhoto +
            ", jiudianNewMoney=" + jiudianNewMoney +
            ", jiudianContent=" + jiudianContent +
            ", createTime=" + createTime +
        "}";
    }
}
