package lk.sliit.hotel.dao.retaurantDAO.onlineTableReservationDAO;

import lk.sliit.hotel.entity.restaurant.onlineTableReservation.OnlineTableReservation;
import lk.sliit.hotel.entity.restaurant.onlineTableReservation.OnlineTableReservationDetails;

import org.springframework.data.repository.CrudRepository;

public interface OnlineTableReservationDetailsDAO extends CrudRepository<OnlineTableReservationDetails,Integer> {

    Iterable<OnlineTableReservationDetails> findAllByOnlineTableReservationEquals(OnlineTableReservation id);

}
