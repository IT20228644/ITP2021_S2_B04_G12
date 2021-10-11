package lk.sliit.hotel.service.custom.impl;

import lk.sliit.hotel.controller.banquetController.BanquetOnlineOrders;
import lk.sliit.hotel.controller.banquetController.BanquetUtil;
import lk.sliit.hotel.dao.banquetDAO.*;
import lk.sliit.hotel.dao.kitchenDAO.MenuDAO;
import lk.sliit.hotel.dto.banquet.*;
import lk.sliit.hotel.entity.banquet.*;
import lk.sliit.hotel.service.custom.BanquetBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Service
@Transactional
public class BanquetBOImpl implements BanquetBO {

    @Autowired
    BanquetOrderDAO banquetOrderDAO;

    @Autowired
    BanquetCustomerDAO banquetCustomerDAO;

    @Autowired
    MenuDAO menuDAO;

    @Autowired
    BanquetBillDAO banquetBillDAO;

    @Autowired
    BanquetOnlineOrderDAO banquetOnlineOrderDAO;

   @Autowired
   BanquetOnlineCustomerDAO banquetOnlineCustomerDAO;


    @Override
    public BanquetOrderDTO findTopBanquetId() {

        BanquetOrder banquetOrder = banquetOrderDAO.findTopByOrderByOrderIdDesc();
//        BanquetOnlineOrder banquetOnlineOrder = banquetOnlineOrderDAO.findTopByOrderByOnlineNoDesc();
        return new BanquetOrderDTO(
                banquetOrder.getOrderId()
        );

    }

    @Override
    public BanquetOrderDTO findTopBanquetId2() {
      BanquetOrder banquetOrder = banquetOrderDAO.findTopByOrderByOrderIdDesc();
        //BanquetOnlineOrder banquetOnlineOrder = banquetOnlineOrderDAO.findTopByOrderByOnlineNoDesc();
        return new BanquetOrderDTO(
                banquetOrder.getOrderId()
        );
    }

    @Override
    public BanquetCustomerDTO findTopCustomerId2() {
        BanquetCustomer banquetCustomer = banquetCustomerDAO.findTopByOrderByCustomerIdDesc();
        return new BanquetCustomerDTO(
                banquetCustomer.getCustomerId()
        );
    }

    @Override
    public BanquetOrderDTO findTopBanquetId3() {
        BanquetOrder banquetOrder = banquetOrderDAO.findTopByOrderByOrderIdDesc();
        return new BanquetOrderDTO(
                banquetOrder.getOrderId()
        );
    }

    @Override
    public BanquetCustomerDTO findTopCustomerId3() {
        BanquetCustomer banquetCustomer = banquetCustomerDAO.findTopByOrderByCustomerIdDesc();
        return new BanquetCustomerDTO(
                banquetCustomer.getCustomerId()
        );
    }

