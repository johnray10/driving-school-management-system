package com.net.drivingschoolmanagementsystem.Controllers;

import com.net.drivingschoolmanagementsystem.Config.FileUploadUtil;
import com.net.drivingschoolmanagementsystem.Models.Instructor.Instructor;
import com.net.drivingschoolmanagementsystem.Models.Instructor.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

import java.io.IOException;
import java.util.List;

@Controller
public class InstructorController {

    @Autowired
    private InstructorService instructorService;

    /*retrieve data*/
    @GetMapping(value = "/instructors")
    public String showInstructor(Model model) {
        List<Instructor> instructors  = instructorService.findAllList();
        model.addAttribute("instructors", instructors);
        return "views/instructor/index";
    }

    //show customer-add
    @GetMapping(value = "/addInstructors")
    public String addInstructor(Model model){
        Instructor instructor = new Instructor();
        model.addAttribute("instructors", instructor);
        return "views/instructor/create";
    }

    @PostMapping("/create-instructor")
    public RedirectView saveEmployee(@ModelAttribute("instructors") Instructor instructor,
                                     @RequestParam("image") MultipartFile multipartFile) throws IOException {
        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
        instructor.setPhoto(fileName);
        Instructor saveInstructor1 = instructorService.saveInstructor(instructor);
        String uploadDir = "user-photos/" + saveInstructor1.getId();
        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
        return new RedirectView("/instructors", true);

    }

    @GetMapping(value = "/edit-instructors/{id}")
    public String UpdateImage(@PathVariable(value = "id") Long id, Model model) {
        //set list gender
        List<Instructor> instructorList = instructorService.findAllList();
        model.addAttribute("instructor",instructorList);
        // set employee as a model attribute to pre-populate the form
        Instructor instructor = instructorService.getInstructorById(id);
        model.addAttribute("instructors",instructor);
        return "views/instructor/edit";
    }

    @GetMapping("/delete-instructors/{id}")
    public String deleteInstructor(@PathVariable(value = "id") Long id) {
        // call delete employee method
        this.instructorService.deleteCustomerById(id);
        return "redirect:/instructors";
    }
}
