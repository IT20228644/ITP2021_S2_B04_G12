package lk.sliit.hotel.dto.banquet;

import lk.sliit.hotel.entity.banquet.BanquetOnlineCustomer;

public class BanquetOnlineCustomerDTO {

    private int regNo;
    private String name;
    private String email;
    private String address;
    private String password;
    private String phoneNo;
    private String userName;

    public BanquetOnlineCustomerDTO(){

    }

    public BanquetOnlineCustomerDTO(int regNo, String name, String password) {
        this.regNo = regNo;
        this.name = name;
        this.password = password;
    }

    public BanquetOnlineCustomerDTO(int regNo) {
        this.regNo = regNo;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "BanquetOnlineCustomerDTO{" +
                "regNo=" + regNo +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
