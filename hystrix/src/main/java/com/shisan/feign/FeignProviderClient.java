package com.shisan.feign;

import com.shisan.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @Author:shisan
 * @Date:2023/10/12 15:34
 */
@FeignClient(value = "provider")
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();
}
