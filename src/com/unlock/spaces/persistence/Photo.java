package com.unlock.spaces.persistence;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Photo implements Serializable {

    @Basic
    private String filename;
    @Basic
    private String claudinaryUrl1;
    @Basic
    private String claudinaryUrl2;
    @Basic
    private String claudinaryUrl3;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String mimeType;
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date creationDate;
    @OneToOne(targetEntity = Usuario.class)
    private Usuario uploadedBy;
    @ManyToOne(targetEntity = Space.class)
    private Space space;

    public Photo() {

    }
   
    public String getFilename() {
        return this.filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
   
    public String getClaudinaryUrl1() {
        return this.claudinaryUrl1;
    }

    public void setClaudinaryUrl1(String claudinaryUrl1) {
        this.claudinaryUrl1 = claudinaryUrl1;
    }
   
    public String getClaudinaryUrl2() {
        return this.claudinaryUrl2;
    }

    public void setClaudinaryUrl2(String claudinaryUrl2) {
        this.claudinaryUrl2 = claudinaryUrl2;
    }
   
    public String getClaudinaryUrl3() {
        return this.claudinaryUrl3;
    }

    public void setClaudinaryUrl3(String claudinaryUrl3) {
        this.claudinaryUrl3 = claudinaryUrl3;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    public String getMimeType() {
        return this.mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }
   
    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
   
    public Usuario getUploadedBy() {
        return this.uploadedBy;
    }

    public void setUploadedBy(Usuario uploadedBy) {
        this.uploadedBy = uploadedBy;
    }
   
    public Space getSpace() {
        return this.space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }
}
