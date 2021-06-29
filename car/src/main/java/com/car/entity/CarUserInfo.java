package com.car.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 乘客表(CarUserInfo)实体类
 *
 * @author makejava
 * @since 2021-06-13 22:57:13
 */
public class CarUserInfo implements Serializable {
    private static final long serialVersionUID = 311011879307690580L;
    
    private Long id;
    /**
    * 用户id
    */
    private Long userId;
    /**
    * 乘客姓名
    */
    private String userName;
    /**
    * 手机号
    */
    private String telphone;
    /**
    * 密码
    */
    private String passward;
    /**
    * 是否黑名单-0不是；1是
    */
    private Integer isBlacklist;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone;
    }

    public String getPassward() {
        return passward;
    }

    public void setPassward(String passward) {
        this.passward = passward;
    }

    public Integer getIsBlacklist() {
        return isBlacklist;
    }

    public void setIsBlacklist(Integer isBlacklist) {
        this.isBlacklist = isBlacklist;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}