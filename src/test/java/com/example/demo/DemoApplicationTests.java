package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests
{

    @Test
    void contextLoads()
    {
        Integer a = null;
        Integer b = 1;

        System.out.println(a+b);
    }

}
