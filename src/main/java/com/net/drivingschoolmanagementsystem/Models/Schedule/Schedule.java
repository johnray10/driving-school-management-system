package com.net.drivingschoolmanagementsystem.Models.Schedule;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String scheduleCode;
    private String instructorName;
    private float amount;
    private int numberOfSlots;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date scheduleDate;
    private String remarks;

    public Schedule() {
    }

    public Schedule(Long id, String instructorName, float amount, int numberOfSlots, Date scheduleDate, String remarks) {
        this.id = id;
        this.instructorName = instructorName;
        this.amount = amount;
        this.numberOfSlots = numberOfSlots;
        this.scheduleDate = scheduleDate;
        this.remarks = remarks;
    }

    public Schedule(String scheduleCode) {
        this.scheduleCode = scheduleCode;
    }

    public String getScheduleCode() {
        return scheduleCode;
    }

    public void setScheduleCode(String scheduleCode) {
        this.scheduleCode = scheduleCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public int getNumberOfSlots() {
        return numberOfSlots;
    }

    public void setNumberOfSlots(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
