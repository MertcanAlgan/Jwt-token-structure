package com.example.jwttoken.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select i from User i where i.userId = ?1")
    Optional<User> findUserByUserId(Long userId);

    Optional<User> findUserByUserName(String userName);
}
