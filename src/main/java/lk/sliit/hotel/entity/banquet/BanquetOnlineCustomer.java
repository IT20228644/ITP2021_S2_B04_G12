package lk.sliit.hotel.entity.banquet;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BanquetOnlineCustomer {

    @Id
    private int regNo;
    private String name;
    private String email;
    private String address;
    private String phoneNo;
    private String password;

//    public BanquetOnlineCustomer(int regNo, String name, String email, String address, String phoneNo, String password) {
//        this.regNo = regNo;
//        this.name = name;
//        this.email = email;
//        this.address = address;
//        this.phoneNo = phoneNo;
//        this.password = password;
//    }

    public BanquetOnlineCustomer() {

    }

    public BanquetOnlineCustomer(int regNo, String name, String email, String address,
                                 String password, String phoneNo) {
        this.regNo = regNo;
        this.name = name;
        this.email = email;
        this.address = address;
        this.password = password;
        this.phoneNo = phoneNo;
    }

//    public BanquetOnlineCustomer(int regNo, String name, String email, String address, String phoneNo,
//                                 String password) {
//        this.regNo = regNo;
//        this.name = name;
//        this.email =email;
//        this.address = address;
//        this.phoneNo = phoneNo;
//        this.password  = password;
//
//    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
