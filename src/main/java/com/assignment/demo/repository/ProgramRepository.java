package com.assignment.demo.repository;

import com.assignment.demo.entity.Program;
import com.assignment.demo.repository.custom.ProgramRepositoryCustom;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProgramRepository extends CrudRepository<Program, Long>, ProgramRepositoryCustom {

}
