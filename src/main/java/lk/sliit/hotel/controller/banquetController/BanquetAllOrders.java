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
public class BanquetAllOrders {
    @Autowired
    IndexLoginBO indexLoginBO;

    @Autowired
    BanquetBO banquetBO;

    @GetMapping("banquetAllOrders")
    public ModelAndView loginPage(Model model) {
        ModelAndView mv = new ModelAndView("banquetAllOrders");
        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));

        List<BanquetAddDTO> list = banquetBO.findAllBanquet();
        mv.addObject("loadBanquetAllTable",list);

        return mv;
    }

}
