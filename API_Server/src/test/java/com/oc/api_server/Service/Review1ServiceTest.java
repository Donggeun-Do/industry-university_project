package com.oc.api_server.Service;

import com.oc.api_server.VO.Review1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class Review1ServiceTest {

    @Autowired
    Review1Service service;

    @Test
    void saveReview1() {
        Review1 review1 = new Review1();

        review1.setTitle("제목 입니다");
        review1.setMain("메인 내용에 대한 String 집합 입니다.");
        review1.setPreview("메인에 대한 내요...");
        review1.set_image(false);
        review1.setAddress("aPI에서 받아온 정보");
        review1.setAddress_detail("사람들이 입력한 정보 값");

        service.SaveReview1(review1,3);
        System.out.println("실행");
    }
}