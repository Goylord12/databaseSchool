package com.javarush.lectures.databaseschool.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Table(name = "Human_relations")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class HumanRelations {
    @Id
    @Column(name = "id")
    @GeneratedValue
    private Integer id;

    @OneToMany(mappedBy="id")
    @JoinColumn(name = "id_kid")
    private NaturalPerson idKid;

    @OneToMany(mappedBy="id")
    @JoinColumn(name = "id_parrent")
    private NaturalPerson idParrent;

    @OneToOne(mappedBy = "id")
    @Column(name = "id_relation_type")
    private relatinType idRelation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NaturalPerson getIdKid() {
        return idKid;
    }

    public void setIdKid(NaturalPerson idKid) {
        this.idKid = idKid;
    }

    public NaturalPerson getIdParrent() {
        return idParrent;
    }

    public void setIdParrent(NaturalPerson idParrent) {
        this.idParrent = idParrent;
    }

    public relatinType getIdRelation() {
        return idRelation;
    }

    public void setIdRelation(relatinType idRelation) {
        this.idRelation = idRelation;
    }
}
