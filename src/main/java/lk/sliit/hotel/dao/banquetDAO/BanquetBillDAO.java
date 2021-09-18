package lk.sliit.hotel.dao.banquetDAO;


import lk.sliit.hotel.entity.banquet.BanquetBill;
import org.springframework.data.repository.CrudRepository;

public interface BanquetBillDAO extends CrudRepository<BanquetBill, Integer> {

    BanquetBill findTopByOrderByBillIdDesc();


    BanquetBill findTopByOrderByBanquetBillIdDesc();
}
