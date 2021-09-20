package lk.sliit.hotel.controller.banquetController;

import lk.sliit.hotel.controller.SuperController;
import lk.sliit.hotel.dto.banquet.BanquetAddDTO;
import lk.sliit.hotel.service.custom.BanquetBO;
import lk.sliit.hotel.service.custom.IndexLoginBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BanquetCancel {

    @Autowired
    IndexLoginBO indexLoginBO;

    @Autowired
    BanquetBO banquetBO;

    @GetMapping("banquetDelete")
    public ModelAndView loginPage(Model model){
        ModelAndView mv = new ModelAndView("banquetCancel");
        model.addAttribute(indexLoginBO.getEmployeeByIdNo(SuperController.idNo));

        //Display confirmed banquet table
        List<BanquetAddDTO> list1 = banquetBO.findConfirmedBanquet();
        mv.addObject("loadTable1",list1);

        //Display unconfirmed banquet table
        List<BanquetAddDTO> list2 = banquetBO.findUnconfirmedBanquet();
        mv.addObject("loadTable2",list2);

        return mv;
    }



}
