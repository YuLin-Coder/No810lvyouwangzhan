package com.entity.model;

import com.entity.JingdianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 景点
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-03
 */
public class JingdianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 景点名
     */
    private String jingdianName;


    /**
     * 景点类型
     */
    private Integer jingdianTypes;


    /**
     * 景点等级
     */
    private Integer jingdianDengjiTypes;


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
	 * 获取：景点名
	 */
    public String getJingdianName() {
        return jingdianName;
    }


    /**
	 * 设置：景点名
	 */
    public void setJingdianName(String jingdianName) {
        this.jingdianName = jingdianName;
    }
    /**
	 * 获取：景点类型
	 */
    public Integer getJingdianTypes() {
        return jingdianTypes;
    }


    /**
	 * 设置：景点类型
	 */
    public void setJingdianTypes(Integer jingdianTypes) {
        this.jingdianTypes = jingdianTypes;
    }
    /**
	 * 获取：景点等级
	 */
    public Integer getJingdianDengjiTypes() {
        return jingdianDengjiTypes;
    }


    /**
	 * 设置：景点等级
	 */
    public void setJingdianDengjiTypes(Integer jingdianDengjiTypes) {
        this.jingdianDengjiTypes = jingdianDengjiTypes;
    }
    /**
	 * 获取：景点缩略图
	 */
    public String getJingdianPhoto() {
        return jingdianPhoto;
    }


    /**
	 * 设置：景点缩略图
	 */
    public void setJingdianPhoto(String jingdianPhoto) {
        this.jingdianPhoto = jingdianPhoto;
    }
    /**
	 * 获取：景点特色
	 */
    public String getJingdianTese() {
        return jingdianTese;
    }


    /**
	 * 设置：景点特色
	 */
    public void setJingdianTese(String jingdianTese) {
        this.jingdianTese = jingdianTese;
    }
    /**
	 * 获取：景点路线
	 */
    public String getJingdianLuxian() {
        return jingdianLuxian;
    }


    /**
	 * 设置：景点路线
	 */
    public void setJingdianLuxian(String jingdianLuxian) {
        this.jingdianLuxian = jingdianLuxian;
    }
    /**
	 * 获取：景点详情
	 */
    public String getJingdianContent() {
        return jingdianContent;
    }


    /**
	 * 设置：景点详情
	 */
    public void setJingdianContent(String jingdianContent) {
        this.jingdianContent = jingdianContent;
    }
    /**
	 * 获取：门票参考价格
	 */
    public Integer getJingdianNewMoney() {
        return jingdianNewMoney;
    }


    /**
	 * 设置：门票参考价格
	 */
    public void setJingdianNewMoney(Integer jingdianNewMoney) {
        this.jingdianNewMoney = jingdianNewMoney;
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
