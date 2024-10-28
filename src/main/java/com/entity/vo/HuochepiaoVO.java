package com.entity.vo;

import com.entity.HuochepiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 火车票
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-03
 */
@TableName("huochepiao")
public class HuochepiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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
