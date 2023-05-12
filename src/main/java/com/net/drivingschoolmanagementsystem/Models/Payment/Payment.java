package com.net.drivingschoolmanagementsystem.Models.Payment;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String studentName;
    private String referenceNumber;
    private float amount;
    private String remarks;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateOfPayment;

    public Payment() {
    }

    public Payment(Long id, String studentName, String referenceNumber, float amount, String remarks, Date dateOfPayment) {
        this.id = id;
        this.studentName = studentName;
        this.referenceNumber = referenceNumber;
        this.amount = amount;
        this.remarks = remarks;
        this.dateOfPayment = dateOfPayment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getReferenceNumber() {
        return referenceNumber;
    }

    public void setReferenceNumber(String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getDateOfPayment() {
        return dateOfPayment;
    }

    public void setDateOfPayment(Date dateOfPayment) {
        this.dateOfPayment = dateOfPayment;
    }
}
