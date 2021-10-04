package lk.sliit.hotel.service.custom.impl;

import lk.sliit.hotel.dao.retaurantDAO.OnlineCustomerDAO;
import lk.sliit.hotel.dto.restaurant.OnlineCustomerDTO;
import lk.sliit.hotel.entity.restaurant.OnlineCustomer;
import lk.sliit.hotel.service.custom.OnlineCustomerBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OnlineCustomerBOImpl implements OnlineCustomerBO {

    @Autowired
    OnlineCustomerDAO onlineCustomerDAO;

    //find highest customer id to save
    @Override
    public OnlineCustomerDTO findHighestOnlineCustomerId() {
        OnlineCustomer lastCustomer = null;
        try {
            lastCustomer = onlineCustomerDAO.findTopByOrderByOnlineCustomerIdDesc();
           // System.out.println(lastCustomer.getOnlineCustomerId()+"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        } catch (Exception e){

        }
        assert lastCustomer != null;
        return new OnlineCustomerDTO(
                lastCustomer.getOnlineCustomerId()
        );
    }

    //save customers
    @Override
    public void saveOnlineCustomer(OnlineCustomerDTO onlineCustomerDTO) {
        onlineCustomerDAO.save(new OnlineCustomer(
                onlineCustomerDTO.getOnlineCustomerId(),
                onlineCustomerDTO.getName(),
                onlineCustomerDTO.getUserName(),
                onlineCustomerDTO.getAddress(),
                onlineCustomerDTO.getEmail(),
                onlineCustomerDTO.getPassword(),
                onlineCustomerDTO.getContact()
        ));
    }

    //validate given username and pwd
    @Override
    public OnlineCustomerDTO findByUserNameAndPassword(String userName, String password) {
            OnlineCustomer onlineCustomer = onlineCustomerDAO.findByUserNameAndPassword(userName,password);
            return new OnlineCustomerDTO (
                    onlineCustomer.getOnlineCustomerId(),
                    onlineCustomer.getUserName(),
                    onlineCustomer.getPassword()
            );

        }

        //match with relevant customer
    @Override
    public OnlineCustomerDTO findOne(int onlineCustomerId) {
        OnlineCustomer onlineCustomer = onlineCustomerDAO.findOne(onlineCustomerId);
        return new OnlineCustomerDTO(
                onlineCustomer.getOnlineCustomerId(),
                onlineCustomer.getUserName(),
                onlineCustomer.getName()
        );
    }

}

