package lk.sliit.hotel.controller.banquetController;

import lk.sliit.hotel.controller.SuperController;
import lk.sliit.hotel.dto.banquet.BanquetAddDTO;
import lk.sliit.hotel.service.custom.BanquetBO;
import lk.sliit.hotel.service.custom.IndexLoginBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.jws.WebParam;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class banquetUpdate {

    @Autowired
    IndexLoginBO indexLoginBO;
    @Autowired
    BanquetBO banquetBO;

    @GetMapping("banquetUpdate")
    public ModelAndView loggingPage(Model model){
        ModelAndView mv = new ModelAndView("banquetUpdate");
        model.addAttribute("loggerName",indexLoginBO.getEmployeeByIdNo(SuperController.idNo));

        //Display unconfirmed banquet list
        List<BanquetAddDTO> updateList = banquetBO.findUnconfirmedBanquet();
        mv.addObject("updateListTable",updateList);
        return mv;

    }

    @RequestMapping("updateBanquet")
    public ModelAndView updateBanquet(@ModelAttribute BanquetAddDTO banquetAddDTO, HttpServletRequest request, Model model){
        try {
            int count = banquetBO.checkAvailability(banquetAddDTO.getDate());
            if(count <= 2) {
                if (banquetAddDTO.getHallId().equals("No 1")){
                    int banquetId = banquetBO.checkHallOneAvailabilityAndGetBanquetId(banquetAddDTO.getDate());
                    int count1=banquetBO.checkHallOneAvailability(banquetAddDTO.getDate());
                    if (banquetAddDTO.getOrderId() == banquetId){
                        banquetBO.updateBanquetDetails(banquetAddDTO);
                        request.setAttribute("successfulMsg","updated successfully");

                    } else if(count1 < 1) {
                        banquetBO.updateBanquetDetails(banquetAddDTO);
                        request.setAttribute("successfulMsg","updated successfully");
                    }
                    else{
                        request.setAttribute("errorMsg1","can not enter");
                    }
                }
                if (banquetAddDTO.getHallId().equals("No 2")){
                    int banquetId=banquetBO.checkHallTwoAvailabilityAndGetBanquetId(banquetAddDTO.getDate());
                    int count2=banquetBO.checkHallTwoAvailabilityCheck(banquetAddDTO.getDate());
                    if (banquetId == banquetAddDTO.getOrderId()){
                        banquetBO.updateBanquetDetails(banquetAddDTO);
                        request.setAttribute("successfulMsg","updated successfully");
                    } else if(count2 < 1) {
                        banquetBO.updateBanquetDetails(banquetAddDTO);
                        request.setAttribute("successfulMsg","updated successfully");
                    }
                    else{
                        request.setAttribute("errorMsg2","can not enter");
                    }
                }
            }
            else{
                request.setAttribute("errorMsg1","can not enter");
            }


        }catch (Exception e){

        }

        ModelAndView mv = new ModelAndView("banquetUpdate");
        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));

        //Display unconfirmed banquet list
        List<BanquetAddDTO> updateList = banquetBO.findUnconfirmedBanquet();
        mv.addObject("updateListTable",updateList);

        return mv;

    }



}
