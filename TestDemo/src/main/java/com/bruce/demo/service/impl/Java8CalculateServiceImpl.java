package com.bruce.demo.service.impl;

import com.bruce.demo.service.CalculateService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * @author MrBird
 */
@Service
@Profile("dev")
public class Java8CalculateServiceImpl implements CalculateService {

    @Override
    public Integer sum(Integer... value) {
        System.out.println("dev 环境下执行");
        return Arrays.stream(value).reduce(0, Integer::sum);
    }
}
