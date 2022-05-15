package com.assignment.demo.dto;

import java.util.Date;

public class ProgramDto {

    private Long program_id;
    private String name;
    private String description;
    private Date start_date;
    private Date end_date;

    public Long getId() {
        return program_id;
    }

    public void setId(Long id) {
        this.program_id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}
