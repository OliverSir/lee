package com.car.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (CarProvince)实体类
 *
 * @author makejava
 * @since 2021-06-13 21:24:00
 */
public class CarProvince implements Serializable {
    private static final long serialVersionUID = -25565032981641268L;
    
    private Long provinceid;
    
    private String provincename;
    
    private Date datecreated;
    
    private Date dateupdated;


    public Long getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(Long provinceid) {
        this.provinceid = provinceid;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
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