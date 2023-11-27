package com.fadil.tugashrd.repository;

import com.fadil.tugashrd.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {
    Optional<Login> findByusername(String username);
    Optional<Login>findByPassword(String password);
    Optional<Login> findByToken(String token);

    Optional<Login> findByUsernameAndPassword(String email, String password);
}
