package com.spring.springbeginner.api.test.mapper;

import com.spring.springbeginner.api.test.dto.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface TestMapper {

    List<Test> getTest();
}
