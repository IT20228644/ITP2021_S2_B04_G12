package lk.sliit.hotel.controller.manageController;

import lk.sliit.hotel.controller.SuperController;
import lk.sliit.hotel.dto.inventory.InventoryOrderDTO;
import lk.sliit.hotel.dto.reservation.ReservationDTO;
import lk.sliit.hotel.service.custom.HouseKeepingBO;
import lk.sliit.hotel.service.custom.IndexLoginBO;
import lk.sliit.hotel.service.custom.InventoryBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ManageDailyActivityReportController {
    @Autowired
    IndexLoginBO indexLoginBO;
    @Autowired
    InventoryBO inventoryBO;
    @Autowired
    HouseKeepingBO houseKeepingBO;
    @GetMapping("/reservationDetails")
    public String loginPage(Model model){

        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
        List<ReservationDTO> hotelRoomDTOList  =  houseKeepingBO.findAllTodayBill();//Find reservation Details
        model.addAttribute("loadHotelRoomTable", hotelRoomDTOList);

        return "reservationDetails";
    }
    @GetMapping("/manageDailyActivityReport")
    public String loginPage1(Model model){

        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
        List<InventoryOrderDTO> inventoryBill  =  inventoryBO.findInventoryBillToday();
        model.addAttribute("loadInventoryBills", inventoryBill);
        return "manageDailyActivityReport";
    }
}
