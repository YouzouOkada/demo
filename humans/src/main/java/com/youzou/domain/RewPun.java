package com.youzou.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by 葉蔵 on 2018/4/20.
 * 奖惩记录表
 */
public class RewPun implements Serializable {
    private long rapId;//奖惩编号
    private Employee employee;//员工编号
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date rapDate;//发生时间
    private double rapMoney;//金额
    private String rapRea;//原因

    public RewPun() {
    }

    public long getRapId() {

        return rapId;
    }

    public void setRapId(long rapId) {
        this.rapId = rapId;
    }

    public Date getRapDate() {
        return rapDate;
    }

    public void setRapDate(Date rapDate) {
        this.rapDate = rapDate;
    }

    public double getRapMoney() {
        return rapMoney;
    }

    public void setRapMoney(double rapMoney) {
        this.rapMoney = rapMoney;
    }

    public String getRapRea() {
        return rapRea;
    }

    public void setRapRea(String rapRea) {
        this.rapRea = rapRea;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "RewPun{" +
                "rapId=" + rapId +
                ", employee=" + employee +
                ", rapDate=" + rapDate +
                ", rapMoney=" + rapMoney +
                ", rapRea='" + rapRea + '\'' +
                '}';
    }
}
