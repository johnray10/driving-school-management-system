package com.net.drivingschoolmanagementsystem.Models.Enrollment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollmentDao extends JpaRepository<Enrollment, Long> {

    //COUNT
    @Query("SELECT count(e.id) FROM Enrollment e")
    long countById();
}
