package lk.sliit.hotel.controller.RestaurantController;


import lk.sliit.hotel.dto.kitchen.MenusiteDTO;
import lk.sliit.hotel.dto.restaurant.restaurantOnlineOrder.RestaurantOnlineOrderDTO;
import lk.sliit.hotel.service.custom.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


@Controller
public class RestaurantOnlineOrder {

    @Autowired
    KitchenBO kitchenBO;

    @Autowired
    IndexLoginBO indexLoginBO;

    @Autowired
    OnlineCustomerBO onlineCustomerBO;

    @Autowired
    RestaurantBO restaurantBO;

    @Autowired
    MailSend mailSend;

    @Autowired
    KitchenMenusiteServices kitchenMenusiteServices;

    @GetMapping("/restaurantHome")
    public String loadHome(){

        return "restaurantHome";
    }



    @GetMapping("/onlineOrder")//Load Online Order Page
    public String loadForm_validationSaveMode(Model model, HttpSession session, HttpServletRequest request) {

        try {//Load Data when customer Sign In
            int onlineCustomerId = Integer.parseInt(session.getAttribute("userId").toString());
            model.addAttribute("loggerId", onlineCustomerBO.findOne(onlineCustomerId));
              //Load All Food
//            List<FoodItemDTO> p1 = kitchenBO.findFoodItems();
            List<MenusiteDTO> p1 = kitchenMenusiteServices.listAll();
            if(p1.isEmpty()){
                request.setAttribute("loginError","Not Any Item Fond Under Restaurant " +
                        "Type Please Add Data Under Restaurant Type" );
            }
            model.addAttribute("loadAllFoods", p1);
        } catch (Exception d) {
            return "restaurantMenu";
        }
        return "restaurantMenu";

    }

    @PostMapping("/saveOnlineOrder")//SAve Online Order
    public String saveOrder(@ModelAttribute RestaurantOnlineOrderDTO onlineOrderDTO, HttpSession session, Model model) {

        try {
            RestaurantOnlineOrderDTO top = restaurantBO.findHighestOnlineOrderId();
            int x = (top.getOrderId()) + 1;
            onlineOrderDTO.setOrderId((x));
        } catch (NullPointerException e) {
            onlineOrderDTO.setOrderId((1));
        }
        try {
            int onlineCustomerId = Integer.parseInt(session.getAttribute("userId").toString());
            onlineOrderDTO.setCustomer(onlineCustomerId);
            restaurantBO.saveOnlineOrder(onlineOrderDTO);
            mailSend.sendMailToOnlineCustomer(onlineOrderDTO);
        } catch (NullPointerException d) {
            return "redirect:/onlineOrder";
        }

        return "redirect:/onlineOrder";
    }

}
