package com.entity.vo;

import com.entity.JingdianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 景点
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-04-03
 */
@TableName("jingdian")
public class JingdianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 景点名
     */

    @TableField(value = "jingdian_name")
    private String jingdianName;


    /**
     * 景点类型
     */

    @TableField(value = "jingdian_types")
    private Integer jingdianTypes;


    /**
     * 景点等级
     */

    @TableField(value = "jingdian_dengji_types")
    private Integer jingdianDengjiTypes;


    /**
     * 景点缩略图
     */

    @TableField(value = "jingdian_photo")
    private String jingdianPhoto;


    /**
     * 景点特色
     */

    @TableField(value = "jingdian_tese")
    private String jingdianTese;


    /**
     * 景点路线
     */

    @TableField(value = "jingdian_luxian")
    private String jingdianLuxian;


    /**
     * 景点详情
     */

    @TableField(value = "jingdian_content")
    private String jingdianContent;


    /**
     * 门票参考价格
     */

    @TableField(value = "jingdian_new_money")
    private Integer jingdianNewMoney;


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
	 * 设置：景点名
	 */
    public String getJingdianName() {
        return jingdianName;
    }


    /**
	 * 获取：景点名
	 */

    public void setJingdianName(String jingdianName) {
        this.jingdianName = jingdianName;
    }
    /**
	 * 设置：景点类型
	 */
    public Integer getJingdianTypes() {
        return jingdianTypes;
    }


    /**
	 * 获取：景点类型
	 */

    public void setJingdianTypes(Integer jingdianTypes) {
        this.jingdianTypes = jingdianTypes;
    }
    /**
	 * 设置：景点等级
	 */
    public Integer getJingdianDengjiTypes() {
        return jingdianDengjiTypes;
    }


    /**
	 * 获取：景点等级
	 */

    public void setJingdianDengjiTypes(Integer jingdianDengjiTypes) {
        this.jingdianDengjiTypes = jingdianDengjiTypes;
    }
    /**
	 * 设置：景点缩略图
	 */
    public String getJingdianPhoto() {
        return jingdianPhoto;
    }


    /**
	 * 获取：景点缩略图
	 */

    public void setJingdianPhoto(String jingdianPhoto) {
        this.jingdianPhoto = jingdianPhoto;
    }
    /**
	 * 设置：景点特色
	 */
    public String getJingdianTese() {
        return jingdianTese;
    }


    /**
	 * 获取：景点特色
	 */

    public void setJingdianTese(String jingdianTese) {
        this.jingdianTese = jingdianTese;
    }
    /**
	 * 设置：景点路线
	 */
    public String getJingdianLuxian() {
        return jingdianLuxian;
    }


    /**
	 * 获取：景点路线
	 */

    public void setJingdianLuxian(String jingdianLuxian) {
        this.jingdianLuxian = jingdianLuxian;
    }
    /**
	 * 设置：景点详情
	 */
    public String getJingdianContent() {
        return jingdianContent;
    }


    /**
	 * 获取：景点详情
	 */

    public void setJingdianContent(String jingdianContent) {
        this.jingdianContent = jingdianContent;
    }
    /**
	 * 设置：门票参考价格
	 */
    public Integer getJingdianNewMoney() {
        return jingdianNewMoney;
    }


    /**
	 * 获取：门票参考价格
	 */

    public void setJingdianNewMoney(Integer jingdianNewMoney) {
        this.jingdianNewMoney = jingdianNewMoney;
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
