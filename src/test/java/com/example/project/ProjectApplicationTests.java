package com.example.project;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.example.project.HelloApplication;

@SpringBootTest(classes = HelloApplication.class)
class ProjectApplicationTests {

    @Test
    void test1() {
        System.out.println("just a empty test");
    }

}
