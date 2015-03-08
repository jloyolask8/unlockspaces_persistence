package com.unlock.spaces.persistence;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Country implements Serializable {

    @Basic
    private String personIDName;
    @OneToMany(targetEntity = City.class,mappedBy = "country")
    private Collection<City> cities;
    @Basic
    private String name;
    @Basic
    private String idRegex;
    @Id
    private String id_code;

    public Country() {

    }
   
    public String getPersonIDName() {
        return this.personIDName;
    }

    public void setPersonIDName(String personIDName) {
        this.personIDName = personIDName;
    }
   
    public Collection<City> getCities() {
        return this.cities;
    }

    public void setCities(Collection<City> cities) {
        this.cities = cities;
    }
   
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public String getIdRegex() {
        return this.idRegex;
    }

    public void setIdRegex(String idRegex) {
        this.idRegex = idRegex;
    }
   
    public String getId_code() {
        return this.id_code;
    }

    public void setId_code(String id_code) {
        this.id_code = id_code;
    }
}
