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
public class BanquetCheckAvailability {

    @Autowired
    IndexLoginBO indexLoginBO;

    @Autowired
    BanquetBO banquetBO;


    //Display Check Availability Page
    @GetMapping("banquetCheckAvailability")
    public String loginPage(Model model){
        model.addAttribute("loggerName",  indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
        return "banquetCheckAvailability";

    }

    @RequestMapping("banquetCheckAvailability")
    public String checkDate(@RequestParam Date date, Model model){
        ModelAndView mv= new ModelAndView("banquetCheckAvailability");

        String answer1;
        String answer2;
        String answer3;

        //Date availability check
        int count = banquetBO.checkAvailability(date);
        //int count6 = banquetBO.checkAvailability2(date);

//      if(count == 1 && count6 == 1){
//            answer1=":Date not Available";
//        }
         if(count == 2){
            answer1 =":Date Not Available";
        }
//        else if(count6 == 2){
//            answer1 =":Date not Available";
//        }
        else{
            answer1=":Date  Available";
        }
        model.addAttribute("checkDate",date);
        model.addAttribute("answer1",answer1);

        // int count6 = banquetBO.checkAvailability2(date);

//         if(count6==2){
//            answer1=":Date not Available";
//            model.addAttribute("checkDate",date);
//            model.addAttribute("answer1",answer1);}
////        else if (count < 2){
////            answer1 =":Date Available";
////            model.addAttribute("checkDate",date);
////            model.addAttribute("answer1",answer1);}
//        else{
//            answer1=":Date Available";
//            model.addAttribute("checkDate",date);
//            model.addAttribute("answer1",answer1);}

      //  model.addAttribute("checkDate",date);
        //model.addAttribute("answer1",answer1);


        //Hall one availability check
        int count1 = banquetBO.checkHallOneAvailability(date);
        int count4 = banquetBO.checkHallOneAvailability2(date);
        if(count1==1 || count4==1)
            answer2="Unavailable";
        else if(count4 == 2)
            answer2 = "Unavailable";
        else if(count1 == 2)
            answer2 = "Unavailable";
        else
            answer2 ="Available";
        model.addAttribute("answer2",answer2);


        //Hall two availability check
        int count2 = banquetBO.checkHallTwoAvailabilityCheck(date);
        int count5 = banquetBO.checkHallTwoAvailabilityCheck2(date);
        if(count2 == 1 || count5==1 )
            answer3 = "Unavailable";
        else if(count2 == 2)
            answer3 = "Unavailable";
        else if(count5 == 2)
            answer3 = "Unavailable";
        else
            answer3 ="Available";
        model.addAttribute("answer3",answer3);





//        List<BanquetAddDTO> list = banquetBO.findCheckDateBanquets(date);
//        model.addAttribute("loadTable",list);
        List<BanquetAddDTO> list = banquetBO.findCheckDateBanquets(date);
        model.addAttribute("banquetList",list);

        return "banquetCheckAvailability";


    }



}
