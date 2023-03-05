package com.bamdoliro.bgcr.user.service;

import com.bamdoliro.bgcr.user.domain.User;
import com.bamdoliro.bgcr.user.domain.repository.UserRepository;
import com.bamdoliro.bgcr.user.request.UserSignUpRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public String signup(UserSignUpRequest userSignUpRequest){
        userRepository.save(User.builder()
                .password(userSignUpRequest.getPassword())
                .userName(userSignUpRequest.getUserName())

                .build());
        return "OK";
    }
}
