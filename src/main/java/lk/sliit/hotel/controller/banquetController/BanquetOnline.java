package lk.sliit.hotel.controller.banquetController;

import lk.sliit.hotel.controller.SuperController;
import lk.sliit.hotel.dto.banquet.BanquetAddDTO;
import lk.sliit.hotel.service.custom.BanquetBO;
import lk.sliit.hotel.service.custom.IndexLoginBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.List;

@Controller
public class BanquetOnline {

    @Autowired
    IndexLoginBO indexLoginBO;

    @Autowired
    BanquetBO banquetBO;

//    @GetMapping("/homeBanquet")
//    public String loginPage1(Model model) {
//        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
//        return "home";
//    }

    @GetMapping("/homeBanquet")
    public String loginPage(Model model){
     //  model.addAttribute("loggerName",indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
        return "homeBanquet";

    }

    @GetMapping("/onlineBanquetCheck")
    public String loginPage2(Model model){
        //  model.addAttribute("loggerName",indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
        return "onlineBanquetCheck";

    }

    @RequestMapping("onlineBanquetCheck")
    public String checkDate(@RequestParam Date date, Model model){
//        ModelAndView mv= new ModelAndView("banquetCheckAvailability2");

        String answer1;
        String answer2;
        String answer3;

        //Date availability check
        int count = banquetBO.checkAvailability(date);
        int count6 = banquetBO.checkAvailability2(date);

        if(count == 2){
            answer1 =":Date Not Available";
        }
        else if(count6 == 2){
            answer1 =":Date not Available";
        }
        else if(count == 1 && count6 == 1){
            answer1=":Date not Available";
        }
        else{
            answer1=":Date  Available";
        }
        model.addAttribute("checkDate",date);
        model.addAttribute("answer1",answer1);

        //Hall one availability check
        int count1 = banquetBO.checkHallOneAvailability(date);
        int count4 = banquetBO.checkHallOneAvailability2(date);
        if(count1==1 || count4==1)
            answer2="Unavailable";
        else
            answer2 ="Available";
        model.addAttribute("answer2",answer2);


        //Hall two availability check
        int count2 = banquetBO.checkHallTwoAvailabilityCheck(date);
        int count5 = banquetBO.checkHallTwoAvailabilityCheck2(date);
        if(count2 == 1 || count5==1 )
            answer3 ="Unavailable";
        else
            answer3 ="Available";
        model.addAttribute("answer3",answer3);

        return "onlineBanquetCheck";


    }

}

