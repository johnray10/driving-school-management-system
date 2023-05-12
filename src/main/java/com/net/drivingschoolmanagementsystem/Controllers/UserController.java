package com.net.drivingschoolmanagementsystem.Controllers;

import com.net.drivingschoolmanagementsystem.Models.Users.Users;
import com.net.drivingschoolmanagementsystem.Models.Users.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

public class UserController {

    @Autowired
    private UsersService usersService;

    //Get All Users
    @GetMapping("/users")
    public String findAll(Model model) {
        return "views/users/login";
    }

    @RequestMapping("/users/findById")
    @ResponseBody
    public Optional<Users> findById(Long id) {
        return usersService.findById(id);
    }

    //Add User
    @PostMapping(value = "users/addNew")
    public String addNew(Users users) {
        usersService.save(users);
        return "redirect:/users";
    }

    @RequestMapping(value = "/users/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Users users) {
        usersService.save(users);
        return "redirect:/users";
    }

    @RequestMapping(value = "/users/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Long id) {
        usersService.delete(id);
        return "redirect:/users";
    }
}
