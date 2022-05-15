package com.assignment.demo.controller;

import com.assignment.demo.dto.ProgramDto;
import com.assignment.demo.service.custom.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/content/programs/")
public class ProgramController {

    @Autowired
    ProgramService programService;

    @PostMapping("/create")
    public ResponseEntity save(@RequestBody ProgramDto programDto) {
        programService.add(programDto);
        return new ResponseEntity<>("successfully created",HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity update(@RequestBody ProgramDto programDto) {
        programService.update(programDto);
        return new ResponseEntity<>("successfully updated!",HttpStatus.CREATED);
    }

    @GetMapping("/")
    public List<ProgramDto> searchCategory(
            @RequestParam(value = "start_date", required = true) String start_date,
            @RequestParam(value = "end_date", required = true) String end_date,
            @RequestParam(value = "limit", required = true) Integer limit,
            @RequestParam(value = "offset", required = true) Integer offset) {

        return programService.searchLike(start_date, end_date, limit, offset);
    }


}
