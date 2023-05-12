package com.net.drivingschoolmanagementsystem.Models.Enrollment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentService {

    @Autowired private EnrollmentDao enrollmentDao;

    public List<Enrollment> findAll(){
        return enrollmentDao.findAll();
    }

    public Optional<Enrollment> findById(Long id){
        return enrollmentDao.findById(id);
    }

    public void deleteById(Long id){
        enrollmentDao.deleteById(id);
    }

    public void save(Enrollment enrollment) {
        enrollmentDao.save(enrollment);
    }
}
