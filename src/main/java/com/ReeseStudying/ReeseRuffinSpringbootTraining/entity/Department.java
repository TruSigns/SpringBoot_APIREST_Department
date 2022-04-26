package com.ReeseStudying.ReeseRuffinSpringbootTraining.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
// This Entity needs a Generated value to be access
public class Department {


    //this the ID and generated component to create a random id
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long departmentID;
    private  String departmentName;
    private  String departmentAddress;
    private  String departmentCode;

    public Department() {
    }

    public Department(Long departmentID, String departmentName, String departmentAddress, String departmentCode) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
        this.departmentAddress = departmentAddress;
        this.departmentCode = departmentCode;
    }

    public Long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }
}
