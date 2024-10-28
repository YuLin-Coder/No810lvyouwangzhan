package com.entity.model;

import com.entity.JiudianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 酒店
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-03
 */
public class JiudianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 酒店名称
     */
    private String jiudianName;


    /**
     * 酒店星级
     */
    private Integer jiudianTypes;


    /**
     * 酒店位置
     */
    private String jiudianWeizhi;


    /**
     * 酒店缩略图
     */
    private String jiudianPhoto;


    /**
     * 单价
     */
    private Integer jiudianNewMoney;


    /**
     * 酒店详情
     */
    private String jiudianContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：酒店名称
	 */
    public String getJiudianName() {
        return jiudianName;
    }


    /**
	 * 设置：酒店名称
	 */
    public void setJiudianName(String jiudianName) {
        this.jiudianName = jiudianName;
    }
    /**
	 * 获取：酒店星级
	 */
    public Integer getJiudianTypes() {
        return jiudianTypes;
    }


    /**
	 * 设置：酒店星级
	 */
    public void setJiudianTypes(Integer jiudianTypes) {
        this.jiudianTypes = jiudianTypes;
    }
    /**
	 * 获取：酒店位置
	 */
    public String getJiudianWeizhi() {
        return jiudianWeizhi;
    }


    /**
	 * 设置：酒店位置
	 */
    public void setJiudianWeizhi(String jiudianWeizhi) {
        this.jiudianWeizhi = jiudianWeizhi;
    }
    /**
	 * 获取：酒店缩略图
	 */
    public String getJiudianPhoto() {
        return jiudianPhoto;
    }


    /**
	 * 设置：酒店缩略图
	 */
    public void setJiudianPhoto(String jiudianPhoto) {
        this.jiudianPhoto = jiudianPhoto;
    }
    /**
	 * 获取：单价
	 */
    public Integer getJiudianNewMoney() {
        return jiudianNewMoney;
    }


    /**
	 * 设置：单价
	 */
    public void setJiudianNewMoney(Integer jiudianNewMoney) {
        this.jiudianNewMoney = jiudianNewMoney;
    }
    /**
	 * 获取：酒店详情
	 */
    public String getJiudianContent() {
        return jiudianContent;
    }


    /**
	 * 设置：酒店详情
	 */
    public void setJiudianContent(String jiudianContent) {
        this.jiudianContent = jiudianContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
