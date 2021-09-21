package lk.sliit.hotel.entity.reservation;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
public class Reservation {
    @Id
    private int reservationId;
    private String type;
    private Date date;
    private String name;
    private String email;
    private int noOfRooms;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name="customerId",referencedColumnName = "customerId")
    private Customer customer;
    @OneToMany(mappedBy = "reservationId")
    private Collection<ReservationDetails> reservationDetails;


    public Reservation() {
    }

    public Reservation(int reservationId, String type, Date date, int noOfRooms, Customer customer) {
        this.reservationId = reservationId;
        this.type = type;
        this.date = date;
        this.noOfRooms = noOfRooms;
        this.customer = customer;
    }

    public Reservation(int reservationId, String name,int noOfRooms, String email) {
        this.reservationId=reservationId;
        this.name=name;
        this.noOfRooms=noOfRooms;
        this.email=email;
    }

    public Collection<ReservationDetails> getReservationDetails() {
        return reservationDetails;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public void setReservationDetails(Collection<ReservationDetails> reservationDetails) {
        this.reservationDetails = reservationDetails;
    }
    public void setName(String cusName){this.name=cusName;}
    public String getName(){return name;}

    public void setEmail(String cusEmail){this.email=cusEmail;}
    public String getEmail(){return email;}

    public int getReservationId() {
        return reservationId;
    }

    public void setReservationId(int reservationId) {
        this.reservationId = reservationId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
