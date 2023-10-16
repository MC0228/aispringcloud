package com.shisan.feign;

import com.shisan.entity.Student;
import com.shisan.feign.impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @Author:shisan
 * @Date:2023/10/12 15:34
 */
@FeignClient(value = "provider", fallback = FeignError.class)
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    Collection<Student> findAll();

    @GetMapping("/student/index")
    String index();
}
