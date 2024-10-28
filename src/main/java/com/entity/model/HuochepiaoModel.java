package com.entity.model;

import com.entity.HuochepiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 火车票
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 * @author 
 * @email
 * @date 2021-04-03
 */
public class HuochepiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 火车班次
     */
    private String huochepiaoName;


    /**
     * 火车
     */
    private Integer huochepiaoTypes;


    /**
     * 火车型号
     */
    private Integer huochepiaoXinghaoTypes;


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
	 * 获取：火车班次
	 */
    public String getHuochepiaoName() {
        return huochepiaoName;
    }


    /**
	 * 设置：火车班次
	 */
    public void setHuochepiaoName(String huochepiaoName) {
        this.huochepiaoName = huochepiaoName;
    }
    /**
	 * 获取：火车
	 */
    public Integer getHuochepiaoTypes() {
        return huochepiaoTypes;
    }


    /**
	 * 设置：火车
	 */
    public void setHuochepiaoTypes(Integer huochepiaoTypes) {
        this.huochepiaoTypes = huochepiaoTypes;
    }
    /**
	 * 获取：火车型号
	 */
    public Integer getHuochepiaoXinghaoTypes() {
        return huochepiaoXinghaoTypes;
    }


    /**
	 * 设置：火车型号
	 */
    public void setHuochepiaoXinghaoTypes(Integer huochepiaoXinghaoTypes) {
        this.huochepiaoXinghaoTypes = huochepiaoXinghaoTypes;
    }
    /**
	 * 获取：出发地
	 */
    public String getHuochepiaoChufadi() {
        return huochepiaoChufadi;
    }


    /**
	 * 设置：出发地
	 */
    public void setHuochepiaoChufadi(String huochepiaoChufadi) {
        this.huochepiaoChufadi = huochepiaoChufadi;
    }
    /**
	 * 获取：目的地
	 */
    public String getHuochepiaoMudidi() {
        return huochepiaoMudidi;
    }


    /**
	 * 设置：目的地
	 */
    public void setHuochepiaoMudidi(String huochepiaoMudidi) {
        this.huochepiaoMudidi = huochepiaoMudidi;
    }
    /**
	 * 获取：飞机照片
	 */
    public String getHuochepiaoPhoto() {
        return huochepiaoPhoto;
    }


    /**
	 * 设置：飞机照片
	 */
    public void setHuochepiaoPhoto(String huochepiaoPhoto) {
        this.huochepiaoPhoto = huochepiaoPhoto;
    }
    /**
	 * 获取：出发时间
	 */
    public String getHuochepiaoTime() {
        return huochepiaoTime;
    }


    /**
	 * 设置：出发时间
	 */
    public void setHuochepiaoTime(String huochepiaoTime) {
        this.huochepiaoTime = huochepiaoTime;
    }
    /**
	 * 获取：票价
	 */
    public Integer getHuochepiaoNewMoney() {
        return huochepiaoNewMoney;
    }


    /**
	 * 设置：票价
	 */
    public void setHuochepiaoNewMoney(Integer huochepiaoNewMoney) {
        this.huochepiaoNewMoney = huochepiaoNewMoney;
    }
    /**
	 * 获取：火车票详情
	 */
    public String getHuochepiaoContent() {
        return huochepiaoContent;
    }


    /**
	 * 设置：火车票详情
	 */
    public void setHuochepiaoContent(String huochepiaoContent) {
        this.huochepiaoContent = huochepiaoContent;
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
