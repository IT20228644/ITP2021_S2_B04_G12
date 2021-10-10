package lk.sliit.hotel.dao.banquetDAO;

import lk.sliit.hotel.entity.banquet.BanquetOnlineOrder;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface BanquetOnlineOrderDAO extends CrudRepository<BanquetOnlineOrder,Integer> {


    BanquetOnlineOrder findTopByOrderByOnlineNoDesc();


    Iterable<BanquetOnlineOrder> findLastOnlineBanquetOrdersByDateBetween(Date previousFourDays, Date todayDate);

    Iterable<BanquetOnlineOrder> findBanquetOnlineOrdersByDateBetween(Date afterOneDays, Date afterThreeDays);

    //void updateBanquetStatus(String status, int onlineNo);

    //pending status convert to confirmed status
    @Modifying
    @Query(value = "Update BanquetOnlineOrder set orderState = ?1 where onlineNo=?2")
    void updatePendingStatus(String status, int onlineNo);

    @Modifying
    @Query(value = "Update BanquetOnlineOrder set orderState = ?1 where onlineNo=?2")
    void updateBanquetStatus(String status1, int onlineNo);

    Iterable<BanquetOnlineOrder> findLastOnlineBanquetOrdersByDate(Date previousFourDays);

    Iterable<BanquetOnlineOrder> findLastOnlineBanquetOrdersByDateEquals(Date previousFourDays);

    int countBanquetOrderByDateEqualsAndHallIdEquals(java.sql.Date date, String hallNo);

    int countBanquetOrderByDateEquals(java.sql.Date date);
}
