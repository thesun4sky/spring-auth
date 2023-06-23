package com.thesun4sky.springauth;

import com.thesun4sky.springauth.food.Food;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    // @Primary보다 @Qualifier의 우선순위가 더 높음
    // 더 많이 쓰는 곳에 @Primary 붙이기
    /* 밑에 food는 @Primary가 붙어있는 Chicken을 참조
    @Autowired
    Food food;
     */

    @Autowired
    @Qualifier("pizza")
	Food food;

    @Test
    @DisplayName("테스트")
    void test1() {
        food.eat();
    }
}
