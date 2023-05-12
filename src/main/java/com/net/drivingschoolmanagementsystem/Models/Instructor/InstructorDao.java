package com.net.drivingschoolmanagementsystem.Models.Instructor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDao extends JpaRepository<Instructor, Long> {

    @Query("SELECT COUNT(i.id) FROM Instructor i")
    long countById();
}
