package com.nestdigital.xyzCollegebackendapp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "students")
@Entity

public class StudentModel {

@Id
@GeneratedValue
    public  int id;
    public String Email;
    public int pMobile;
    public String gAddress;
    public String gname;
    public String dob;
    public String blood;
    public String department;
    public String college;
    public int rollno;
    public String name;
    public int Admission;


    public StudentModel(int id, String email, int pMobile, String gAddress, String gname, String dob, String blood, String department, String college, int rollno, String name, int admission) {
        this.id = id;
        Email = email;
        this.pMobile = pMobile;
        this.gAddress = gAddress;
        this.gname = gname;
        this.dob = dob;
        this.blood = blood;
        this.department = department;
        this.college = college;
        this.rollno = rollno;
        this.name = name;
        Admission = admission;
    }

    public StudentModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getpMobile() {
        return pMobile;
    }

    public void setpMobile(int pMobile) {
        this.pMobile = pMobile;
    }

    public String getgAddress() {
        return gAddress;
    }

    public void setgAddress(String gAddress) {
        this.gAddress = gAddress;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAdmission() {
        return Admission;
    }

    public void setAdmission(int admission) {
        Admission = admission;
    }
}
