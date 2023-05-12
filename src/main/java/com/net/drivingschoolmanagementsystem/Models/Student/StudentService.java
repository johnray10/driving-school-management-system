package com.net.drivingschoolmanagementsystem.Models.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired private StudentDao studentDao;

    //Get All Student
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    //Get Student By Id
    public Optional<Student> findById(Long id) {
        return studentDao.findById(id);
    }

    //Delete Student
    public void deleteById(Long id) {
        studentDao.deleteById(id);
    }

    //Update Student
    public void save(Student student) {
        studentDao.save(student);
    }
}
