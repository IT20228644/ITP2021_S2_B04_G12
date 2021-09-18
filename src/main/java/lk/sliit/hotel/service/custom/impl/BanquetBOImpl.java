package lk.sliit.hotel.service.custom.impl;

import lk.sliit.hotel.dao.banquetDAO.BanquetBillDAO;
import lk.sliit.hotel.dao.banquetDAO.BanquetCustomerDAO;
import lk.sliit.hotel.dao.banquetDAO.BanquetOrderDAO;
import lk.sliit.hotel.dao.kitchenDAO.MenuDAO;
import lk.sliit.hotel.dto.banquet.BanquetAddDTO;
import lk.sliit.hotel.dto.banquet.BanquetBillDTO;
import lk.sliit.hotel.dto.banquet.BanquetCustomerDTO;
import lk.sliit.hotel.dto.banquet.BanquetOrderDTO;
import lk.sliit.hotel.entity.banquet.BanquetBill;
import lk.sliit.hotel.entity.banquet.BanquetCustomer;
import lk.sliit.hotel.entity.banquet.BanquetOrder;
import lk.sliit.hotel.service.custom.BanquetBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.ArrayList;
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


    @Override
    public BanquetOrderDTO findTopBanquetId() {

        BanquetOrder banquetOrder = banquetOrderDAO.findTopByOrderByOrderIdDesc();
        return new BanquetOrderDTO(
                banquetOrder.getOrderId()
        );
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
    public void saveBanquet(BanquetAddDTO banquetAddDTO) {

        banquetCustomerDAO.save(new BanquetCustomer(
                banquetAddDTO.getCustomerId(),
                banquetAddDTO.getEmail(),
                banquetAddDTO.getName(),
                banquetAddDTO.getAddress(),
                banquetAddDTO.getContactNo()
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

    }


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

    //find top bill id
    @Override
    public BanquetBillDTO findTopBiiId() {
        BanquetBill banquetBill = banquetBillDAO.findTopByOrderByBillIdDesc();
        return new BanquetBillDTO(
                banquetBill.getBillId()
        );
    }


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


}
