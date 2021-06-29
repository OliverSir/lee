package com.car.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (CarCity)实体类
 *
 * @author makejava
 * @since 2021-06-13 21:23:18
 */
public class CarCity implements Serializable {
    private static final long serialVersionUID = -92044961926316411L;
    
    private Long cityid;
    
    private String cityname;
    
    private String zipcode;
    
    private Long provinceid;
    
    private Date datecreated;
    
    private Date dateupdated;


    public Long getCityid() {
        return cityid;
    }

    public void setCityid(Long cityid) {
        this.cityid = cityid;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Long getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Long provinceid) {
        this.provinceid = provinceid;
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