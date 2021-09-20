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

        return mv;
    }
}
