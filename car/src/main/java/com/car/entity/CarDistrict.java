package com.car.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (CarDistrict)实体类
 *
 * @author makejava
 * @since 2021-06-13 21:23:47
 */
public class CarDistrict implements Serializable {
    private static final long serialVersionUID = -52396347658677999L;
    
    private Long districtid;
    
    private String districtname;
    
    private Long cityid;
    
    private Date datecreated;
    
    private Date dateupdated;


    public Long getDistrictid() {
        return districtid;
    }

    public void setDistrictid(Long districtid) {
        this.districtid = districtid;
    }

    public String getDistrictname() {
        return districtname;
    }

    public void setDistrictname(String districtname) {
        this.districtname = districtname;
    }

    public Long getCityid() {
        return cityid;
    }

    public void setCityid(Long cityid) {
        this.cityid = cityid;
    }

    public Date getDatecreated() {
        return datecreated;
    }

    public void setDatecreated(Date datecreated) {
        this.datecreated = datecreated;
    }

    public Date getDateupdated() {
        return dateupdated;
    }

    public void setDateupdated(Date dateupdated) {
        this.dateupdated = dateupdated;
    }

}