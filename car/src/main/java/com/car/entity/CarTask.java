package com.car.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 任务发布表(CarTask)实体类
 *
 * @author makejava
 * @since 2021-06-13 22:56:58
 */
public class CarTask implements Serializable {
    private static final long serialVersionUID = 342154242913554131L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 任务ID
    */
    private String userTaskId;
    /**
    * 出发(拼接规则:PROVINCE-CITY-DISTRICT;多个用逗号分割)
    */
    private String departureProvinceId;
    /**
    * 到达(拼接规则:PROVINCE-CITY-DISTRICT;多个用逗号分割)
    */
    private String arriveProvinceId;
    /**
    * 具体接单地点
    */
    private String departurePlace;
    /**
    * 联系人
    */
    private Long userId;
    /**
    * 人数
    */
    private Long userNum;
    /**
    * 任务所属人角色0-司机   1-乘客
    */
    private Integer taskFlag;
    /**
    * 是否有大件行李0-无   1-有
    */
    private Integer largeLuggage;
    /**
    * 是否可代开车0-不可   1-不
    */
    private Integer isDriving;
    /**
    * 出发时间
    */
    private Date departureTime;
    /**
    * 是否赶火车0-不赶   1-赶
    */
    private Integer isUrgent;
    /**
    * 价格
    */
    private String price;
    /**
    * 备注
    */
    private String remarks;
    /**
    * 是否取消订单0-不取消   1-取消
    */
    private Integer cancellationFlag;
    /**
    * 删除标记0-有效  1-无效
    */
    private Integer deleteFlag;
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

    public String getUserTaskId() {
        return userTaskId;
    }

    public void setUserTaskId(String userTaskId) {
        this.userTaskId = userTaskId;
    }

    public String getDepartureProvinceId() {
        return departureProvinceId;
    }

    public void setDepartureProvinceId(String departureProvinceId) {
        this.departureProvinceId = departureProvinceId;
    }

    public String getArriveProvinceId() {
        return arriveProvinceId;
    }

    public void setArriveProvinceId(String arriveProvinceId) {
        this.arriveProvinceId = arriveProvinceId;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getUserNum() {
        return userNum;
    }

    public void setUserNum(Long userNum) {
        this.userNum = userNum;
    }

    public Integer getTaskFlag() {
        return taskFlag;
    }

    public void setTaskFlag(Integer taskFlag) {
        this.taskFlag = taskFlag;
    }

    public Integer getLargeLuggage() {
        return largeLuggage;
    }

    public void setLargeLuggage(Integer largeLuggage) {
        this.largeLuggage = largeLuggage;
    }

    public Integer getIsDriving() {
        return isDriving;
    }

    public void setIsDriving(Integer isDriving) {
        this.isDriving = isDriving;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public Integer getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(Integer isUrgent) {
        this.isUrgent = isUrgent;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getCancellationFlag() {
        return cancellationFlag;
    }

    public void setCancellationFlag(Integer cancellationFlag) {
        this.cancellationFlag = cancellationFlag;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}