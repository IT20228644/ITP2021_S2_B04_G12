package lk.sliit.hotel.entity.banquet;

import lk.sliit.hotel.entity.kitchen.Menu;

import javax.persistence.*;
import java.sql.Date;

@Entity
public class BanquetOnlineOrder {
    @Id
    int onlineNo;
  //  int orderId;
//   @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
//   @JoinColumn(name = "orderId", referencedColumnName = "orderId")
//   BanquetOrder orderId;

    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
    @JoinColumn(name = "BanquetCustomer", referencedColumnName = "customerId")
    BanquetCustomer banquetCustomer;

    Date orderDate;
    Date date;
    String hallId;
    int noOfPlates;
    @ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name="menu",referencedColumnName = "menuId")
    Menu menu;

    @OneToOne(cascade = {CascadeType.PERSIST,CascadeType.REMOVE, CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE})
    @JoinColumn(name = "banquetBill", referencedColumnName = "billId")
    BanquetBill banquetBill;
    String orderState;

//    public BanquetOnlineOrder(int orderId, String hallId, String orderState, int noOfPlates,
//                              Date date, Date orderDate, int onlineNo, BanquetCustomer banquetCustomer,
//                              Menu menu, BanquetBill banquetBill) {
//
//        this.orderId = orderId;
//        this.hallId =hallId;
//        this.orderState =orderState;
//        this.noOfPlates =noOfPlates;
//        this.date =date;
//        this.orderDate = orderDate;
//        this.onlineNo = onlineNo;
//        this.banquetBill =banquetBill;
//        this.menu = menu;
//        this.banquetCustomer = banquetCustomer;
//    }

    public BanquetOnlineOrder() {

    }

    public BanquetOnlineOrder(String hallId, String orderState, int noOfPlates,
                              Date date, Date orderDate, int onlineNo,
                              BanquetCustomer banquetCustomer, Menu menu, BanquetBill banquetBill) {
        this.hallId =hallId;
        this.orderState =orderState;
        this.noOfPlates =noOfPlates;
        this.date =date;
        this.orderDate = orderDate;
        this.onlineNo = onlineNo;
        this.banquetBill =banquetBill;
        this.menu = menu;
        this.banquetCustomer = banquetCustomer;
    }

    public BanquetOnlineOrder(int onlineNo, Date bookingDate, String hallId, int noOfPlates,
                              Date orderDate, BanquetBill banquetBill, BanquetCustomer banquetCustomer, Menu menu) {
        this.onlineNo = onlineNo;
        this.date = bookingDate;
        this.hallId  = hallId;
        this.noOfPlates = noOfPlates;
        this.orderDate  = orderDate;
        this.banquetBill = banquetBill;
        this.banquetCustomer = banquetCustomer;
        this.menu =menu;
    }

    public BanquetOnlineOrder(int onlineNo, Date bookingDate, String hallId, int noOfPlates,
                              Date orderDate, String orderState, BanquetBill banquetBill,
                              BanquetCustomer banquetCustomer, Menu menu) {
        this.onlineNo = onlineNo;
        this.date = bookingDate;
        this.hallId  = hallId;
        this.noOfPlates = noOfPlates;
        this.orderDate  = orderDate;
        this.orderState = orderState;
        this.banquetBill = banquetBill;
        this.banquetCustomer = banquetCustomer;
        this.menu =menu;
    }


//
//    public BanquetOnlineOrder(int onlineNo, Date date, String hallId, int noOfPlates, Date orderDate,
//                              String orderState, BanquetBill banquetBill, int orderId,
//                              BanquetOrder banquetOrder, Menu menu) {
//        this.onlineNo =onlineNo;
//        this.date = date;
//        this.hallId = hallId;
//        this.noOfPlates = noOfPlates;
//        this.orderDate = orderDate;
//        this.orderState = orderState;
//        this.banquetBill = banquetBill;
//        this.banquetOrder = banquetOrder;
//        this.orderId = orderId;
//        this.menu = menu;
//    }
//
//    public BanquetOnlineOrder(int orderId, int onlineNo, Date date, String hallId,
//                              int noOfPlates, Date orderDate, String orderState, BanquetBill banquetBill,
//                              BanquetCustomer banquetCustomer, Menu menu) {
//
//        this.orderId = orderId;
//        this.hallId =hallId;
//        this.orderState =orderState;
//        this.noOfPlates =noOfPlates;
//        this.date =date;
//        this.orderDate = orderDate;
//        this.onlineNo = onlineNo;
//        this.banquetBill =banquetBill;
//        this.menu = menu;
//        this.banquetCustomer = banquetCustomer;
//    }

//    public BanquetOnlineOrder(int onlineNo, Date date, String hallId, int noOfPlates,
//                              Date orderDate, String orderState, BanquetBill banquetBill,
//                              BanquetCustomer banquetCustomer, Menu menu) {
//        this.hallId =hallId;
//        this.orderState =orderState;
//        this.noOfPlates =noOfPlates;
//        this.date =date;
//        this.orderDate = orderDate;
//        this.onlineNo = onlineNo;
//        this.banquetBill =banquetBill;
//        this.menu = menu;
//        this.banquetCustomer = banquetCustomer;
//
//    }


    public int getOnlineNo() {
        return onlineNo;
    }

    public void setOnlineNo(int onlineNo) {
        this.onlineNo = onlineNo;
    }

//    public int getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(int orderId) {
//        this.orderId = orderId;
//    }


//    public BanquetOrder getOrderId() {
//        return orderId;
//    }
//
//    public void setOrderId(BanquetOrder orderId) {
//        this.orderId = orderId;
//    }


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

}
