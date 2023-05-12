package com.net.drivingschoolmanagementsystem.Models.Payment;

import com.net.drivingschoolmanagementsystem.Models.Student.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired private PaymentDao paymentDao;

    public List<Payment> findAllPayment(){
        return paymentDao.findAll();
    }

    public Optional<Payment> findById(Long id) {
        return paymentDao.findById(id);
    }

    //Delete
    public void deleteById(Long id) {
        paymentDao.deleteById(id);
    }

    //Update
    public void save(Payment payment) {
        paymentDao.save(payment);
    }
}
