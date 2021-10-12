package lk.sliit.hotel.controller.banquetController;

import lk.sliit.hotel.controller.SuperController;
import lk.sliit.hotel.dto.banquet.BanquetAddDTO;
import lk.sliit.hotel.dto.banquet.BanquetOnlineOrderDTO;
import lk.sliit.hotel.service.custom.BanquetBO;
import lk.sliit.hotel.service.custom.IndexLoginBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.List;

@Controller
public class BanquetController {
    @Autowired
    IndexLoginBO indexLoginBO;

    @Autowired
    BanquetBO banquetBO;

    //Display Banquet dash board
    @GetMapping("banquet")
    public ModelAndView LoginPage(Model model){
        ModelAndView mv = new ModelAndView("banquet");
        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));

        //display next 3 days banquets
        List<BanquetAddDTO> nextBanquets = banquetBO.findNextBanquets();
        mv.addObject("nextBanquetsTable",nextBanquets);

        //Display today banquet
        List <BanquetAddDTO> todayBanquets = banquetBO.findTodayBanquets();
        mv.addObject("todayBanquetsTable",todayBanquets);

        //Display today should be confirmed online orders
        List<BanquetAddDTO> confirmedOnlineBanquet = banquetBO.findConfirmedOnlineBanquets();
        mv.addObject("confirmedOnlineBanquet",confirmedOnlineBanquet );

        return mv;
    }


    //update banquet Status pending to confirm
    @RequestMapping("updateBanquetStatus")
    public String updateBanquetStatus(@RequestParam int orderId){
        banquetBO.updateBanquetStatus(orderId);
        return "redirect:banquet";
    }

    //update status confirmed to finish
    @RequestMapping("/updateBanquetStatusAsFinished")
    public String updateBanquetStatusAsFinished(@RequestParam int orderId) {
        banquetBO.updateBanquetStatusAsFinished(orderId);
        return "redirect:/banquet";
    }


    //update Online banquet not confirmed status to Pending
    @RequestMapping("updatePendingStatus")
    public String updatePendingStatus(@RequestParam int onlineNo){
        banquetBO.updatePendingStatus(onlineNo);
        return "redirect:/banquet";
    }

    //Delete banquet
    @RequestMapping("deletePendingOnlineBanquet")
    public String deletePendingOnlineBanquet(@RequestParam int onlineNo) {
        banquetBO.deletePendingOnlineBanquet(onlineNo);
        return "redirect:/banquet";
    }



}