    @Override
    public List<BanquetAddDTO> findConfirmedOnlineBanquets() {

        java.util.Date todayDate = new java.util.Date();
        Calendar cal1 = Calendar.getInstance();
        cal1.add(Calendar.DATE, -4);
        java.util.Date previousFourDays = cal1.getTime();



        Iterable <BanquetOnlineOrder> banquetOnlineOrder = banquetOnlineOrderDAO.findBanquetOnlineOrderByOrderDateEquals(previousFourDays);
        List <BanquetAddDTO> confirmedOnlineBanquet= new ArrayList<>();
        for ( BanquetOnlineOrder a: banquetOnlineOrder){
            confirmedOnlineBanquet.add(new BanquetAddDTO(
                    //a.getOrderId(),
                    a.getOnlineNo(),
                    a.getBanquetBill().getBillId(),
                    a.getOrderDate(),
                    a.getDate(),
                    a.getBanquetCustomer().getName(),
                    a.getBanquetCustomer().getContactNo(),
                    a.getHallId(),
                    a.getMenu().getMenuId(),
                    a.getNoOfPlates(),
                    a.getBanquetBill().getAdvancePayment(),
                    a.getBanquetBill().getTotal(),
                    a.getOrderState()
            ));
        }
        return confirmedOnlineBanquet;

//        Calendar cal3 = Calendar.getInstance();
//        Calendar cal2 = Calendar.getInstance();
//
//        cal3.add(Calendar.DATE, 3);
//        java.util.Date afterThreeDays = cal3.getTime();
//
//        cal2.add(Calendar.DATE, 1);
//        java.util.Date afterOneDays = cal2.getTime();
//
//        Iterable <BanquetOnlineOrder> banquetOnlineOrder = banquetOnlineOrderDAO.findBanquetOnlineOrdersByDateBetween (afterOneDays ,afterThreeDays);
//        List <BanquetAddDTO>  nextList = new ArrayList<>();
//        for ( BanquetOnlineOrder a: banquetOnlineOrder){
//            nextList.add(new BanquetAddDTO(
////                    a.getOrderId(),
//                    a.getOnlineNo(),
//                    a.getBanquetBill().getBillId(),
//                    a.getOrderDate(),
//                    a.getDate(),
//                    a.getBanquetCustomer().getName(),
//                    a.getBanquetCustomer().getContactNo(),
//                    a.getHallId(),
//                    a.getMenu().getMenuId(),
//                    a.getNoOfPlates(),
//                    a.getBanquetBill().getAdvancePayment(),
//                    a.getBanquetBill().getTotal(),
//                    a.getOrderState()
//            ));
//        }
//        return nextList;
    }


//    @Override
//    public BanquetCustomerDTO findTopbCustomerId() {
//        BanquetCustomer banquetCustomer = banquetCustomerDAO.findTopByOrderBybCustomerIdDesc();
//        return new BanquetCustomerDTO(
//                banquetCustomer.getbCustomerId()
//        );
//    }

    @Override
    public BanquetCustomerDTO findTopCustomerId() {
        BanquetCustomer banquetCustomer = banquetCustomerDAO.findTopByOrderByCustomerIdDesc();
        return new BanquetCustomerDTO(
                banquetCustomer.getCustomerId()
        );
    }


    @Override
    public BanquetOnlineOrderDTO findTopOnlineNo() {
      BanquetOnlineOrder banquetOnlineOrder= banquetOnlineOrderDAO.findTopByOrderByOnlineNoDesc();
        return new BanquetOnlineOrderDTO(
                banquetOnlineOrder.getOnlineNo()
        );
    }


    //find top bill id
//    @Override
//    public BanquetBillDTO findTopBiiId() {
//        BanquetBill banquetBill = banquetBillDAO.findTopByOrderByBillIdDesc();
//        return new BanquetBillDTO(
//                banquetBill.getBillId()
//        );
//    }

    @Override
    public BanquetBillDTO findTopBanquetBillId() {
        BanquetBill banquetBill =banquetBillDAO.findTopByOrderByBillIdDesc();
        return new BanquetBillDTO(
                banquetBill.getBillId()
        );
    }




    @Override
    public void saveBanquet(BanquetAddDTO banquetAddDTO) {

        banquetCustomerDAO.save(new BanquetCustomer(
                banquetAddDTO.getCustomerId(),
                banquetAddDTO.getEmail(),
                banquetAddDTO.getName(),
                banquetAddDTO.getAddress(),
                banquetAddDTO.getContactNo(),
                banquetAddDTO.getUserName(),
                banquetAddDTO.getPassword()
        ));


        banquetBillDAO.save(new BanquetBill(
                banquetAddDTO.getBanquetBillId(),
                banquetAddDTO.getAdvanceFee(),
                banquetAddDTO.getFoodPrice(),
                banquetAddDTO.getOtherPrice(),
                banquetAddDTO.getTotal()

        ));


        String status= "Pending";
        banquetAddDTO.setOrderState(status);

        String name = "Janani Madushika";
        banquetAddDTO.setSubmittedBy(name);

        banquetOrderDAO.save(new BanquetOrder(
                banquetAddDTO.getOrderId(),
                banquetAddDTO.getHallId(),
                banquetAddDTO.getOrderState(),
                banquetAddDTO.getNoOfPlates(),
                banquetAddDTO.getDate(),
                banquetAddDTO.getSubmittedBy(),
                banquetCustomerDAO.findOne(banquetAddDTO.getCustomerId()),
                menuDAO.findOne(banquetAddDTO.getMenuId()),
                banquetBillDAO.findOne(banquetAddDTO.getBanquetBillId())

        ));

//        banquetOnlineOrderDAO.save(new BanquetOnlineOrder(
//                // banquetAddDTO.getOrderId(),
//                banquetAddDTO.getOnlineNo(),
//                banquetAddDTO.getDate(),
//                banquetAddDTO.getHallId(),
//                banquetAddDTO.getNoOfPlates(),
//                banquetAddDTO.getOrderDate(),
//                banquetAddDTO.getOrderState(),
//                banquetBillDAO.findOne(banquetAddDTO.getBanquetBillId()),
//                banquetCustomerDAO.findOne(banquetAddDTO.getCustomerId()),
//                banquetOrderDAO.findOne(banquetAddDTO.getOrderId()),
//                menuDAO.findOne(banquetAddDTO.getMenuId())
//
//        ));

    }


