package lk.sliit.hotel.dao.banquetDAO;

import lk.sliit.hotel.entity.banquet.BanquetOnlineCustomer;
import org.springframework.data.repository.CrudRepository;

public interface BanquetOnlineCustomerDAO extends CrudRepository<BanquetOnlineCustomer,Integer> {
    BanquetOnlineCustomer findCustomerByEmailEquals(String email);

    BanquetOnlineCustomer findTopByOrderByRegNoDesc();

    BanquetOnlineCustomer findByEmailAndPassword(String email, String password);
}
