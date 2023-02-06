package com.javarush.lectures.databaseschool.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Natural_person")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class NaturalPerson {
    @Id
//    @JoinColumn(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
//    @ManyToOne
    private Integer id;

    @Column(name = "fio")
    private String fio;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "gender")
    private boolean gender;

    @Column(name = "birthdate")
    private Date birthdate;

    @Column(name = "snils")
    private Integer snils;

    @Column(name = "number_phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "id_address_residence")
    private Integer addressResidence;

    @Column(name = "id_address_temporary")
    private Integer addressTemporary;

    @Column(name = "series_document")
    private String seriesDoc;

    @Column(name = "number_document")
    private Integer numberDoc;

    @Column(name = "date_issue")
    private Date dateIssue;

    @Column(name = "issued_by")
    private String issuedBy;

    @Column(name = "type_document")
    private Integer typeDoc;

    @JsonManagedReference("person")
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL)
    private List<Address> addresses;

    @JsonIgnore
    @OneToMany(mappedBy = "idKidFio")
    private List<Application> applications;


    public NaturalPerson getId() {
        return id;
    }

    public void setId(NaturalPerson id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getSnils() {
        return snils;
    }

    public void setSnils(Integer snils) {
        this.snils = snils;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAddressResidence() {
        return addressResidence;
    }

    public void setAddressResidence(Integer addressResidence) {
        this.addressResidence = addressResidence;
    }

    public Integer getAddressTemporary() {
        return addressTemporary;
    }

    public void setAddressTemporary(Integer addressTemporary) {
        this.addressTemporary = addressTemporary;
    }

    public String getSeriesDoc() {
        return seriesDoc;
    }

    public void setSeriesDoc(String seriesDoc) {
        this.seriesDoc = seriesDoc;
    }

    public Integer getNumberDoc() {
        return numberDoc;
    }

    public void setNumberDoc(Integer numberDoc) {
        this.numberDoc = numberDoc;
    }

    public Date getDateIssue() {
        return dateIssue;
    }

    public void setDateIssue(Date dateIssue) {
        this.dateIssue = dateIssue;
    }

    public String getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(String issuedBy) {
        this.issuedBy = issuedBy;
    }

    public Integer getTypeDoc() {
        return typeDoc;
    }

    public void setTypeDoc(Integer typeDoc) {
        this.typeDoc = typeDoc;
    }
}
