package com.bamdoliro.bgcr.user.domain;
import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "users") //Entity와 Mapping 할 Table 지정
@AllArgsConstructor
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED) //파라미터가 없는 생성자 생성 access: 속성값이 protected인 경우(권장), 외부에서 무분별하게 해당 Entity의 객체 생성 방지, AccessLevel.PROTECTED: 생성자 기본 접근권한을 protected
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT pk의 값이 자동으로 1씩 증가 한번 사용한 값은 재사용x
    private Long userId;

    @Column(nullable = false, length = 20) //length 문자열 길이 제한, String에서만 사용 가능
    private String userName;

    @Column(nullable = false)
    private int password;

    @Column(nullable = false)
    private int studentNumber;

    @Column(nullable = false)
    private int admissionYear;

    @Column(length = 50)
    private String email;

    @Column(nullable = false)
    private int ranking;

    @Column(nullable = false)
    private int amountOfCommit;

    @Column( length = 300)
    private String profileImage;

    @Column(length = 100)
    private String githubId;

    @Column( length = 100)
    private String githubBio;
}