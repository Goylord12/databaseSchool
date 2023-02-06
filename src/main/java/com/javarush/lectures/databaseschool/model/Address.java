package com.javarush.lectures.databaseschool.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "Address")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Address {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @Column(name = "full_address")
    private String Address;

    @JsonBackReference("person")
    @ManyToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private NaturalPerson person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

}
