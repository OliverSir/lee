package com.car.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单表(CarOrder)实体类
 *
 * @author makejava
 * @since 2021-06-13 22:56:21
 */
public class CarOrder implements Serializable {
    private static final long serialVersionUID = 971870449274114731L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 订单编号
    */
    private String orderId;
    /**
    * 备注
    */
    private String remarks;
    /**
    * 删除标记0有效;  1无效
    */
    private Integer deleteFlag;
    /**
    * 司机ID
    */
    private Long driverId;
    /**
    * 乘客ID
    */
    private Long userId;
    /**
    * 订单是否完成
    */
    private Integer isFinish;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Long getDriverId() {
        return driverId;
    }

    public void setDriverId(Long driverId) {
        this.driverId = driverId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getIsFinish() {
        return isFinish;
    }

    public void setIsFinish(Integer isFinish) {
        this.isFinish = isFinish;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}