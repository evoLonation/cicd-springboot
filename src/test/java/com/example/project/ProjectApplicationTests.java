package com.example.project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = com.example.project.HelloApplication.class)
class ProjectApplicationTests {

    @Test
    void test1() {
        System.out.println("just a empty test");
    }

}
