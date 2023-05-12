package com.net.drivingschoolmanagementsystem.Models.Payment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentDao extends JpaRepository<Payment, Long> {

    @Query("SELECT COUNT(p.id) FROM Payment p")
    long countById();

}
