package lk.sliit.hotel.service.custom;

import lk.sliit.hotel.dto.banquet.*;

import lk.sliit.hotel.service.SuperBO;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public interface BanquetBO extends SuperBO {

    BanquetOrderDTO findTopBanquetId();

//    BanquetCustomerDTO findTopbCustomerId();

    void saveBanquet(BanquetAddDTO banquetAddDTO);


    int checkAvailability(Date date);

    int checkHallOneAvailability(Date date);

    int checkHallTwoAvailabilityCheck(Date date);

    BanquetCustomerDTO findTopCustomerId();

    List<BanquetCustomerDTO> findAllCustomers();

//    BanquetBillDTO findTopBiiId();

    List<BanquetAddDTO> findBanquetBill();

    BanquetBillDTO findTopBanquetBillId();

    List<BanquetAddDTO> findAllBanquet();

    List<BanquetAddDTO> findNextBanquets();

    List<BanquetAddDTO> findTodayBanquets();


    List<BanquetAddDTO> findConfirmedBanquet();

    List<BanquetAddDTO> findUnconfirmedBanquet();

    void updateBill(BanquetAddDTO banquetAddDTO);

    void updateBanquetStatus(int orderId);

    void updateBanquetStatusAsFinished(int orderId);

    void updateBanquetStatusToCancel(int orderId);

    int checkHallOneAvailabilityAndGetBanquetId(Date date);

    void updateBanquetDetails(BanquetAddDTO banquetAddDTO);

    int checkHallTwoAvailabilityAndGetBanquetId(Date date);


    List<BanquetAddDTO> findCheckDateBanquets(Date date);

    List<BanquetAddDTO> findLastWeekBanquets();

    void deleteBanquet(int idNo);

    BanquetAddDTO findBanquetBillById(int billId);

    BanquetOnlineOrderDTO findTopOnlineNo();

    void saveOnlineBanquet(BanquetAddDTO banquetAddDTO);

    List<BanquetAddDTO> findOnlineBanquet();

    BanquetOrderDTO findTopBanquetId1();
    BanquetOrderDTO findTopBanquetId2();

    BanquetCustomerDTO findTopCustomerId2();

    BanquetOrderDTO findTopBanquetId3();

    BanquetCustomerDTO findTopCustomerId3();

    List<BanquetAddDTO> findConfirmedOnlineBanquets();

    void updatePendingStatus(int orderId);

    void deletePendingOnlineBanquet(int onlineNo);

    void saveOnlineBanquet2(BanquetOnlineOrderDTO banquetOnlineOrderDTO);

    int checkHallOneAvailability2(Date date);

    int checkHallTwoAvailability3(Date date);

    int checkAvailability2(Date date);

    int checkHallTwoAvailabilityCheck2(Date date);

    boolean findEmail(String email);

    BanquetOnlineCustomerDTO findHighestOnlineCustomerRegNo();

    void saveBanquetOnlineCustomer(BanquetOnlineCustomerDTO banquetOnlineCustomerDTO);

    BanquetOnlineCustomerDTO findByUserNameAndPassword(String id, String password);


//    List<BanquetAddDTO> findLastWeekBanquets();
}

