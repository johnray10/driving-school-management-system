package com.net.drivingschoolmanagementsystem.Models.Schedule;

import com.net.drivingschoolmanagementsystem.Models.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScheduleService{

    @Autowired private ScheduleDao scheduleDao;

    //Get All Student
    public List<Schedule> findAll() {
        return scheduleDao.findAll();
    }

    //Get Student By Id
    public Optional<Schedule> findById(Long id) {
        return scheduleDao.findById(id);
    }

    //Delete Student
    public void deleteById(Long id) {
        scheduleDao.deleteById(id);
    }

    //Update Student
    public void save(Schedule schedule) {
        scheduleDao.save(schedule);
    }
}
