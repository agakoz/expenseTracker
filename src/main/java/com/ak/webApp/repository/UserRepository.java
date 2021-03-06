package com.ak.webApp.repository;

import com.ak.webApp.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(@Param("username") String username);

    User findFirstByOrderByUserIdDesc();


    Optional<User> findByUserId(@Param("userId")int userId);
}
