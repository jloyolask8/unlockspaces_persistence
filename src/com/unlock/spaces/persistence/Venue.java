package com.unlock.spaces.persistence;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Venue implements Serializable {

    @Embedded
    private Overview overview;
    @Embedded
    private Address address;
    @Embedded
    private ContactInfo contactInfo;
    @Basic
    private String timezone;
    @Embedded
    private HoursOfOperation hoursOfOperation;
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date creationDate;
    @OneToMany(targetEntity = Photo.class)
    private Collection<Photo> photos;
    @OneToOne(targetEntity = Photo.class)
    private Photo venueLogo;
    @ManyToOne(targetEntity = Usuario.class)
    private Usuario createdBy;
    @OneToOne(targetEntity = Organization.class)
    private Organization organization;
    @OneToMany(targetEntity = Space.class,mappedBy = "venue")
    private Collection<Space> spaces;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date lastModifDate;
    @OneToOne(targetEntity = Photo.class)
    private Photo frontPhoto;

    public Venue() {

    }
   
    public Overview getOverview() {
        return this.overview;
    }

    public void setOverview(Overview overview) {
        this.overview = overview;
    }
   
    public Address getAddress() {
        return this.address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
   
    public ContactInfo getContactInfo() {
        return this.contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
   
    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }
   
    public HoursOfOperation getHoursOfOperation() {
        return this.hoursOfOperation;
    }

    public void setHoursOfOperation(HoursOfOperation hoursOfOperation) {
        this.hoursOfOperation = hoursOfOperation;
    }
   
    public Date getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
   
    public Collection<Photo> getPhotos() {
        return this.photos;
    }

    public void setPhotos(Collection<Photo> photos) {
        this.photos = photos;
    }
   
    public Photo getVenueLogo() {
        return this.venueLogo;
    }

    public void setVenueLogo(Photo venueLogo) {
        this.venueLogo = venueLogo;
    }
   
    public Usuario getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(Usuario createdBy) {
        this.createdBy = createdBy;
    }
   
    public Organization getOrganization() {
        return this.organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
   
    public Collection<Space> getSpaces() {
        return this.spaces;
    }

    public void setSpaces(Collection<Space> spaces) {
        this.spaces = spaces;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    public Date getLastModifDate() {
        return this.lastModifDate;
    }

    public void setLastModifDate(Date lastModifDate) {
        this.lastModifDate = lastModifDate;
    }
   
    public Photo getFrontPhoto() {
        return this.frontPhoto;
    }

    public void setFrontPhoto(Photo frontPhoto) {
        this.frontPhoto = frontPhoto;
    }
}
