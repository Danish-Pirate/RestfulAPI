package com.pirate.restfulapi.model;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class Course {
    @Id
    private String name;
    @Column
    @Temporal(TemporalType.DATE)
    private Date startDate;

    public Course(String name, Date startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    public Course() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) throws ParseException {
        this.startDate = new SimpleDateFormat("yyyy-MM-dd").parse(startDate);
    }
}
