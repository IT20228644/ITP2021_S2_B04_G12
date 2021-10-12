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
public class BanquetAll {

    @Autowired
    IndexLoginBO indexLoginBO;

    @Autowired
    BanquetBO banquetBO;

    @GetMapping("banquetAll")
    public ModelAndView loginPage(Model model) {
        ModelAndView mv = new ModelAndView("banquetAll");
        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));


        //Display all Banquets order
        List<BanquetAddDTO> list = banquetBO.findAllBanquet();
        mv.addObject("loadBanquetAllTable",list);

        List<BanquetAddDTO> list2 = banquetBO.findAllBanquet2();
        mv.addObject("loadBanquetAllTable",list2);

        return mv;
    }

}
