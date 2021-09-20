package lk.sliit.hotel.dao.reservationDAO;

import lk.sliit.hotel.entity.reservation.GeneralBill;
import org.springframework.data.repository.CrudRepository;

public interface GeneralBillDAO extends CrudRepository<GeneralBill,Integer> {
}
