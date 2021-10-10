package lk.sliit.hotel.dao.banquetDAO;

import lk.sliit.hotel.entity.banquet.BanquetCustomer;
import lk.sliit.hotel.entity.banquet.BanquetOnlineOrder;
import org.springframework.data.repository.CrudRepository;

public interface BanquetCustomerDAO extends CrudRepository<BanquetCustomer, Integer> {

    BanquetCustomer findTopByOrderByCustomerIdDesc();

}
