package com.assignment.demo.service.util;

import java.util.Date;
import java.util.List;

public interface CrudService<T> {

    public Long add(T t);
    public Long update(T t);
    public List<T> searchLike(String start_date, String end_date, Integer limit, Integer offset);
    public T get(Long id);

}
