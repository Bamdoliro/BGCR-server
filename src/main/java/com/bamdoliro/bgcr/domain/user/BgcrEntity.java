package com.bamdoliro.bgcr.domain.user;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class BgcrEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private int studentNumber;

    @Column(nullable = false)
    private int admissionYear;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private int rank;

    @Column(nullable = false)
    private int amountOfCommit;

    @Column(nullable = false)
    private String profileImage;

    @Column(nullable = false)
    private String githubId;

    @Column(nullable = false)
    private String githubBio;

    @Builder
    public BgcrEntity(Long userId, String name, int studentNumber, int admissionYear, String email, int rank, int amountOfCommit, String profileImage, String githubId, String githubBio){
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