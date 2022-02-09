package com.spring.springbeginner.api.test.controller;

import com.spring.springbeginner.api.test.dto.Test;
import com.spring.springbeginner.api.test.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final TestService testService;

    @GetMapping
    public List<Test> getTest() {

        List<Test> testList = testService.getTest();
        log.warn("TestController : getTest()");

        return testList;
    }

}
