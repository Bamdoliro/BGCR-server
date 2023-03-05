package com.bamdoliro.bgcr.user.controller;

import com.bamdoliro.bgcr.user.request.UserSignUpRequest;
import com.bamdoliro.bgcr.user.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class HomeController {

    private final UserService userService;

    @GetMapping("/signup")
    public ResponseEntity signup(@RequestBody UserSignUpRequest userSignUpRequest) {
        log.info("password = {}, userName = {}",userSignUpRequest.getPassword(), userSignUpRequest.getUserName());
        if (userService.signup(userSignUpRequest).equals("OK")) {
            return new ResponseEntity(HttpStatus.CREATED);
        }
        return new ResponseEntity(HttpStatus.BAD_REQUEST);
    }
}