    @Override
    public void saveOnlineBanquet(BanquetAddDTO banquetAddDTO) {



        banquetCustomerDAO.save(new BanquetCustomer(
                banquetAddDTO.getCustomerId(),
                banquetAddDTO.getEmail(),
                banquetAddDTO.getName(),
                banquetAddDTO.getAddress(),
                banquetAddDTO.getContactNo(),
                banquetAddDTO.getUserName(),
                banquetAddDTO.getPassword()
        ));


        banquetBillDAO.save(new BanquetBill(
                banquetAddDTO.getBanquetBillId(),
                banquetAddDTO.getAdvanceFee(),
                banquetAddDTO.getFoodPrice(),
                banquetAddDTO.getOtherPrice(),
                banquetAddDTO.getTotal()

        ));

        String status= "NotConfirmed";
        banquetAddDTO.setOrderState(status);

//        int orderId2 = banquetAddDTO.getOrderId() +1;
//        banquetAddDTO.setOrderId(orderId2);

        banquetOnlineOrderDAO.save(new BanquetOnlineOrder(
               //banquetAddDTO.getOrderId(),
                banquetAddDTO.getOnlineNo(),
                banquetAddDTO.getDate(),
                banquetAddDTO.getHallId(),
                banquetAddDTO.getNoOfPlates(),
                banquetAddDTO.getOrderDate(),
                banquetAddDTO.getOrderState(),
                banquetBillDAO.findOne(banquetAddDTO.getBanquetBillId()),
                banquetCustomerDAO.findOne(banquetAddDTO.getCustomerId()),
                //banquetOrderDAO.findOne(banquetAddDTO.getOrderId()),
                menuDAO.findOne(banquetAddDTO.getMenuId())

        ));
//
//                int orderId2 = banquetAddDTO.getOrderId() +1;
//                banquetAddDTO.setOrderId(orderId2);
//
//        banquetOrderDAO.save(new BanquetOrder(
//                banquetAddDTO.getOrderId(),
//               banquetAddDTO.getHallId(),
//               banquetAddDTO.getOrderState(),
//             banquetAddDTO.getNoOfPlates(),
//               banquetAddDTO.getDate(),
//               banquetAddDTO.getSubmittedBy(),
//                banquetCustomerDAO.findOne(banquetAddDTO.getCustomerId()),
//                menuDAO.findOne(banquetAddDTO.getMenuId()),
//               banquetBillDAO.findOne(banquetAddDTO.getBanquetBillId())

//        ));

    }


