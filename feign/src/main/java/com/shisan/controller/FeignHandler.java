package com.shisan.controller;

import com.shisan.entity.Student;
import com.shisan.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * @Author:shisan
 * @Date:2023/10/12 15:39
 */
@RestController
@RequestMapping("/feign")
public class FeignHandler {



    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignProviderClient.index();
    }
}
