package com.javarush.lectures.databaseschool.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "relatin_type")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class relatinType {
    @Id
    @JoinColumn(name = "id")
    @GeneratedValue
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private relatinType id;

    @Column(name = "value")
    private String value;

    public relatinType getId() {
        return id;
    }

    public void setId(relatinType id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
