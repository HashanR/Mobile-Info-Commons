package com.hashanr.microservice.commons.model;

import javax.persistence.*;

@Entity
@Table(name="subscriber")
public class SubscriberData {
    @Id
    @GeneratedValue
     private Integer MSISDN;
     private String name;

    public Integer getMSISDN() {
        return MSISDN;
    }

    public void setMSISDN(Integer MSISDN) {
        this.MSISDN = MSISDN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getConutry() {
        return country;
    }

    public void setConutry(String conutry) {
        this.country = conutry;
    }

     private String address;
     private String country;

}
