package lk.sliit.hotel.service.custom;

import lk.sliit.hotel.dto.restaurant.OnlineCustomerDTO;

public interface OnlineCustomerBO {

    OnlineCustomerDTO findHighestOnlineCustomerId();

    void saveOnlineCustomer(OnlineCustomerDTO onlineCustomerDTO);

    OnlineCustomerDTO findByUserNameAndPassword(String userName, String password);

    OnlineCustomerDTO findOne(int onlineCustomerId);
}
