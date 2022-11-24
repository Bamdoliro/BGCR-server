package com.bamdoliro.bgcr.user.domain.repository;


import com.bamdoliro.bgcr.user.domain.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void save(){
        //given
        String name = "김석진";
        final User user = User.builder().name(name).build();
        //when
        final User savedUser = userRepository.save(user);
        //then
        assertEquals(name, savedUser.getName());

    }
}