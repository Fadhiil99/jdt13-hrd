package com.fadil.tugashrd.repository;

import com.fadil.tugashrd.entity.Hrd;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface HrdRepository extends JpaRepository<Hrd, Integer> {

    Optional<Hrd> findByUsernameAndPassword(String email, String password);
}
