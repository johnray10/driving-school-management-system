package com.net.drivingschoolmanagementsystem.Models.Instructor;

import com.net.drivingschoolmanagementsystem.Models.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InstructorService {
    @Autowired
    private InstructorDao instructorDao;

    /*get customer list*/
    public List<Instructor> findAllList(){
        return instructorDao.findAll();
    }

    /*save data customer*/
    public Instructor saveInstructor(Instructor instructor){
        return this.instructorDao.save(instructor);
    }

    /*get a by id*/
    public Instructor getInstructorById(Long id){
        Optional<Instructor> optional = instructorDao.findById(id);
        Instructor instructor = null;
        if (optional.isPresent()){
            instructor = optional.get();
        }else{
            throw new RuntimeException(" Instructor not found for id :: " + id);
        }
        return instructor;
    }

    /* get a by id */
    public Instructor findById(Long id){
        return instructorDao.findById(id).orElse(null);
    }

    /* delete id */
    public void deleteCustomerById(Long id){
        this.instructorDao.deleteById(id);
    }
}
