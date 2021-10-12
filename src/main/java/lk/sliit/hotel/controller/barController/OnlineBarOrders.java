package lk.sliit.hotel.controller.barController;

import lk.sliit.hotel.controller.SuperController;
import lk.sliit.hotel.service.custom.IndexLoginBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class OnlineBarOrders {

    @Autowired
    IndexLoginBO indexLoginBO;

    @GetMapping("/barOnline")
    public String barOnline1(Model model) {
        model.addAttribute("barOnline", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
        return "barOnline";
    }

    @GetMapping("/barOnlineOrder")
    public String barOnline2(Model model) {
        model.addAttribute("barOnlineOrder", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
        return "barOnlineOrder";
    }
//
//    @GetMapping("/home")
//    public String home(Model model) {
//        model.addAttribute("home", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
//        return "home";
//    }
}
