package lk.sliit.hotel.dao.banquetDAO;

import lk.sliit.hotel.entity.banquet.BanquetOrder;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

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
}
