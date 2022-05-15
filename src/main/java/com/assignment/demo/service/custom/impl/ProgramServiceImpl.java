package com.assignment.demo.service.custom.impl;

import com.assignment.demo.dto.ProgramDto;
import com.assignment.demo.entity.Program;
import com.assignment.demo.repository.ProgramRepository;
import com.assignment.demo.service.custom.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProgramServiceImpl implements ProgramService {

    @Autowired
    ProgramRepository programRepository;

    @Override
    public Long add(ProgramDto programDto) {
        Program program = new Program();
        program.setName(programDto.getName());
        program.setDescription(programDto.getDescription());
        program.setStart_date(programDto.getStart_date());
        program.setEnd_date(programDto.getEnd_date());
        Program save = programRepository.save(program);
        return save.getId();
    }

    @Override
    public Long update(ProgramDto programDto) {
        Program program = new Program();
        program.setId(programDto.getId());
        program.setName(programDto.getName());
        program.setDescription(programDto.getDescription());
        program.setStart_date(programDto.getStart_date());
        program.setEnd_date(programDto.getEnd_date());
        Program save = programRepository.save(program);
        return save.getId();
    }

    @Override
    public List<ProgramDto> searchLike(String start_date, String end_date, Integer limit, Integer offset) {
        List<ProgramDto> list=new ArrayList<>();
        for (Program entity: programRepository.search(start_date, end_date, limit, offset)){
            ProgramDto programDto = new ProgramDto();
            programDto.setId(entity.getId());
            programDto.setName(entity.getName());
            programDto.setDescription(entity.getDescription());
            programDto.setStart_date(entity.getStart_date());
            programDto.setEnd_date(entity.getEnd_date());

            list.add(programDto);
        }
        return list;


    }




    @Override
    public ProgramDto get(Long id) {
        return null;
    }
}
