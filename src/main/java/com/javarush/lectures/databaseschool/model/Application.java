package com.javarush.lectures.databaseschool.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;


@Table(name = "Application")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Application {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "id_kid_fio", referencedColumnName = "id")
    private NaturalPerson idKidFio;

    @OneToMany(mappedBy="id")
    @Column(name = "id_parrent_fio")
    private NaturalPerson idParrentFio;

    @OneToOne(mappedBy = "id")
    @JoinColumn(name = "id_organization")
    private Organization idOrganization;

    @Column(name = "filing_date")
    private Date filingDate;

    @Column(name = "date_of_desired_enrollment")
    private Date dateEnrollment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NaturalPerson getIdKidFio() {
        return idKidFio;
    }

    public void setIdKidFio(NaturalPerson idKidFio) {
        this.idKidFio = idKidFio;
    }

    public NaturalPerson getIdParrentFio() {
        return idParrentFio;
    }

    public void setIdParrentFio(NaturalPerson idParrentFio) {
        this.idParrentFio = idParrentFio;
    }

    public Organization getIdOrganization() {
        return idOrganization;
    }

    public void setIdOrganization(Organization idOrganization) {
        this.idOrganization = idOrganization;
    }

    public Date getFilingDate() {
        return filingDate;
    }

    public void setFilingDate(Date filingDate) {
        this.filingDate = filingDate;
    }

    public Date getDateEnrollment() {
        return dateEnrollment;
    }

    public void setDateEnrollment(Date dateEnrollment) {
        this.dateEnrollment = dateEnrollment;
    }
}
