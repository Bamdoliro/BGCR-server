package com.bamdoliro.bgcr.domain.user;
import lombok.*;

import javax.persistence.*;

@Getter
@Entity
@Table(name = "tbl_user")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false, length = 50)
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