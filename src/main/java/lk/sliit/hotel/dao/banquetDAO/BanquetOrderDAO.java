package lk.sliit.hotel.dao.banquetDAO;

import lk.sliit.hotel.entity.banquet.BanquetBill;
import lk.sliit.hotel.entity.banquet.BanquetOrder;
import lk.sliit.hotel.entity.kitchen.Menu;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;

public interface BanquetOrderDAO extends CrudRepository<BanquetOrder, Integer> {

    BanquetOrder findTopByOrderByOrderIdDesc();

    int countBanquetOrderByDateEquals(Date date);

    int countBanquetOrderByDateEqualsAndHallIdEquals(Date date, String hallNo);

    Iterable<BanquetOrder> findBanquetOrdersByDate(java.util.Date todayDate);

    Iterable<BanquetOrder> findBanquetOrdersByDateBetween(java.util.Date afterOneDays, java.util.Date afterThreeDays);


    Iterable<BanquetOrder> findAllByOrderStateEquals(String statusConfirmed);

    //pending status convert to confirmed status
    @Modifying
    @Query(value = "Update BanquetOrder set orderState = ?1 where orderId=?2")
    void updateBanquetStatus(String status, int orderId);

    @Query(value ="select b.orderId from BanquetOrder b where b.date =:date and b.hallId =:hallNo" )
    int getOrderIdByDateEqualsAndHallIdEquals(@Param("date") Date date,@Param("hallNo") String hallNo);

//    @Modifying
//    @Query(value="UPDATE BanquetOrder set hallId=?1, noOfPlates=?2, date=?3, menu=?4 where orderId=?5")
//    void UpdateBanquetTable(String hallId, int noOfPlates, Date date, Menu one, int orderId);

    Iterable<BanquetOrder> findBanquetOrderByDate(Date date);

    @Modifying
    @Query(value = "Update BanquetOrder set hallId = ?1 , noOfPlates = ?2 ,date=?3 ,menu=?4 where orderId=?5")
    void updateBanquetTable(String hallId, int noOfPlates, java.sql.Date date, Menu one, int orderId);

    Iterable<BanquetOrder> findLastBanquetOrdersByDateBetween(java.util.Date afterWeek, java.util.Date todayDate);

    BanquetOrder findBanquetOrderByBanquetBillEquals(BanquetBill banquetBill);
}
