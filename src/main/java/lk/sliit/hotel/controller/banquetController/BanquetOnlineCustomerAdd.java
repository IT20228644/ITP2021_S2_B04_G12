package lk.sliit.hotel.controller.banquetController;

import lk.sliit.hotel.controller.SuperController;
import lk.sliit.hotel.dto.banquet.BanquetOnlineCustomerDTO;
import lk.sliit.hotel.entity.banquet.BanquetOnlineCustomer;
import lk.sliit.hotel.service.custom.BanquetBO;
import lk.sliit.hotel.service.custom.IndexLoginBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BanquetOnlineCustomerAdd {

@Autowired
    IndexLoginBO indexLoginBO;

@Autowired
    BanquetBO banquetBO;

@GetMapping("banquetOnlineCustomerAdd")
    public ModelAndView loginPage (Model model) {
        ModelAndView mv = new ModelAndView("banquetOnlineCustomerAdd"); //display banquetAdd page
        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));

        return mv;

   }

    @PostMapping("/banquetCustomerSignUp")
    public String saveBanquetOnlineCustomer(@ModelAttribute BanquetOnlineCustomerDTO banquetOnlineCustomerDTO) {

        if (banquetBO.findEmail(banquetOnlineCustomerDTO.getEmail())) {
            try {
                BanquetOnlineCustomerDTO top = banquetBO.findHighestOnlineCustomerRegNo();
                int x = (top.getRegNo()) + 1;
                banquetOnlineCustomerDTO.setRegNo(x);
            } catch (NullPointerException ea) {
                banquetOnlineCustomerDTO.setRegNo(1);
            }
            banquetBO.saveBanquetOnlineCustomer(banquetOnlineCustomerDTO);
        }
        return "redirect:/banquetCustomerSignIn";
    }

    @PostMapping("/banquetCustomerSignIn")
    public String onlineCustomerDetails(@ModelAttribute BanquetOnlineCustomerDTO banquetOnlineCustomerDTO, Model model, HttpServletRequest request) {
        try {
            BanquetOnlineCustomerDTO banquetOnlineCustomerDTO1 = banquetBO.findByUserNameAndPassword(banquetOnlineCustomerDTO.getEmail(), banquetOnlineCustomerDTO.getPassword());
            if (banquetOnlineCustomerDTO1 != null) {
                request.getSession().setAttribute("RegNo", banquetOnlineCustomerDTO1.getRegNo());
                return "redirect:/banquetHalls";
            } else {
                return "redirect:/banquetCustomerSignIn";
            }
        } catch (NullPointerException e) {
            return "redirect:/banquetOnlineCustomerAdd";
        }

    }


}
