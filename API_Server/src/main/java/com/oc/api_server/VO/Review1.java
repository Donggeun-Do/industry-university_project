package com.oc.api_server.VO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.time.LocalDateTime;


/**
 * 자취방 리뷰
 */
@Setter @Getter
@NoArgsConstructor
public class Review1 {

    long id; //자동생성 ID (PK)

    String title; //제목
    String main; //메인 글 내용

    String preview; //10글자 이내의 내용 글
    boolean is_image; //이미지 여부

    String address1; //
    String address2; //
    Double x;
    Double y;

    int guarantee; //보증금 or 전세금
    byte price; //0-> 월세_반전세 1 -> 전세
    int money; //금액
    int management; //관리비

    int people; //평가 사람 수
    long sum_r; //평가 총 합


    long review_owner; //글쓴이 닉네임;
    float total;


    private LocalDateTime createdDate; //생성 시간

    private LocalDateTime modifiedDate; //수정 시간
}
