package com.cisdi.enfi.pbs.dao;

import com.cisdi.enfi.pbs.domain.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> findAll();
}
