package lk.sliit.hotel.controller.RestaurantController;

import lk.sliit.hotel.dto.restaurant.OnlineCustomerDTO;
import lk.sliit.hotel.service.custom.OnlineCustomerBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class restaurantOnlineCustomer {

    @Autowired
    OnlineCustomerBO onlineCustomerBO;

    @GetMapping("/restaurantOnlineCustomer")
    public String loadCusSignUpLogin(){
        return "restaurantOnlineCustomer";
    }
    @PostMapping("/onlineCustomerSave")
    public String onlineCustomerSave(@ModelAttribute OnlineCustomerDTO onlineCustomerDTO){
        try {//Auto Generate Id
            OnlineCustomerDTO top = onlineCustomerBO.findHighestOnlineCustomerId();
            int x = (top.getOnlineCustomerId()) + 1;
            onlineCustomerDTO.setOnlineCustomerId((x));
        } catch (NullPointerException e) {
            onlineCustomerDTO.setOnlineCustomerId((1));
        }
        //Save customer
        onlineCustomerBO.saveOnlineCustomer(onlineCustomerDTO);
        return "redirect:/restaurantOnlineCustomer";
    }

    //customer sign in
    @PostMapping("/onlineSignIn")
    public String onlineTableDetails(@ModelAttribute OnlineCustomerDTO onlineCustomer, HttpServletRequest request) {
        try {
            //Check validations
            OnlineCustomerDTO onlineCustomerDTO = onlineCustomerBO.findByUserNameAndPassword(onlineCustomer.getUserName(), onlineCustomer.getPassword());
            if (onlineCustomerDTO != null) {
                //Show Logged User Name
                request.getSession().setAttribute("userId", onlineCustomerDTO.getOnlineCustomerId());
                return "redirect:/restaurantHome";
            } else {//If User name And Password is not match
                return "redirect:/restaurantOnlineCustomer";
            }
        } catch (NullPointerException e) {
            return "redirect:/restaurantOnlineCustomer";
        }

    }

}
