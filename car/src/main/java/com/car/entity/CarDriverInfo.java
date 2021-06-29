package com.car.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 司机表(CarDriverInfo)实体类
 *
 * @author makejava
 * @since 2021-06-13 22:55:52
 */
public class CarDriverInfo implements Serializable {
    private static final long serialVersionUID = -18222256539433457L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 司机ID
    */
    private Long driverId;
    /**
    * 司机姓名
    */
    private String driverName;
    /**
    * 是否黑名单-0不是；1是
    */
    private Integer isBlacklist;
    /**
    * 手机号
    */
    private String telphone;
    /**
    * 备用手机号1
    */
    private String telphone1;
    /**
    * 备用手机号2
    */
    private String telphone2;
    /**
    * 密码
    */
    private String passward;
    /**
    * 拒接次数
    */
    private Date refuseTimes;
    /**
    * 删除标记0有效;  1无效
    */
    private String deleteFlag;
    /**
    * 创建时间
    */
    private Date createTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public Integer getIsBlacklist() {
        return isBlacklist;
    }

    public void setIsBlacklist(Integer isBlacklist) {
        this.isBlacklist = isBlacklist;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getTelphone1() {
        return telphone1;
    }

    public void setTelphone1(String telphone1) {
        this.telphone1 = telphone1;
    }

    public String getTelphone2() {
        return telphone2;
    }

    public void setTelphone2(String telphone2) {
        this.telphone2 = telphone2;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public Date getRefuseTimes() {
        return refuseTimes;
    }

    public void setRefuseTimes(Date refuseTimes) {
        this.refuseTimes = refuseTimes;
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}