    @Override
    public void saveOnlineBanquet2(BanquetOnlineOrderDTO banquetOnlineOrderDTO) {


        banquetCustomerDAO.save(new BanquetCustomer(
                banquetOnlineOrderDTO.getCustomerId(),
                banquetOnlineOrderDTO.getEmail(),
                banquetOnlineOrderDTO.getName(),
                banquetOnlineOrderDTO.getAddress(),
                banquetOnlineOrderDTO.getContactNo(),
                banquetOnlineOrderDTO.getUserName(),
                banquetOnlineOrderDTO.getPassword()
        ));


        banquetBillDAO.save(new BanquetBill(
                banquetOnlineOrderDTO.getBanquetBillId(),
                banquetOnlineOrderDTO.getAdvanceFee(),
                banquetOnlineOrderDTO.getFoodPrice(),
                banquetOnlineOrderDTO.getOtherPrice(),
                banquetOnlineOrderDTO.getTotal()

        ));

        String status= "NotConfirmed";
        banquetOnlineOrderDTO.setOrderState(status);

//        int orderId2 = banquetAddDTO.getOrderId() +1;
//        banquetAddDTO.setOrderId(orderId2);

        banquetOnlineOrderDAO.save(new BanquetOnlineOrder(
                //banquetAddDTO.getOrderId(),
                banquetOnlineOrderDTO.getOnlineNo(),
                banquetOnlineOrderDTO.getDate(),
                banquetOnlineOrderDTO.getHallId(),
                banquetOnlineOrderDTO.getNoOfPlates(),
                banquetOnlineOrderDTO.getOrderDate(),
                banquetOnlineOrderDTO.getOrderState(),
                banquetBillDAO.findOne( banquetOnlineOrderDTO.getBanquetBillId()),
                banquetCustomerDAO.findOne( banquetOnlineOrderDTO.getCustomerId()),
                //banquetOrderDAO.findOne(banquetAddDTO.getOrderId()),
                menuDAO.findOne( banquetOnlineOrderDTO.getMenuId())

        ));
//
//                int orderId2 = banquetAddDTO.getOrderId() +1;
//                banquetAddDTO.setOrderId(orderId2);
//
//        banquetOrderDAO.save(new BanquetOrder(
//                banquetAddDTO.getOrderId(),
//               banquetAddDTO.getHallId(),
//               banquetAddDTO.getOrderState(),
//             banquetAddDTO.getNoOfPlates(),
//               banquetAddDTO.getDate(),
//               banquetAddDTO.getSubmittedBy(),
//                banquetCustomerDAO.findOne(banquetAddDTO.getCustomerId()),
//                menuDAO.findOne(banquetAddDTO.getMenuId()),
//               banquetBillDAO.findOne(banquetAddDTO.getBanquetBillId())

//        ));

    }


    @Override
    public void saveBanquetOnlineCustomer(BanquetOnlineCustomerDTO banquetOnlineCustomerDTO) {
        banquetOnlineCustomerDAO.save(new BanquetOnlineCustomer(
                banquetOnlineCustomerDTO.getRegNo(),
                banquetOnlineCustomerDTO.getName(),
                banquetOnlineCustomerDTO.getEmail(),
                banquetOnlineCustomerDTO.getAddress(),
//                banquetOnlineCustomerDTO.getPhoneNo(),
                banquetOnlineCustomerDTO.getPassword(),
                banquetOnlineCustomerDTO.getPhoneNo()


        ));

    }

    @Override
    public BanquetOnlineCustomerDTO findByUserNameAndPassword(String email, String password) {
       BanquetOnlineCustomer banquetOnlineCustomer = banquetOnlineCustomerDAO.findByEmailAndPassword(email, password);
        return new BanquetOnlineCustomerDTO(
                banquetOnlineCustomer.getRegNo(),
                banquetOnlineCustomer.getName(),
                banquetOnlineCustomer.getPassword()
        );
    }


    @Override
    public int checkHallOneAvailability2(Date date) {
        String hallNo ="No 1";
        int count1= banquetOnlineOrderDAO.countBanquetOrderByDateEqualsAndHallIdEquals(date,hallNo);
        return count1;
    }

    @Override
    public int checkHallTwoAvailability3(Date date) {
        String hallNo ="No 2";
        int count1= banquetOnlineOrderDAO.countBanquetOrderByDateEqualsAndHallIdEquals(date,hallNo);
        return count1;
    }

    @Override
    public int checkAvailability2(Date date) {
        int count = banquetOnlineOrderDAO.countBanquetOrderByDateEquals(date);
        return count;
    }

    @Override
    public int checkHallTwoAvailabilityCheck2(Date date) {
        String hallNo ="No 2";
        int count2= banquetOnlineOrderDAO.countBanquetOrderByDateEqualsAndHallIdEquals(date,hallNo);
        return count2;
    }

