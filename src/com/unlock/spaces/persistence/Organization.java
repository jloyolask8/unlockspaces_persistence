package com.unlock.spaces.persistence;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Organization implements Serializable {

    @Basic
    private String name;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @OneToMany(targetEntity = Usuario.class,mappedBy = "organization")
    private Collection<Usuario> users;
    @Basic
    private String selfDescription;

    public Organization() {

    }
   
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    public Collection<Usuario> getUsers() {
        return this.users;
    }

    public void setUsers(Collection<Usuario> users) {
        this.users = users;
    }
   
    public String getSelfDescription() {
        return this.selfDescription;
    }

    public void setSelfDescription(String selfDescription) {
        this.selfDescription = selfDescription;
    }
}
