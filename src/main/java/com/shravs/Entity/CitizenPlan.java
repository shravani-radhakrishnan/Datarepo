package com.shravs.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class CitizenPlan {
    //    Primary key and by using generate we are generating unique values
    //    For Oracle Sequence generator and for mysql Identity is used
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer citizenId;
    private String name;
    private String email;
    private String gender;
    private Long Phno;
    private Long ssn;
    private String PlanName;
    private String PlaneStatus;
    private LocalDate planStartDate;
    private LocalDate planEndDate;

    //    default constructor
    public CitizenPlan(){

    }
    //    parameter constructor
    public CitizenPlan(String name, String email, String gender, Long phno, Long ssn, String planName, String planeStatus, LocalDate planStartDate, LocalDate planEndDate) {
        this.name = name;
        this.email = email;
        this.gender = gender;
        Phno = phno;
        this.ssn = ssn;
        PlanName = planName;
        PlaneStatus = planeStatus;
        this.planStartDate = planStartDate;
        this.planEndDate = planEndDate;
    }
    //    setter and getters

    public Integer getCitizenId() {
        return citizenId;
    }

    public void setCitizenId(Integer citizenId) {
        this.citizenId = citizenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getPhno() {
        return Phno;
    }

    public void setPhno(Long phno) {
        Phno = phno;
    }

    public Long getSsn() {
        return ssn;
    }

    public void setSsn(Long ssn) {
        this.ssn = ssn;
    }

    public String getPlanName() {
        return PlanName;
    }

    public void setPlanName(String planName) {
        PlanName = planName;
    }

    public String getPlaneStatus() {
        return PlaneStatus;
    }

    public void setPlaneStatus(String planeStatus) {
        PlaneStatus = planeStatus;
    }

    public LocalDate getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(LocalDate planStartDate) {
        this.planStartDate = planStartDate;
    }

    public LocalDate getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(LocalDate planEndDate) {
        this.planEndDate = planEndDate;
    }
}
