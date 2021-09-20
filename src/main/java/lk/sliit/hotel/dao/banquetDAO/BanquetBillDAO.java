package lk.sliit.hotel.dao.banquetDAO;


import lk.sliit.hotel.entity.banquet.BanquetBill;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BanquetBillDAO extends CrudRepository<BanquetBill, Integer> {

    BanquetBill findTopByOrderByBillIdDesc();


    //banquet bill update after adding other prices
    @Modifying
    @Query(value = "update BanquetBill  set advancePayment = ?1,foodPrice=?2,otherPrices=?3," +
            " total=?4 where billId=?5")
    void updateFullBanquetBillTable(double advanceFee, double foodPrice,
                                    double otherPrice, double total, int banquetBillId);
}
