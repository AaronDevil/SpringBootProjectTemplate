package com.nopava.whodo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
//由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
@Slf4j
public class RedisTest {

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Test
    public void set(){

        String[] test = {"1","2","3",};

        ListOperations<String, String> sL = redisTemplate.opsForList();
        /*sL.leftPushAll("list",test);
        List<String> list = sL.range("list", 0, -1);
        System.out.printf(list.toString());*/
        sL.rightPopAndLeftPush("list","list");
        List<String> list = sL.range("list", 0, -1);
        System.out.printf(list.toString());
    }
}