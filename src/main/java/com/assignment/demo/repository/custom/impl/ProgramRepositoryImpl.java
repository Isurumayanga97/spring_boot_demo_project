package com.assignment.demo.repository.custom.impl;

import com.assignment.demo.entity.Program;
import com.assignment.demo.repository.custom.ProgramRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class ProgramRepositoryImpl implements ProgramRepositoryCustom {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Program> search(String start_date, String end_date, Integer limit, Integer offset) {

        Query q=entityManager.createNativeQuery("SELECT * FROM program p WHERE p.start_date =:start_date AND p.end_date =:end_date  LIMIT :limit OFFSET :offset ", Program.class);
        q.setParameter("start_date",start_date);
        q.setParameter("end_date",end_date);
        q.setParameter("limit",limit);
        q.setParameter("offset",offset);
        return q.getResultList();
    }
}



