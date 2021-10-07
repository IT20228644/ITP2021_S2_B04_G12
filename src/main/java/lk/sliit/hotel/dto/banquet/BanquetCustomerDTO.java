package lk.sliit.hotel.dto.banquet;

public class BanquetCustomerDTO {

    private  int customerId;
    private String name;
    private String email;
    private String address;
    private String contactNo;
    private String userName;
    private String password;
   // private int onlineNo;

    public BanquetCustomerDTO(int customerId) {
        this.customerId = customerId;
    }

    public BanquetCustomerDTO(int customerId, String name, String address, String contactNo, String email) {
        this.customerId = customerId;
        this.name =name;
        this.address = address;
        this.contactNo = contactNo;
        this.email =email;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public int getOnlineNo() {
//        return onlineNo;
//    }
//
//    public void setOnlineId(int onlineId) {
//        this.onlineNo = onlineId;
//    }

    @Override
    public String toString() {
        return "BanquetCustomerDTO{" +
                "customerId=" + customerId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


//    @Override
//    public String toString() {
//        return "BanquetCustomerDTO{" +
//                "customerId=" + customerId +
//                ", name='" + name + '\'' +
//                ", email='" + email + '\'' +
//                ", address='" + address + '\'' +
//                ", contactNo='" + contactNo + '\'' +
//                ", userName='" + userName + '\'' +
//                ", password='" + password + '\'' +
//                ", onlineNo=" + onlineNo +
//                '}';
//    }
}
