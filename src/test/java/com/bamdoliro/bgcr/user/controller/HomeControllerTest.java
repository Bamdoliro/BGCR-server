package com.bamdoliro.bgcr.user.controller;

import com.bamdoliro.bgcr.user.request.UserSignUpRequest;
import com.bamdoliro.bgcr.user.service.UserService;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HomeController.class)
public class HomeControllerTest {
    private MockMvc mockMvc;

    @Test
    public void homeTest() throws Exception {

        mockMvc.perform(get("/signup"))
                .andExpect(status().isOk());
    }
}