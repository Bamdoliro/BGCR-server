package com.bamdoliro.bgcr.user.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public final class UserSignUpRequest {
    private int password;
    private String userName;
}