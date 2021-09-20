package lk.sliit.hotel.dao.banquetDAO;


import lk.sliit.hotel.entity.banquet.BanquetBill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BanquetBillDAO extends CrudRepository<BanquetBill, Integer> {

    BanquetBill findTopByOrderByBillIdDesc();

}
