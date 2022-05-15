package com.assignment.demo.repository.custom;

import com.assignment.demo.entity.Program;

import java.util.Date;
import java.util.List;

public interface ProgramRepositoryCustom {

    public List<Program> search(String start_date, String end_date, Integer limit, Integer offset);

}
