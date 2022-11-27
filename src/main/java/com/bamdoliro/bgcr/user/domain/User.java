package com.bamdoliro.bgcr.user.domain;
import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "tbl_user") //Entity와 Mapping 할 Table 지정
@NoArgsConstructor(access = AccessLevel.PROTECTED) //파라미터가 없는 생성자 생성 access: 속성값이 protected인 경우(권장), 외부에서 무분별하게 해당 Entity의 객체 생성 방지

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT pk의 값이 자동으로 1씩 증가 한번 사용한 값은 재사용x
    private Long userId;

    @Column(nullable = false, length = 50) //length 문자열 길이 제한, String에서만 사용 가능
    private String name;

    @Column(nullable = false)
    private int studentNumber;

    @Column(nullable = false)
    private int admissionYear;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false)
    private int rank;

    @Column(nullable = false)
    private int amountOfCommit;

    @Column(nullable = false, length = 300)
    private String profileImage;

    @Column(nullable = false, length = 100)
    private String githubId;

    @Column(nullable = false, length = 100)
    private String githubBio;

    @Builder
    public User(Long userId, String name, int studentNumber, int admissionYear, String email, int rank, int amountOfCommit, String profileImage, String githubId, String githubBio){
        this.userId = userId;
        this.name = name;
        this.studentNumber = studentNumber;
        this.admissionYear = admissionYear;
        this.email = email;
        this.rank = rank;
        this.amountOfCommit = amountOfCommit;
        this.profileImage = profileImage;
        this.githubId = githubId;
        this.githubBio = githubBio;
    }

}