package com.entity.model;

import com.entity.FeijipiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 飞机票
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-03
 */
public class FeijipiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 飞机班次
     */
    private String feijipiaoName;


    /**
     * 飞机
     */
    private Integer feijiTypes;


    /**
     * 飞机型号
     */
    private Integer feijipiaoXinghaoTypes;


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
	 * 获取：飞机班次
	 */
    public String getFeijipiaoName() {
        return feijipiaoName;
    }


    /**
	 * 设置：飞机班次
	 */
    public void setFeijipiaoName(String feijipiaoName) {
        this.feijipiaoName = feijipiaoName;
    }
    /**
	 * 获取：飞机
	 */
    public Integer getFeijiTypes() {
        return feijiTypes;
    }


    /**
	 * 设置：飞机
	 */
    public void setFeijiTypes(Integer feijiTypes) {
        this.feijiTypes = feijiTypes;
    }
    /**
	 * 获取：飞机型号
	 */
    public Integer getFeijipiaoXinghaoTypes() {
        return feijipiaoXinghaoTypes;
    }


    /**
	 * 设置：飞机型号
	 */
    public void setFeijipiaoXinghaoTypes(Integer feijipiaoXinghaoTypes) {
        this.feijipiaoXinghaoTypes = feijipiaoXinghaoTypes;
    }
    /**
	 * 获取：出发地
	 */
    public String getFeijipiaoChufadi() {
        return feijipiaoChufadi;
    }


    /**
	 * 设置：出发地
	 */
    public void setFeijipiaoChufadi(String feijipiaoChufadi) {
        this.feijipiaoChufadi = feijipiaoChufadi;
    }
    /**
	 * 获取：目的地
	 */
    public String getFeijipiaoMudidi() {
        return feijipiaoMudidi;
    }


    /**
	 * 设置：目的地
	 */
    public void setFeijipiaoMudidi(String feijipiaoMudidi) {
        this.feijipiaoMudidi = feijipiaoMudidi;
    }
    /**
	 * 获取：飞机照片
	 */
    public String getFeijipiaoPhoto() {
        return feijipiaoPhoto;
    }


    /**
	 * 设置：飞机照片
	 */
    public void setFeijipiaoPhoto(String feijipiaoPhoto) {
        this.feijipiaoPhoto = feijipiaoPhoto;
    }
    /**
	 * 获取：出发时间
	 */
    public String getFeijipiaoTime() {
        return feijipiaoTime;
    }


    /**
	 * 设置：出发时间
	 */
    public void setFeijipiaoTime(String feijipiaoTime) {
        this.feijipiaoTime = feijipiaoTime;
    }
    /**
	 * 获取：票价
	 */
    public Integer getFeijipiaoNewMoney() {
        return feijipiaoNewMoney;
    }


    /**
	 * 设置：票价
	 */
    public void setFeijipiaoNewMoney(Integer feijipiaoNewMoney) {
        this.feijipiaoNewMoney = feijipiaoNewMoney;
    }
    /**
	 * 获取：飞机票详情
	 */
    public String getFeijipiaoContent() {
        return feijipiaoContent;
    }


    /**
	 * 设置：飞机票详情
	 */
    public void setFeijipiaoContent(String feijipiaoContent) {
        this.feijipiaoContent = feijipiaoContent;
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
