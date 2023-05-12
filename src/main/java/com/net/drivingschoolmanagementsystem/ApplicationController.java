package com.net.drivingschoolmanagementsystem;

import com.net.drivingschoolmanagementsystem.Models.Enrollment.EnrollmentDao;
import com.net.drivingschoolmanagementsystem.Models.Instructor.InstructorDao;
import com.net.drivingschoolmanagementsystem.Models.Payment.PaymentDao;
import com.net.drivingschoolmanagementsystem.Models.Student.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

    @Autowired
    private EnrollmentDao enrollmentDao;

    @Autowired
    private InstructorDao instructorDao;

    @Autowired
    private StudentDao studentDao;

    @Autowired
    private PaymentDao paymentDao;


    @GetMapping(value = "/")
    public String dashboard(Model model){
        model.addAttribute("totalEnroll",enrollmentDao.countById());
        model.addAttribute("totalInstructor",instructorDao.countById());
        model.addAttribute("totalStudents",studentDao.countById());
        model.addAttribute("totalpayments",paymentDao.countById());
        return "views/dashboard/index";
    }

}
