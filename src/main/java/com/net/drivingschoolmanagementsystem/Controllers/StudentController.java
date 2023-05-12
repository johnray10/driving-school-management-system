package com.net.drivingschoolmanagementsystem.Controllers;

import com.net.drivingschoolmanagementsystem.Models.Student.Student;
import com.net.drivingschoolmanagementsystem.Models.Student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class StudentController {

    @Autowired private StudentService studentService;

    @GetMapping(value = "/students")
    public String getStudentAll(Model model){
        model.addAttribute("students",studentService.findAll());
        return "views/student/index";
    }

    @RequestMapping(value = "/students/findById")
    @ResponseBody
    public Optional<Student> findById(Long id){
        return studentService.findById(id);
    }

    @PostMapping(value = "/students/create")
    public String addStudent(Student student) {
        studentService.save(student);
        return "redirect:/students";
    }

    @RequestMapping(value = "/students/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Student student) {
        studentService.save(student);
        return "redirect:/students";
    }

    @RequestMapping(value = "/students/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id) {
        studentService.deleteById(id);
        return "redirect:/students";
    }
}
