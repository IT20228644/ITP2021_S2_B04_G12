package lk.sliit.hotel.controller.dashboardController;

import lk.sliit.hotel.controller.SuperController;
import lk.sliit.hotel.dto.manager.NoticeDTO;
import lk.sliit.hotel.service.custom.AttendanceBO;
import lk.sliit.hotel.service.custom.HumanResourceBO;
import lk.sliit.hotel.service.custom.IndexLoginBO;
import lk.sliit.hotel.service.custom.NoticeBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DashboardController {
    @Autowired
    IndexLoginBO indexLoginBO;
    @Autowired
    AttendanceBO attendanceBO;
    @Autowired
    NoticeBO noticeBO;
    @Autowired
    HumanResourceBO humanResourceBO;
    @RequestMapping("/Dashboard")
    public String loginPage(Model model)
    {
        //Get Today Attendance

        model.addAttribute ( "todayAttendance", humanResourceBO.findTodayAttendance ( ) );

        List<NoticeDTO> p = noticeBO.findNoticeOneWeek();
        model.addAttribute("loadNoticeTable", p);
        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
        return "/dashboard";
    }
    @GetMapping("/findAllNotice")
    public String findAllNotice(Model model)
    {
        List<NoticeDTO> p = noticeBO.findAll();
        model.addAttribute("loadAllNotice", p);
        model.addAttribute("loggerName", indexLoginBO.getEmployeeByIdNo(SuperController.idNo));
        return "allNotice";
    }
}
