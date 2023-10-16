package com.shisan.repository;

import com.shisan.entity.Student;

import java.util.Collection;

/**
 * @Author:shisan
 * @Date:2023/10/9 20:11
 */
public interface StudentRepository {
    Collection<Student> findAll();

    Student findById(Long id);

    void saveOrUpdate(Student student);

    void deleteById(Long id);
}
