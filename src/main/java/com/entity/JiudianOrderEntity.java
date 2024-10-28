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
 * 酒店订单
 *
 * @author 
 * @email
 * @date 2021-04-03
 */
@TableName("jiudian_order")
public class JiudianOrderEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JiudianOrderEntity() {

	}

	public JiudianOrderEntity(T t) {
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
     * 酒店id
     */
    @TableField(value = "jiudian_id")

    private Integer jiudianId;


    /**
     * 用户id
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 预定开始时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jiudian_order_start_time",fill = FieldFill.UPDATE)

    private Date jiudianOrderStartTime;


    /**
     * 预定结束时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "jiudian_order_end_time",fill = FieldFill.UPDATE)

    private Date jiudianOrderEndTime;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
	 * 设置：酒店id
	 */
    public Integer getJiudianId() {
        return jiudianId;
    }


    /**
	 * 获取：酒店id
	 */

    public void setJiudianId(Integer jiudianId) {
        this.jiudianId = jiudianId;
    }
    /**
	 * 设置：用户id
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户id
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：预定开始时间
	 */
    public Date getJiudianOrderStartTime() {
        return jiudianOrderStartTime;
    }


    /**
	 * 获取：预定开始时间
	 */

    public void setJiudianOrderStartTime(Date jiudianOrderStartTime) {
        this.jiudianOrderStartTime = jiudianOrderStartTime;
    }
    /**
	 * 设置：预定结束时间
	 */
    public Date getJiudianOrderEndTime() {
        return jiudianOrderEndTime;
    }


    /**
	 * 获取：预定结束时间
	 */

    public void setJiudianOrderEndTime(Date jiudianOrderEndTime) {
        this.jiudianOrderEndTime = jiudianOrderEndTime;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
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
        return "JiudianOrder{" +
            "id=" + id +
            ", jiudianId=" + jiudianId +
            ", yonghuId=" + yonghuId +
            ", jiudianOrderStartTime=" + jiudianOrderStartTime +
            ", jiudianOrderEndTime=" + jiudianOrderEndTime +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
