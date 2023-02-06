package com.javarush.lectures.databaseschool.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "Organization")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Organization {
    @Id
    @JoinColumn(name = "id")
    @GeneratedValue
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private Application id;

    @Column(name = "inn")
    private Integer inn;

    @Column(name = "kpp")
    private Integer kpp;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "academic_year")
    private String academicYear;

    @Column(name = "id_address integer")
    private Integer idAddressInteger;


    public Application getId() {
        return id;
    }

    public void setId(Application id) {
        this.id = id;
    }

    public Integer getInn() {
        return inn;
    }

    public void setInn(Integer inn) {
        this.inn = inn;
    }

    public Integer getKpp() {
        return kpp;
    }

    public void setKpp(Integer kpp) {
        this.kpp = kpp;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String phone) {
        this.fullName = fullName;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    public Integer getIdAddressInteger() {
        return idAddressInteger;
    }

    public void setIdAddressInteger(Integer idAddressInteger) {
        this.idAddressInteger = idAddressInteger;
    }
}

