package lk.sliit.hotel.controller.RestaurantController;

import com.sun.xml.internal.ws.developer.ValidationErrorHandler;
import lk.sliit.hotel.dto.restaurant.OnlineCustomerDTO;
import lk.sliit.hotel.service.custom.OnlineCustomerBO;
import lk.sliit.hotel.service.custom.RestaurantBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.swing.*;

@Controller
public class restaurantOnlineCustomer {

    @Autowired
    OnlineCustomerBO onlineCustomerBO;

    @Autowired
    RestaurantBO restaurantBO;

    String alertMsg=null;

    @GetMapping("/restaurantOnlineCustomer")
    public String loadCusSignUpLogin(){
        return "onlineCustomernewnew";
    }

//    @GetMapping("/profile")
//    public String loadprofile(HttpSession session,Model model){
//        int onlineCustomerId = Integer.parseInt(session.getAttribute("userId").toString());
//        model.addAttribute("loggerId", onlineCustomerBO.findOne(onlineCustomerId));
//        model.addAttribute("resDetail", restaurantBO.findOne(onlineCustomerId));
//        model.addAttribute("orderDetail", restaurantBO.findOrder(onlineCustomerId));
//
//
//        return "profile";
//    }

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
    public String onlineTableDetails(@ModelAttribute OnlineCustomerDTO onlineCustomer, HttpServletRequest request,Model model) {
        try {
            //Check validations
            OnlineCustomerDTO onlineCustomerDTO = onlineCustomerBO.findByUserNameAndPassword(onlineCustomer.getUserName(), onlineCustomer.getPassword());
            if (onlineCustomerDTO != null) {
                //Show Logged User Name
                request.getSession().setAttribute("userId", onlineCustomerDTO.getOnlineCustomerId());
                return "redirect:/restaurantHome";
            } else {//If User name And Password is not match
                alertMsg = "Reservation id Released";
                return "redirect:/restaurantOnlineCustomer";

            }
        } catch (NullPointerException e) {
            return "redirect:/restaurantOnlineCustomer";
        }

    }

}
