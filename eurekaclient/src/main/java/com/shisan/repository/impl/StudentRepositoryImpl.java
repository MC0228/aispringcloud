package com.shisan.repository.impl;

import com.shisan.entity.Student;
import com.shisan.repository.StudentRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:shisan
 * @Date:2023/10/9 20:12
 */
@Repository
public class StudentRepositoryImpl implements StudentRepository {

    private static Map<Long, Student> studentMap;

    static {
        studentMap = new HashMap<>();
        studentMap.put(1l, new Student(1l, "邓雪寒", 22));
        studentMap.put(2l, new Student(2l, "林彤", 21));
        studentMap.put(3l, new Student(3l, "张国富", 22));
    }

    @Override
    public Collection<Student> findAll() {
        return studentMap.values();
    }

    @Override
    public Student findById(Long id) {
        return studentMap.get(id);
    }

    @Override
    public void saveOrUpdate(Student student) {
        studentMap.put(student.getId(), student);
    }

    @Override
    public void deleteById(Long id) {
        studentMap.remove(id);
    }
}
