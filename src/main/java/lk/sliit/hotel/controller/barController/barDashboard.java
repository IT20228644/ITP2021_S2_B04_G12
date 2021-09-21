package lk.sliit.hotel.controller.barController;

import lk.sliit.hotel.dto.inventory.InventoryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import lk.sliit.hotel.controller.SuperController;
import lk.sliit.hotel.dto.bar.BarOrderDetailDTO;
import lk.sliit.hotel.dto.kitchen.FoodItemDTO;
import lk.sliit.hotel.service.custom.IndexLoginBO;
import lk.sliit.hotel.service.custom.KitchenBO;
import lk.sliit.hotel.service.custom.impl.BarBOImpl;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class barDashboard {
    @Autowired
    IndexLoginBO indexLoginBO;
    @Autowired
    KitchenBO kitchenBO;
    @Autowired
    BarBOImpl barBO;

    @GetMapping("/barDashboard")//Load Bar Dashboard
    public String loadBarDash(Model model) { //edited from loadFAndB
        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));

        return "barDashboard";
    }

    @GetMapping("/beverageDailyActivityReport")
    public String barDailyReport(Model model) {
        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));


        return "beverageDailyActivityReport";
    }
    @GetMapping("/restaurantDailyActivityReport")
    public String restaurantReport(Model model) {
        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
        return "restaurantDailyActivityReport";
    }

    @GetMapping("/barRestItems")//Load Bar Stock Page
    public String loginPage(Model model, HttpServletRequest request) {
        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
        List<InventoryDTO> p1 = barBO.findAllBeverageItems("Beverage");
        if(p1.isEmpty()){
            request.setAttribute("loginError","Not Any Item Fond Under Beverage " +
                    "Type Please Add Data Under Beverage Type" );
        }
        model.addAttribute("loadInventoryBar", p1);
        return "barRestItems";
    }
}