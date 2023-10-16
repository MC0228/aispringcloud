package com.shisan.feign.impl;

import com.shisan.entity.Student;
import com.shisan.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @Author:shisan
 * @Date:2023/10/12 16:18
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器升级中……";
    }
}
