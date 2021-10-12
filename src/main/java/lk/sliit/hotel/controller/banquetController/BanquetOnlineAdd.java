package lk.sliit.hotel.controller.banquetController;

import lk.sliit.hotel.controller.SuperController;
import lk.sliit.hotel.dto.banquet.*;
import lk.sliit.hotel.service.custom.BanquetBO;
import lk.sliit.hotel.service.custom.IndexLoginBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class BanquetOnlineAdd {

    @Autowired
    IndexLoginBO indexLoginBO;

    @Autowired
    BanquetBO banquetBO;


    @GetMapping("banquetOnlineAdd")
    public ModelAndView loginPage (Model model){
        ModelAndView mv = new ModelAndView("banquetOnlineAdd"); //display banquetAdd page
        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
//<add>
        try{
            BanquetOrderDTO banquetOrderDTO = banquetBO.findTopBanquetId();
            int topBanquet= (banquetOrderDTO.getOrderId())+1;
            model.addAttribute("topBanquetId",topBanquet);
        }catch (NullPointerException e){
            model.addAttribute("topBanquetId",1);
        }

        try{
            BanquetCustomerDTO banquetCustomerDTO = banquetBO.findTopCustomerId();
            int topCustomer = (banquetCustomerDTO.getCustomerId())+1;
            model.addAttribute("topBanquetCustomerId",topCustomer);
        }catch (NullPointerException e){
            model.addAttribute("topBanquetCustomerId",1);
        }

//        try{
////            BanquetBillDTO banquetBillDTO = banquetBO.findTopBiiId();
//            BanquetBillDTO banquetBillDTO = banquetBO.findTopBanquetBillId();
//            int topBillId= (banquetBillDTO.getBillId())+1;
//            model.addAttribute("topBanquetBillId",topBillId);
//        }catch (NullPointerException e){
//            model.addAttribute("topBanquetBillId",1);
//        }


        try {
            BanquetBillDTO banquetBillDTO = banquetBO.findTopBanquetBillId();
            int topBill = (banquetBillDTO.getBillId()) + 1;
            model.addAttribute("topBanquetBillId", topBill);
        } catch (NullPointerException e){
            model.addAttribute("topBanquetBillId", 1);
        }

        try{
            BanquetOnlineOrderDTO banquetOnlineOrderDTO = banquetBO.findTopOnlineNo();
            int topOnlineNo= (banquetOnlineOrderDTO.getOnlineNo())+1;
            model.addAttribute("topOnlineNo",topOnlineNo);
        }catch (NullPointerException e){
            model.addAttribute("topOnlineNo",1);
        }

//        List<BanquetCustomerDTO> list = banquetBO.findAllCustomers();
//        mv.addObject("loadTable",list);

        return mv;
    }


//    @RequestMapping("saveOnlineBanquet")
//    public ModelAndView saveForm(@ModelAttribute BanquetAddDTO banquetAddDTO , BanquetOnlineOrderDTO banquetOnlineOrderDTO, HttpServletRequest request, Model model){
//
//        try {
//            int count = banquetBO.checkAvailability(banquetAddDTO.getDate());
//            if(count<2) {
//                if (banquetAddDTO.getHallId().equals("No 1")){
//                    int count1=banquetBO.checkHallOneAvailability(banquetAddDTO.getDate());
//                    int count4=banquetBO.checkHallOneAvailability2(banquetOnlineOrderDTO.getDate());
//                    if(count1<1 || count4<1) {
//                      //  banquetBO.saveBanquet(banquetAddDTO);
//                        banquetBO.saveOnlineBanquet(banquetAddDTO);
//                        request.setAttribute("successfulMsg","added successfully");
//                    }
//                    else{
//                        request.setAttribute("errorMsg2","can not enter");
//                    }
//                }

//            if(count<2) {
//                if (banquetAddDTO.getHallId().equals("No 1")){
//                    int count1=banquetBO.checkHallOneAvailability(banquetAddDTO.getDate());
//                    //int count4=banquetBO.checkHallOneAvailability2(banquetOnlineOrderDTO.getDate());
//                    if(count1<1) {
//                        banquetBO.saveOnlineBanquet(banquetAddDTO);
//                        request.setAttribute("successfulMsg","added successfully");
//                    }
//                    else{
//                        request.setAttribute("errorMsg2","can not enter");
//                    }
//                }
//                else if(banquetOnlineOrderDTO.getHallId().equals("No1")){
//                    //  int count1=banquetBO.checkHallOneAvailability(banquetAddDTO.getDate());
//                    int count4=banquetBO.checkHallOneAvailability2(banquetOnlineOrderDTO.getDate());
//                    if(count4<1) {
//                        banquetBO.saveOnlineBanquet(banquetAddDTO);
//                        request.setAttribute("successfulMsg","added successfully");
//                    }
//                    else{
//                        request.setAttribute("errorMsg2","can not enter");
//                    }
//
//                }
//                if (banquetAddDTO.getHallId().equals("No 2")){
//                    int count2=banquetBO.checkHallTwoAvailabilityCheck(banquetAddDTO.getDate());
//                   // int count5=banquetBO.checkHallOneAvailability3(banquetOnlineOrderDTO.getDate());
//                    if(count2 < 1 ) {
//                        //banquetBO.saveBanquet(banquetAddDTO);
//                        banquetBO.saveOnlineBanquet(banquetAddDTO);
//                        request.setAttribute("successfulMsg","added successfully");
//                    }
//                    else{
//                        request.setAttribute("errorMsg3","can not enter");
//                    }
//                }
//            }
//            if (banquetAddDTO.getHallId().equals("No 2")){
//               // int count1=banquetBO.checkHallOneAvailability(banquetAddDTO.getDate());
//                int count5=banquetBO.checkHallTwoAvailabilityCheck(banquetOnlineOrderDTO.getDate());
//                if(count5<1) {
//                    banquetBO.saveOnlineBanquet(banquetAddDTO);
//                    request.setAttribute("successfulMsg","added successfully");
//                }
//                else{
//                    request.setAttribute("errorMsg2","can not enter");
//                }
//            }
//            else{
//                request.setAttribute("errorMsg1","can not enter");
//            }
//
//
//        }catch (Exception e){
//
//        }
//
//
//        //Display the banquet add page
//        ModelAndView mv1 = new ModelAndView("banquetOnlineAdd");
//
//        try{
//            BanquetCustomerDTO banquetCustomerDTO = banquetBO.findTopCustomerId();
//            int topCustomer = (banquetCustomerDTO.getCustomerId())+1;
//            model.addAttribute("topBanquetCustomerId",topCustomer);
//        }catch (NullPointerException e){
//            model.addAttribute("topBanquetCustomerId",1);
//        }
//
//
//        try{
////            BanquetOnlineOrderDTO banquetOnlineOrderDTO = banquetBO.findTopOnlineNo();
//            banquetOnlineOrderDTO = banquetBO.findTopOnlineNo();
//            int topOnlineNo= (banquetOnlineOrderDTO.getOnlineNo())+1;
//            model.addAttribute("topOnlineNo",topOnlineNo);
//        }catch (NullPointerException e){
//            model.addAttribute("topOnlineNo",1);
//        }
//
//        try{
//            BanquetOrderDTO banquetOrderDTO = banquetBO.findTopBanquetId();
//            int topBanquet= (banquetOrderDTO.getOrderId())+1;
//            model.addAttribute("topBanquetId",topBanquet);
//        }catch (NullPointerException e){
//            model.addAttribute("topBanquetId",1);
//        }
//
//
//        try {
//            BanquetBillDTO banquetBillDTO = banquetBO.findTopBanquetBillId();
//            int topBill = (banquetBillDTO.getBillId()) + 1;
//            model.addAttribute("topBanquetBillId", topBill);
//        } catch (NullPointerException e){
//            model.addAttribute("topBanquetBillId", 1);
//        }






//       try{
//          BanquetBillDTO banquetBillDTO = banquetBO.findTopBanquetBillId();
//         int topBillId= (banquetBillDTO.getBillId())+1;
//            model.addAttribute("topBanquetBillId",topBillId);
//        }catch (NullPointerException e){
////            model.addAttribute("topBanquetBillId",1);
////        }
//
//
//
//
////        try{
////            BanquetOnlineOrderDTO banquetOnlineOrderDTO = banquetBO.findTopOnlineNo();
////            int topOnlineNo= (banquetOnlineOrderDTO.getOnlineNo())+1;
////            model.addAttribute("topOnlineNo",topOnlineNo);
////        }catch (NullPointerException e){
////            model.addAttribute("topOnlineNo",1);
////        }
//
////        //Display banquet booking customer details
////        List<BanquetCustomerDTO> list = banquetBO.findAllCustomers();
////        mv.addObject("loadTable",list);
//
//        return mv1;
//    }

//
//    @RequestMapping("saveOnlineBanquet2")
//    public ModelAndView saveForm(@ModelAttribute BanquetOnlineOrderDTO banquetOnlineOrderDTO , HttpServletRequest request, Model model){
//
//        try {
//            int count = banquetBO.checkAvailability(banquetOnlineOrderDTO.getDate());
//            if(count<2) {
//                if (banquetOnlineOrderDTO.getHallId().equals("No 1")){
//                    int count1=banquetBO.checkHallOneAvailability2(banquetOnlineOrderDTO.getDate());
//                    if(count1<1) {
//                        //  banquetBO.saveBanquet(banquetAddDTO);
//                        banquetBO.saveOnlineBanquet2(banquetOnlineOrderDTO);
//                        request.setAttribute("successfulMsg","added successfully");
//                    }
//                    else{
//                        request.setAttribute("errorMsg2","can not enter");
//                    }
//                }
//                if (banquetOnlineOrderDTO.getHallId().equals("No 2")){
//                    int count2=banquetBO.checkHallTwoAvailabilityCheck(banquetOnlineOrderDTO.getDate());
//                    if(count2 < 1) {
//                        //banquetBO.saveBanquet(banquetAddDTO);
//                        banquetBO.saveOnlineBanquet2(banquetOnlineOrderDTO);
//                        request.setAttribute("successfulMsg","added successfully");
//                    }
//                    else{
//                        request.setAttribute("errorMsg3","can not enter");
//                    }
//                }
//            }
//            else{
//                request.setAttribute("errorMsg1","can not enter");
//            }
//
//
//        }catch (Exception e){
//
//        }
//
//
//        //Display the banquet add page
//        ModelAndView mv1 = new ModelAndView("banquetOnlineAdd");
//
//        try{
//            BanquetCustomerDTO banquetCustomerDTO = banquetBO.findTopCustomerId();
//            int topCustomer = (banquetCustomerDTO.getCustomerId())+1;
//            model.addAttribute("topBanquetCustomerId",topCustomer);
//        }catch (NullPointerException e){
//            model.addAttribute("topBanquetCustomerId",1);
//        }
//
//
//        try{
//             banquetOnlineOrderDTO = banquetBO.findTopOnlineNo();
//            int topOnlineNo= (banquetOnlineOrderDTO.getOnlineNo())+1;
//            model.addAttribute("topOnlineNo",topOnlineNo);
//        }catch (NullPointerException e){
//            model.addAttribute("topOnlineNo",1);
//        }
//
//        try{
//            BanquetOrderDTO banquetOrderDTO = banquetBO.findTopBanquetId();
//            int topBanquet= (banquetOrderDTO.getOrderId())+1;
//            model.addAttribute("topBanquetId",topBanquet);
//        }catch (NullPointerException e){
//            model.addAttribute("topBanquetId",1);
//        }
//
//
//        try {
//            BanquetBillDTO banquetBillDTO = banquetBO.findTopBanquetBillId();
//            int topBill = (banquetBillDTO.getBillId()) + 1;
//            model.addAttribute("topBanquetBillId", topBill);
//        } catch (NullPointerException e){
//            model.addAttribute("topBanquetBillId", 1);
//        }
//
//
//


//
//        try{
//            BanquetBillDTO banquetBillDTO = banquetBO.findTopBiiId();
//            BanquetBillDTO banquetBillDTO = banquetBO.findTopBanquetBillId();
//            int topBillId= (banquetBillDTO.getBillId())+1;
//            model.addAttribute("topBanquetBillId",topBillId);
//        }catch (NullPointerException e){
//            model.addAttribute("topBanquetBillId",1);
//        }




//        try{
//            BanquetOnlineOrderDTO banquetOnlineOrderDTO = banquetBO.findTopOnlineNo();
//            int topOnlineNo= (banquetOnlineOrderDTO.getOnlineNo())+1;
//            model.addAttribute("topOnlineNo",topOnlineNo);
//        }catch (NullPointerException e){
//            model.addAttribute("topOnlineNo",1);
//        }

//        //Display banquet booking customer details
//        List<BanquetCustomerDTO> list = banquetBO.findAllCustomers();
//        mv.addObject("loadTable",list);

//        return mv1;
//    }

    @RequestMapping("saveOnlineBanquet")
    public ModelAndView saveForm(@ModelAttribute BanquetAddDTO banquetAddDTO , BanquetOnlineOrderDTO banquetOnlineOrderDTO, HttpServletRequest request, Model model){

        try {
            int count = banquetBO.checkAvailability(banquetAddDTO.getDate());
            int count6 = banquetBO.checkAvailability(banquetOnlineOrderDTO.getDate());
            if (count < 2 || count6 < 2) {
                if (banquetAddDTO.getHallId().equals("No 1")) {
                    int count1 = banquetBO.checkHallOneAvailability(banquetAddDTO.getDate());
                    int count4=banquetBO.checkHallOneAvailability2(banquetOnlineOrderDTO.getDate());
                    if (count1 < 1  && count4 <1 ) {
                        banquetBO.saveOnlineBanquet(banquetAddDTO);
                        request.setAttribute("successfulMsg", "added successfully");
                    } else {
                        request.setAttribute("errorMsg2", "can not enter");
                    }
                }

//                else  if (count6 < 2) {
//                 else   if (banquetOnlineOrderDTO.getHallId().equals("No1")) {
//                        //  int count1=banquetBO.checkHallOneAvailability(banquetAddDTO.getDate());
//                        int count4 = banquetBO.checkHallOneAvailability2(banquetOnlineOrderDTO.getDate());
//                        if (count4 < 1) {
//                            banquetBO.saveOnlineBanquet(banquetAddDTO);
//                            request.setAttribute("successfulMsg", "added successfully");
//                        } else {
//                            request.setAttribute("errorMsg2", "can not enter");
//                        }
//
//                    }
                    if (banquetAddDTO.getHallId().equals("No 2")) {
                        int count2 = banquetBO.checkHallTwoAvailabilityCheck(banquetAddDTO.getDate());
                        int count5 = banquetBO.checkHallTwoAvailabilityCheck2(banquetOnlineOrderDTO.getDate());
                        if (count2 < 1 && count5 < 1) {
//                           //banquetBO.saveBanquet(banquetAddDTO);
                          banquetBO.saveOnlineBanquet(banquetAddDTO);
                            request.setAttribute("successfulMsg", "added successfully");
                        } else {
                            request.setAttribute("errorMsg3", "can not enter");
                        }
                    }
//                    else if (banquetOnlineOrderDTO.getHallId().equals("No2")) {
//                        //  int count1=banquetBO.checkHallOneAvailability(banquetAddDTO.getDate());
//                        int count5 = banquetBO.checkHallTwoAvailabilityCheck(banquetOnlineOrderDTO.getDate());
//                        if (count5 < 1) {
//                            banquetBO.saveOnlineBanquet(banquetAddDTO);
//                            request.setAttribute("successfulMsg", "added successfully");
//                        } else {
//                            request.setAttribute("errorMsg2", "can not enter");
//                        }
//
//                    }

                }
//            }
            else{
                request.setAttribute("errorMsg1","can not enter");
            }


        }catch (Exception e){

        }


        //Display the banquet add page
        ModelAndView mv = new ModelAndView("banquetOnlineAdd");

        try{
            BanquetOrderDTO banquetOrderDTO = banquetBO.findTopBanquetId();
            int topBanquet= (banquetOrderDTO.getOrderId())+1;
            model.addAttribute("topBanquetId",topBanquet);
        }catch (NullPointerException e){
            model.addAttribute("topBanquetId",1);
        }

        try{
            BanquetCustomerDTO banquetCustomerDTO = banquetBO.findTopCustomerId();
            int topCustomer = (banquetCustomerDTO.getCustomerId())+1;
            model.addAttribute("topBanquetCustomerId",topCustomer);
        }catch (NullPointerException e){
            model.addAttribute("topBanquetCustomerId",1);
        }

//        try{
////            BanquetBillDTO banquetBillDTO = banquetBO.findTopBiiId();
//            BanquetBillDTO banquetBillDTO = banquetBO.findTopBanquetBillId();
//            int topBillId= (banquetBillDTO.getBillId())+1;
//            model.addAttribute("topBanquetBillId",topBillId);
//        }catch (NullPointerException e){
//            model.addAttribute("topBanquetBillId",1);
//        }


        try {
            BanquetBillDTO banquetBillDTO = banquetBO.findTopBanquetBillId();
            int topBill = (banquetBillDTO.getBillId()) + 1;
            model.addAttribute("topBanquetBillId", topBill);
        } catch (NullPointerException e){
            model.addAttribute("topBanquetBillId", 1);
        }

        //Display banquet booking customer details
        List<BanquetCustomerDTO> list = banquetBO.findAllCustomers();
        mv.addObject("loadTable",list);

        return mv;
    }

}
