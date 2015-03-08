package com.unlock.spaces.persistence;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Reservation implements Serializable {

    @Embedded
    private PayPalPaymentInfo payPalPaymentInfo;
    @Basic
    private String title;
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date endDateTime;
    @Basic
    private String creationDate;
    @ElementCollection
    private Collection<String> attendeesEmails;
    @OneToOne(targetEntity = Space.class)
    private Space space;
    @Embedded
    private CardPaymentInfo cardPaymentInfo;
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date startDateTime;
    @ManyToOne(targetEntity = Usuario.class)
    private Usuario reservedBy;
    @OneToOne(targetEntity = PaymentMethod.class)
    private PaymentMethod paymentMethod;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Basic
    private String lastModifDate;
    @Basic
    private int numberOfPeople;
    @OneToOne(targetEntity = ReservationStatus.class)
    private ReservationStatus reservationStatus;
    @ManyToMany(targetEntity = Amenity.class)
    private Collection<Amenity> amenitiesRequested;

    public Reservation() {

    }
   
    public PayPalPaymentInfo getPayPalPaymentInfo() {
        return this.payPalPaymentInfo;
    }

    public void setPayPalPaymentInfo(PayPalPaymentInfo payPalPaymentInfo) {
        this.payPalPaymentInfo = payPalPaymentInfo;
    }
   
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
   
    public Date getEndDateTime() {
        return this.endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }
   
    public String getCreationDate() {
        return this.creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
   
    public Collection<String> getAttendeesEmails() {
        return this.attendeesEmails;
    }

    public void setAttendeesEmails(Collection<String> attendeesEmails) {
        this.attendeesEmails = attendeesEmails;
    }
   
    public Space getSpace() {
        return this.space;
    }

    public void setSpace(Space space) {
        this.space = space;
    }
   
    public CardPaymentInfo getCardPaymentInfo() {
        return this.cardPaymentInfo;
    }

    public void setCardPaymentInfo(CardPaymentInfo cardPaymentInfo) {
        this.cardPaymentInfo = cardPaymentInfo;
    }
   
    public Date getStartDateTime() {
        return this.startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }
   
    public Usuario getReservedBy() {
        return this.reservedBy;
    }

    public void setReservedBy(Usuario reservedBy) {
        this.reservedBy = reservedBy;
    }
   
    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
   
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
   
    public String getLastModifDate() {
        return this.lastModifDate;
    }

    public void setLastModifDate(String lastModifDate) {
        this.lastModifDate = lastModifDate;
    }
   
    public int getNumberOfPeople() {
        return this.numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }
   
    public ReservationStatus getReservationStatus() {
        return this.reservationStatus;
    }

    public void setReservationStatus(ReservationStatus reservationStatus) {
        this.reservationStatus = reservationStatus;
    }
   
    public Collection<Amenity> getAmenitiesRequested() {
        return this.amenitiesRequested;
    }

    public void setAmenitiesRequested(Collection<Amenity> amenitiesRequested) {
        this.amenitiesRequested = amenitiesRequested;
    }
}
