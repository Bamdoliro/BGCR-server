package com.bamdoliro.bgcr.user.domain.repository;

import com.bamdoliro.bgcr.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long>{

}