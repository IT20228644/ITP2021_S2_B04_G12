package lk.sliit.hotel.dto.banquet;

import lk.sliit.hotel.entity.banquet.BanquetBill;
import lk.sliit.hotel.entity.banquet.BanquetCustomer;
import lk.sliit.hotel.entity.banquet.BanquetOrder;
import lk.sliit.hotel.entity.kitchen.Menu;

import java.sql.Date;

public class BanquetOnlineOrderDTO {

    private int onlineNo;
    private int orderId;
   // private BanquetOrder banquetOrder;
    private BanquetCustomer banquetCustomer;
    private Date orderDate;
//    private Date bookingDate;
    private Date date;
    private String hallId;
    private int noOfPlates;
    private Menu menu;
    private BanquetBill banquetBill;
    private String orderState;
//    private int orderId;
    private int customerId;
    private String email;
    private String name;
    private String address;
    private String contactNo;
    private String submittedBy;
    private int menuId;
    private int banquetBillId;
    private double advanceFee;
    private double foodPrice;
    private double otherPrice;
    private double total;
    private double unitPrise;
    private String userName;
    private String password;
    private Date bookingDate;


    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getSubmittedBy() {
        return submittedBy;
    }

    public void setSubmittedBy(String submittedBy) {
        this.submittedBy = submittedBy;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public int getBanquetBillId() {
        return banquetBillId;
    }

    public void setBanquetBillId(int banquetBillId) {
        this.banquetBillId = banquetBillId;
    }

    public double getAdvanceFee() {
        return advanceFee;
    }

    public void setAdvanceFee(double advanceFee) {
        this.advanceFee = advanceFee;
    }

    public double getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(double foodPrice) {
        this.foodPrice = foodPrice;
    }

    public double getOtherPrice() {
        return otherPrice;
    }

    public void setOtherPrice(double otherPrice) {
        this.otherPrice = otherPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getUnitPrise() {
        return unitPrise;
    }

    public void setUnitPrise(double unitPrise) {
        this.unitPrise = unitPrise;
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

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public  BanquetOnlineOrderDTO(){

   }

    public BanquetOnlineOrderDTO(int onlineNo) {
        this.onlineNo = onlineNo;
    }

    public int getOnlineNo() {
        return onlineNo;
    }

    public void setOnlineNo(int onlineNo) {
        this.onlineNo = onlineNo;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

//
//    public BanquetOrder getBanquetOrder() {
//        return banquetOrder;
//    }
//
//    public void setBanquetOrder(BanquetOrder banquetOrder) {
//        this.banquetOrder = banquetOrder;
//    }

    public BanquetCustomer getBanquetCustomer() {
        return banquetCustomer;
    }

    public void setBanquetCustomer(BanquetCustomer banquetCustomer) {
        this.banquetCustomer = banquetCustomer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

//    public Date getBookingDate() {
//        return bookingDate;
//    }
//
//    public void setBookingDate(Date bookingDate) {
//        this.bookingDate = bookingDate;
//    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHallId() {
        return hallId;
    }

    public void setHallId(String hallId) {
        this.hallId = hallId;
    }

    public int getNoOfPlates() {
        return noOfPlates;
    }

    public void setNoOfPlates(int noOfPlates) {
        this.noOfPlates = noOfPlates;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public BanquetBill getBanquetBill() {
        return banquetBill;
    }

    public void setBanquetBill(BanquetBill banquetBill) {
        this.banquetBill = banquetBill;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

//    @Override
//    public String toString() {
//        return "BanquetOnlineOrderDTO{" +
//                "onlineNo=" + onlineNo +
//                ", orderId=" + orderId +
//                ", banquetCustomer=" + banquetCustomer +
//                ", orderDate=" + orderDate +
//                ", bookingDate=" + bookingDate +
//                ", hallId='" + hallId + '\'' +
//                ", noOfPlates=" + noOfPlates +
//                ", menu=" + menu +
//                ", banquetBill=" + banquetBill +
//                ", orderState='" + orderState + '\'' +
//                '}';
//    }

//

//    @Override
//    public String toString() {
//        return "BanquetOnlineOrderDTO{" +
//                "onlineNo=" + onlineNo +
//                ", banquetOrder=" + banquetOrder +
//                ", banquetCustomer=" + banquetCustomer +
//                ", orderDate=" + orderDate +
//                ", bookingDate=" + bookingDate +
//                ", hallId='" + hallId + '\'' +
//                ", noOfPlates=" + noOfPlates +
//                ", menu=" + menu +
//                ", banquetBill=" + banquetBill +
//                ", orderState='" + orderState + '\'' +
//                '}';
//    }


//    @Override
//    public String toString() {
//        return "BanquetOnlineOrderDTO{" +
//                "onlineNo=" + onlineNo +
//                ", orderId=" + orderId +
//                ", banquetCustomer=" + banquetCustomer +
//                ", orderDate=" + orderDate +
//                ", date=" + date +
//                ", hallId='" + hallId + '\'' +
//                ", noOfPlates=" + noOfPlates +
//                ", menu=" + menu +
//                ", banquetBill=" + banquetBill +
//                ", orderState='" + orderState + '\'' +
//                '}';
//    }


    @Override
    public String toString() {
        return "BanquetOnlineOrderDTO{" +
                "onlineNo=" + onlineNo +
                ", orderId=" + orderId +
                ", banquetCustomer=" + banquetCustomer +
                ", orderDate=" + orderDate +
                ", date=" + date +
                ", hallId='" + hallId + '\'' +
                ", noOfPlates=" + noOfPlates +
                ", menu=" + menu +
                ", banquetBill=" + banquetBill +
                ", orderState='" + orderState + '\'' +
                ", customerId=" + customerId +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", submittedBy='" + submittedBy + '\'' +
                ", menuId=" + menuId +
                ", banquetBillId=" + banquetBillId +
                ", advanceFee=" + advanceFee +
                ", foodPrice=" + foodPrice +
                ", otherPrice=" + otherPrice +
                ", total=" + total +
                ", unitPrise=" + unitPrise +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", bookingDate=" + bookingDate +
                '}';
    }
}
