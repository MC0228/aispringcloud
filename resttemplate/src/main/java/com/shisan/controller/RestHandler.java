package com.shisan.controller;

import com.shisan.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

/**
 * @Author:shisan
 * @Date:2023/10/10 15:04
 */
@RestController
@RequestMapping("/rest")
public class RestHandler {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return restTemplate.getForEntity("http://localhost:8010/student/findAll", Collection.class).getBody();
    }

    @GetMapping("/findById/{id}")
    public Student findById(@PathVariable("id") Long id) {
        return restTemplate.getForObject("http://localhost:8010/student/findById/{id}", Student.class, id);

    }

    @PutMapping("/save")
    public void save(@RequestBody Student student) {
        restTemplate.postForEntity("http://localhost:8010/student/save",student,null);
    }

    @PostMapping("/update")
    public void update(@RequestBody Student student) {
        restTemplate.put("http://localhost:8010/student/update",student);
    }

    @DeleteMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        restTemplate.delete("http://localhost:8010/student/deleteById/{id}", id);
    }

}
