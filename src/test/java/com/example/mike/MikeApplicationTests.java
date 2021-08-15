package com.example.mike;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
class MikeApplicationTests {

    @Test
//    @DisplayName("测试名无")
//    @BeforeEach
//    @AfterEach
//    @BeforeAll
//    @AfterAll
//    @Disabled
//    @Timeout(value = 5)
//    @ExtendWith(SpringExtension.class)
//    @RepeatedTest(5)

    void contextLoads() {
        System.out.println("hello");
    }

}
