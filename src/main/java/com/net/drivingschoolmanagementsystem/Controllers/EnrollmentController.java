package com.net.drivingschoolmanagementsystem.Controllers;

import com.net.drivingschoolmanagementsystem.Models.Enrollment.Enrollment;
import com.net.drivingschoolmanagementsystem.Models.Enrollment.EnrollmentService;
import com.net.drivingschoolmanagementsystem.Models.Instructor.InstructorService;
import com.net.drivingschoolmanagementsystem.Models.Schedule.ScheduleService;
import com.net.drivingschoolmanagementsystem.Models.Student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@Controller
public class EnrollmentController {

    @Autowired private EnrollmentService enrollmentService;

    @Autowired private ScheduleService scheduleService;

    @Autowired private StudentService studentService;

    @Autowired private InstructorService instructorService;


    @GetMapping(value = "/enrollments")
    public String getStudentAll(Model model){
        model.addAttribute("enrollments", enrollmentService.findAll());
        model.addAttribute("schedules", scheduleService.findAll());
        model.addAttribute("students", studentService.findAll());
        model.addAttribute("instructors", instructorService.findAllList());
        return "views/enrollment/index";
    }

    @RequestMapping(value = "/enrollments/findById")
    @ResponseBody
    public Optional<Enrollment> findById(Long id){
        return enrollmentService.findById(id);
    }

    @PostMapping(value = "/enrollments/create")
    public String add(Enrollment enrollment) {
        enrollmentService.save(enrollment);
        return "redirect:/enrollments";
    }

    @RequestMapping(value = "/enrollments/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Enrollment enrollment) {
        enrollmentService.save(enrollment);
        return "redirect:/enrollments";
    }

    @RequestMapping(value = "/enrollments/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id) {
        enrollmentService.deleteById(id);
        return "redirect:/enrollments";
    }
}
