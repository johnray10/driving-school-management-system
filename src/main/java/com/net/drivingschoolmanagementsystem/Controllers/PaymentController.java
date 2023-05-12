package com.net.drivingschoolmanagementsystem.Controllers;

import com.net.drivingschoolmanagementsystem.Models.Payment.Payment;
import com.net.drivingschoolmanagementsystem.Models.Payment.PaymentService;
import com.net.drivingschoolmanagementsystem.Models.Schedule.Schedule;
import com.net.drivingschoolmanagementsystem.Models.Student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/payments")
    public String getStudentAll(Model model){
        model.addAttribute("payments", paymentService.findAllPayment());
        model.addAttribute("students", studentService.findAll());
        return "views/payment/index";
    }

    @RequestMapping(value = "/payments/findById")
    @ResponseBody
    public Optional<Payment> findById(Long id){
        return paymentService.findById(id);
    }

    @PostMapping(value = "/payments/create")
    public String add(Payment payment) {
        paymentService.save(payment);
        return "redirect:/payments";
    }

    @RequestMapping(value = "/payments/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Payment payment) {
        paymentService.save(payment);
        return "redirect:/payments";
    }

    @RequestMapping(value = "/payments/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id) {
        paymentService.deleteById(id);
        return "redirect:/payments";
    }
}
