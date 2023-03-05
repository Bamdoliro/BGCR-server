package com.bamdoliro.bgcr.user.service;

import com.bamdoliro.bgcr.user.domain.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserServiceTest {
    @Test
    @DisplayName("생성 테스트")
    void CreatePost() {

        Long userId = 123456L;
        User user = new User(1l, "123", 1234, 1, 2020, "as", 1, 100, "as", "as", "as");
    }
}