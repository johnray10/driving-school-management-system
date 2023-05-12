package com.net.drivingschoolmanagementsystem.Models.Users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    @Autowired
    private UsersDao usersDao;

    //Get All Users
    public List<Users> findAll() {
        return usersDao.findAll();
    }

    //Get User By Id
    public Optional<Users> findById(Long id) {
        return usersDao.findById(id);
    }

    //Delete User
    public void delete(Long id) {
        usersDao.deleteById(id);
    }

    //Update User
    public void save(Users users) {
        usersDao.save(users);
    }
}
