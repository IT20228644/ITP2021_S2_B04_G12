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

import javax.persistence.Column;
import java.util.List;

@Controller
public class BanquetReport {
    @Autowired
    IndexLoginBO indexLoginBO;

    @Autowired
    BanquetBO banquetBO;

    @GetMapping("banquetReport")
    public ModelAndView loggingPage (Model model){
        ModelAndView mv = new ModelAndView("banquetReport");
        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));

        List<BanquetAddDTO> report = banquetBO.findLastWeekBanquets();
        mv.addObject("reportTable",report);

        double reportTotal =0;

        for (BanquetAddDTO i: report) {
            reportTotal += i.getTotal();
        }
        model.addAttribute("fullTotal", reportTotal);

        double reportTax =0;

        reportTax = reportTotal*0.04;

        model.addAttribute("fullTax",reportTax);

        double reportProfit = 0;
        reportProfit = reportTotal - reportTax;
        model.addAttribute("fullProfit",reportProfit);


        return mv;
    }
}
