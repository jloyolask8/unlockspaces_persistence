package com.unlock.spaces.persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SpaceType implements Serializable {

    @Basic
    private String name;
    @Basic
    private String details;
    @Id
    private String id;

    public SpaceType() {

    }
   
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public String getDetails() {
        return this.details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
   
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
