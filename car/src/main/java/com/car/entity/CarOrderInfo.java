package com.car.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 订单详情表(CarOrderInfo)实体类
 *
 * @author makejava
 * @since 2021-06-13 22:56:37
 */
public class CarOrderInfo implements Serializable {
    private static final long serialVersionUID = -21481861734917099L;
    /**
    * 主键
    */
    private Long id;
    /**
    * 订单编号
    */
    private String orderId;
    /**
    * 出发省
    */
    private Long departureProvinceId;
    /**
    * 出发市
    */
    private Long departureCityId;
    /**
    * 出发县/区
    */
    private Long departureDistrictId;
    /**
    * 具体接单地点
    */
    private String departurePlace;
    /**
    * 出发时间
    */
    private Date departureTime;
    /**
    * 是否赶火车0-不赶   1-赶
    */
    private Integer isUrgent;
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

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getDepartureProvinceId() {
        return departureProvinceId;
    }

    public void setDepartureProvinceId(Long departureProvinceId) {
        this.departureProvinceId = departureProvinceId;
    }

    public Long getDepartureCityId() {
        return departureCityId;
    }

    public void setDepartureCityId(Long departureCityId) {
        this.departureCityId = departureCityId;
    }

    public Long getDepartureDistrictId() {
        return departureDistrictId;
    }

    public void setDepartureDistrictId(Long departureDistrictId) {
        this.departureDistrictId = departureDistrictId;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    public void setDeparturePlace(String departurePlace) {
        this.departurePlace = departurePlace;
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