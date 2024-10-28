package com.entity.vo;

import com.entity.JiudianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 酒店
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-03
 */
@TableName("jiudian")
public class JiudianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
