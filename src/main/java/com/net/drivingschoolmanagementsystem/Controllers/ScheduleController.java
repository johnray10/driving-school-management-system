package com.net.drivingschoolmanagementsystem.Controllers;

import com.net.drivingschoolmanagementsystem.Models.Instructor.InstructorService;
import com.net.drivingschoolmanagementsystem.Models.Schedule.Schedule;
import com.net.drivingschoolmanagementsystem.Models.Schedule.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class ScheduleController {

    @Autowired private ScheduleService scheduleService;

    @Autowired private InstructorService instructorService;


    @GetMapping(value = "/schedules")
    public String getStudentAll(Model model){
        model.addAttribute("schedules",scheduleService.findAll());
        model.addAttribute("instructors", instructorService.findAllList());
        return "views/schedule/index";
    }

    @RequestMapping(value = "/schedules/findById")
    @ResponseBody
    public Optional<Schedule> findById(Long id){
        return scheduleService.findById(id);
    }

    @PostMapping(value = "/schedules/create")
    public String addStudent(Schedule schedule) {
        scheduleService.save(schedule);
        return "redirect:/schedules";
    }

    @RequestMapping(value = "/schedules/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Schedule schedule) {
        scheduleService.save(schedule);
        return "redirect:/schedules";
    }

    @RequestMapping(value = "/schedules/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id) {
        scheduleService.deleteById(id);
        return "redirect:/schedules";
    }
}
