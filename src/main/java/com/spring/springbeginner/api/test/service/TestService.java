package com.spring.springbeginner.api.test.service;

import com.spring.springbeginner.api.test.dto.Test;
import com.spring.springbeginner.api.test.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class TestService {

    private final TestMapper testMapper;

    public List<Test> getTest() {
        log.warn("TestService : getTest()");
        return testMapper.getTest();
    }
}