    @Override
    public boolean findEmail(String email) {
        email = email.trim();
       BanquetOnlineCustomer banquetOnlineCustomer = null;
        try {
            banquetOnlineCustomer = banquetOnlineCustomerDAO.findCustomerByEmailEquals(email);

        } catch (Exception e) {
            return true;
        }
        if (banquetOnlineCustomer == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public BanquetOnlineCustomerDTO findHighestOnlineCustomerRegNo() {
        BanquetOnlineCustomer orders = null;
        try {
            orders = banquetOnlineCustomerDAO.findTopByOrderByRegNoDesc();
        } catch (Exception e) {

        }
        return new BanquetOnlineCustomerDTO(
                orders.getRegNo()
        );
    }//End


    //Check Date Availability
    @Override
    public int checkAvailability(Date date) {
        int count = banquetOrderDAO.countBanquetOrderByDateEquals(date);
        return count;
    }

    //Check hall01 Availability
    @Override
    public int checkHallOneAvailability(Date date) {
        String hallNo ="No 1";
        int count1= banquetOrderDAO.countBanquetOrderByDateEqualsAndHallIdEquals(date,hallNo);
        return count1;
    }

    //Check Hall02 Availability
    @Override
    public int checkHallTwoAvailabilityCheck(Date date) {
        String hallNo ="No 2";
        int count2= banquetOrderDAO.countBanquetOrderByDateEqualsAndHallIdEquals(date,hallNo);
        return count2;
    }

    @Override
    @Transactional(readOnly = false)
    public List<BanquetCustomerDTO> findAllCustomers() {
        Iterable<BanquetCustomer> all = banquetCustomerDAO.findAll();
        List<BanquetCustomerDTO> dtos = new ArrayList<>();
        for(BanquetCustomer a:all){
            dtos.add(new BanquetCustomerDTO(
                    a.getCustomerId(),
                    a.getName(),
                    a.getAddress(),
                    a.getContactNo(),
                    a.getEmail()
            ));

        }

        return dtos;
    }



//    @Override
//    public List<BanquetAddDTO> findBanquetBill() {
//        Iterable<BanquetOrder> all = banquetOrderDAO.findAll();
//        List<BanquetAddDTO> billList= new ArrayList<>();
//        for ( BanquetOrder a: all){
//            billList.add(new BanquetAddDTO(
//                    a.getOrderId(),
//                    a.getBanquetCustomer().getName(),
//                    a.getDate(),
//                    a.getBanquetBill().getBillId(),
//                    a.getBanquetBill().getAdvancePayment(),
//                    a.getBanquetBill().getFoodPrice(),
//                    a.getMenu().getUnitPrice(),
//                    a.getBanquetBill().getOtherPrices(),
//                    a.getBanquetBill().getTotal(),
//                    a.getNoOfPlates()
//            ));
//        }
//        return billList;
//    }

    @Override
    public List<BanquetAddDTO> findBanquetBill() {
        Iterable<BanquetOrder> all = banquetOrderDAO.findAll();
        List<BanquetAddDTO> billList= new ArrayList<>();
        for ( BanquetOrder a: all){
            billList.add(new BanquetAddDTO(
                    a.getOrderId(),
                    a.getBanquetCustomer().getName(),
                    a.getDate(),
                    a.getBanquetBill().getBillId(),
                    a.getBanquetBill().getAdvancePayment(),
                    a.getBanquetBill().getFoodPrice(),
                    a.getBanquetBill().getOtherPrices(),
                    a.getBanquetBill().getTotal(),
                    a.getMenu().getUnitPrice(),
                    a.getNoOfPlates()
            ));
        }
        return billList;
    }


    @Override
    public List<BanquetAddDTO> findAllBanquet() {
        Iterable<BanquetOrder> all = banquetOrderDAO.findAll();
        List<BanquetAddDTO>banquetOrderList = new ArrayList<>();
        for(BanquetOrder b:all){
            banquetOrderList.add(new BanquetAddDTO(
                    b.getOrderId(),
                    b.getBanquetBill().getBillId(),
                    b.getDate(),
                    b.getBanquetCustomer().getName(),
                    b.getBanquetCustomer().getAddress(),
                    b.getHallId(),
                    b.getMenu().getMenuId(),
                    b.getNoOfPlates(),
                    b.getBanquetBill().getAdvancePayment(),
                    b.getBanquetBill().getTotal(),
                    b.getOrderState()
            ));

        }
        return banquetOrderList;

    }

    @Override
    public List<BanquetAddDTO> findOnlineBanquet() {
        Iterable<BanquetOnlineOrder> all = banquetOnlineOrderDAO.findAll();
        List<BanquetAddDTO> onlineList = new ArrayList<>();
        for (BanquetOnlineOrder o:all){
            onlineList.add(new BanquetAddDTO(
//                    o.getOrderId(),
                    o.getOnlineNo(),
                    o.getBanquetBill().getBillId(),
                    o.getOrderDate(),
                    o.getDate(),
                    o.getBanquetCustomer().getName(),
                    o.getBanquetCustomer().getAddress(),
                    o.getHallId(),
                    o.getMenu().getMenuId(),
                    o.getNoOfPlates(),
                    o.getBanquetBill().getAdvancePayment(),
                    o.getBanquetBill().getTotal(),
                    o.getOrderState()
            ));
        }

        return onlineList;
    }

    @Override
    public BanquetOrderDTO findTopBanquetId1() {
        BanquetOrder banquetOrder = banquetOrderDAO.findTopByOrderByOrderIdDesc();
        return new BanquetOrderDTO(
                banquetOrder.getOrderId()
        );
    }


    @Override
    public List<BanquetAddDTO> findNextBanquets() {

        Calendar cal1 = Calendar.getInstance();
        Calendar cal2 = Calendar.getInstance();

        cal1.add(Calendar.DATE, 3);
        java.util.Date afterThreeDays = cal1.getTime();

        cal2.add(Calendar.DATE, 1);
        java.util.Date afterOneDays = cal2.getTime();

        Iterable <BanquetOrder> banquetOrders = banquetOrderDAO.findBanquetOrdersByDateBetween (afterOneDays ,afterThreeDays);
        List <BanquetAddDTO>  nextList = new ArrayList<>();
        for ( BanquetOrder a: banquetOrders){
            nextList.add(new BanquetAddDTO(
                    a.getOrderId(),
                    a.getBanquetCustomer().getName(),
                    a.getBanquetCustomer().getContactNo(),
                    a.getDate(),
                    a.getHallId(),
                    a.getNoOfPlates(),
                    a.getBanquetBill().getAdvancePayment(),
                    a.getOrderState()
            ));
        }
        return nextList;
    }

    @Override
    public List<BanquetAddDTO> findTodayBanquets() {
        java.util.Date todayDate = new java.util.Date();
        Iterable <BanquetOrder> banquetOrders = banquetOrderDAO.findBanquetOrdersByDate(todayDate);
        List <BanquetAddDTO> todayList = new ArrayList<>();
        for ( BanquetOrder a: banquetOrders){
            todayList.add(new BanquetAddDTO(
                    a.getOrderId(),
                    a.getBanquetCustomer().getName(),
                    a.getBanquetCustomer().getContactNo(),
                    a.getDate(),
                    a.getHallId(),
                    a.getNoOfPlates(),
                    a.getBanquetBill().getAdvancePayment(),
                    a.getOrderState()
            ));
        }
        return todayList;
    }

    @Override
    public List<BanquetAddDTO> findConfirmedBanquet() {
        String statusConfirmed = "Confirmed";
        Iterable<BanquetOrder> all = banquetOrderDAO.findAllByOrderStateEquals(statusConfirmed);
        List<BanquetAddDTO> dtos = new ArrayList<>();
        for ( BanquetOrder a: all){
            dtos.add(new BanquetAddDTO(
                    a.getOrderId(),
                    a.getCustomer().getName(),
                    a.getCustomer().getAddress(),
                    a.getDate(),
                    a.getHallId(),
                    a.getNoOfPlates(),
                    a.getMenu().getMenuId(),
                    a.getBanquetBill().getAdvancePayment(),
                    a.getBanquetBill().getBillId()
            ));
        }
        return dtos;
    }

    @Override
    public List<BanquetAddDTO> findUnconfirmedBanquet() {
        String status = "pending";
        Iterable<BanquetOrder> all = banquetOrderDAO.findAllByOrderStateEquals(status);
        List<BanquetAddDTO> dtos = new ArrayList<>();
        for ( BanquetOrder a: all){
            dtos.add(new BanquetAddDTO(
                    a.getOrderId(),
                    a.getCustomer().getName(),
                    a.getCustomer().getAddress(),
                    a.getDate(),
                    a.getHallId(),
                    a.getNoOfPlates(),
                    a.getMenu().getMenuId(),
                    a.getBanquetBill().getAdvancePayment(),
                    a.getBanquetBill().getBillId()
            ));
        }
        return dtos;
    }

    @Override
    public void updateBill(BanquetAddDTO banquetAddDTO) {
        double total = banquetAddDTO.getFoodPrice()+banquetAddDTO.getOtherPrice();
        banquetBillDAO.updateFullBanquetBillTable(
                banquetAddDTO.getAdvanceFee(),
                banquetAddDTO.getFoodPrice(),
                banquetAddDTO.getOtherPrice(),
                total,
                banquetAddDTO.getBanquetBillId()
        );
    }


    //update status pending to confirm
    @Override
    public void updateBanquetStatus(int orderId) {
        String status="confirmed";
        banquetOrderDAO.updateBanquetStatus(status,orderId);
    }

   //update status confirm to finish
   @Override
   public void updateBanquetStatusAsFinished(int orderId) {
       String status ="finished";
       banquetOrderDAO.updateBanquetStatus(status,orderId);
   }

   //update banquet status to the cancel
    @Override
    public void updateBanquetStatusToCancel(int orderId) {
        String status = BanquetUtil.banquetStateCancel;
        banquetOrderDAO.updateBanquetStatus(status,orderId);
    }



    //update online banquet, not confirm to pending
    @Override
    public void updatePendingStatus(int onlineNo) {
        String status1="Online pending";
        //banquetOrderDAO.updateBanquetStatus(status,onlineNo);
        banquetOnlineOrderDAO.updateBanquetStatus(status1,onlineNo);

    }

    @Override
    public void deletePendingOnlineBanquet(int onlineNo) {
        banquetOnlineOrderDAO.delete(onlineNo);
    }




    @Override
    public int checkHallOneAvailabilityAndGetBanquetId(Date date) {

        String hallNo= "No 1";
        int banquetId;
       try{
           banquetId = banquetOrderDAO.getOrderIdByDateEqualsAndHallIdEquals(date,hallNo);
       }catch(Exception e){
           banquetId = -1;
       }
       return banquetId;
    }

//    @Override
//    public void updateBanquetDetails(BanquetAddDTO banquetAddDTO) {
//        banquetBillDAO.updateBanquetBillTable(
//                banquetAddDTO.getAdvanceFee(),
//                banquetAddDTO.getBanquetBillId()
//        );
//
//        banquetOrderDAO.UpdateBanquetTable(
//                banquetAddDTO.getHallId(),
//                banquetAddDTO.getNoOfPlates(),
//                banquetAddDTO.getDate(),
//                menuDAO.findOne(banquetAddDTO.getMenuId()),
//                banquetAddDTO.getOrderId()
//
//        );
//
//    }

    @Override
    public void updateBanquetDetails(BanquetAddDTO banquetAddDTO) {
        banquetBillDAO.updateBanquetBillTable(
                banquetAddDTO.getAdvanceFee(),
                banquetAddDTO.getBanquetBillId()
        );
        banquetOrderDAO.updateBanquetTable(
                banquetAddDTO.getHallId(),
                banquetAddDTO.getNoOfPlates(),
                banquetAddDTO.getDate(),
                menuDAO.findOne(banquetAddDTO.getMenuId()),
                banquetAddDTO.getOrderId()
        );

    }


    @Override
    public int checkHallTwoAvailabilityAndGetBanquetId(Date date) {
        String hallNo ="No 2";
        int banquetId;
        try{
            banquetId = banquetOrderDAO.getOrderIdByDateEqualsAndHallIdEquals(date, hallNo);
        }catch(Exception e){
            banquetId =- 1;
        }
        return banquetId;
    }

    @Override
    public List<BanquetAddDTO> findCheckDateBanquets(Date date) {
        Iterable<BanquetOrder> all = banquetOrderDAO.findBanquetOrderByDate(date);
        List<BanquetAddDTO>dateBanquet = new ArrayList<>();
        for (BanquetOrder a:all) {
            dateBanquet.add (new BanquetAddDTO(

                    a.getOrderId(),
                    a.getBanquetCustomer().getName(),
                    a.getBanquetCustomer().getContactNo(),
                    a.getDate(),
                    a.getHallId(),
                    a.getNoOfPlates(),
                    a.getBanquetBill().getAdvancePayment(),
                    a.getOrderState()
            ));
        }
        return dateBanquet;
    }

//    @Override
//    public List<BanquetAddDTO> findLastWeekBanquets() {
//        java.util.Date todayDate = new java.util.Date();
////        Calendar cal1 = Calendar.getInstance();
////        cal1.add(Calendar.DATE, 3);
////        java.util.Date afterWeek = cal1.getTime();
//
////        Iterable <BanquetOrder> banquetOrders = banquetOrderDAO.findBanquetOrdersByDateBetween(afterWeek ,todayDate);
//        Calendar cal6 = Calendar.getInstance();
//        Calendar cal4 = Calendar.getInstance();
//        cal6.add(Calendar.DATE, 3);
//        java.util.Date afterThreeDays = cal6.getTime();
//        cal4.add(Calendar.DATE, 1);
//        java.util.Date afterOneDays = cal4.getTime();
//        Iterable <BanquetOrder> banquetOrders = banquetOrderDAO.findBanquetOrdersByDateBetween(afterOneDays ,afterThreeDays);
//
//
//        List <BanquetAddDTO> dtos = new ArrayList<>();
//        for ( BanquetOrder a: banquetOrders){
//            dtos.add(new BanquetAddDTO(
//                    a.getOrderId(),
//                    a.getBanquetBill().getBillId(),
//                    a.getDate(),
//                    a.getCustomer().getName(),
//                    a.getCustomer().getContactNo(),
//                    a.getHallId(),
//                    a.getMenu().getMenuId(),
//                    a.getNoOfPlates(),
//                    a.getBanquetBill().getAdvancePayment(),
//                    a.getBanquetBill().getTotal(),
//                    a.getOrderState()
//            ));
//        }
//        return dtos;
//    }


    //get last week banquets
    @Override
    public List<BanquetAddDTO> findLastWeekBanquets() {

        java.util.Date todayDate = new java.util.Date();
        Calendar cal1 = Calendar.getInstance();
        cal1.add(Calendar.DATE,3);
        java.util.Date afterWeek = cal1.getTime();

        Iterable<BanquetOrder> lastBanquetOrders = banquetOrderDAO.findLastBanquetOrdersByDateBetween(afterWeek,todayDate);
        List<BanquetAddDTO> weekBanquet = new ArrayList<>();
        for (BanquetOrder a : lastBanquetOrders) {
            weekBanquet.add(new BanquetAddDTO(
                    a.getOrderId(),
                    a.getBanquetBill().getBillId(),
                    a.getDate(),
                    a.getBanquetCustomer().getName(),
                    a.getBanquetCustomer().getContactNo(),
                    a.getHallId(),
                    a.getMenu().getMenuId(),
                    a.getNoOfPlates(),
                    a.getBanquetBill().getAdvancePayment(),
                    a.getBanquetBill().getTotal(),
                    a.getOrderState()

            ));

        }

        return weekBanquet;
    }

    //Delete Banquet Order
    @Override
    public void deleteBanquet(int idNo) {
        banquetOrderDAO.delete(idNo);
    }

    @Override
    public BanquetAddDTO findBanquetBillById(int billId) {
        BanquetBill banquetBill = banquetBillDAO.findOne(billId);
        BanquetOrder banquetOrder =banquetOrderDAO.findBanquetOrderByBanquetBillEquals(banquetBill);
        return new BanquetAddDTO(
                banquetOrder.getOrderId(),
                banquetOrder.getCustomer().getName(),
                banquetOrder.getCustomer().getAddress(),
                banquetOrder.getCustomer().getContactNo(),
                banquetOrder.getDate(),
                banquetOrder.getHallId(),
                banquetOrder.getNoOfPlates(),
                banquetOrder.getBanquetBill().getAdvancePayment(),
                banquetOrder.getBanquetBill().getFoodPrice(),
                banquetOrder.getBanquetBill().getOtherPrices(),
                banquetOrder.getBanquetBill().getBillId(),
                banquetOrder.getOrderState(),
                banquetOrder.getBanquetBill().getTotal()
        );
    }



}
