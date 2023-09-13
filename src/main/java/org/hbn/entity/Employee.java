package org.hbn.entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "mirza_employee")
public class Employee implements Serializable {

    public Employee() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "fname")
    private String fname;
    @Column
    private String lname;
    @Column
    private String nationalCode;

    public Employee(String fname, String lname, String nationalCode) {
        this.fname = fname;
        this.lname = lname;
        this.nationalCode = nationalCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }
}
