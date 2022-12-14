package com.example.langoal.repository;

import com.example.langoal.entities.Tutor;
import com.example.langoal.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TutorRepository extends JpaRepository<Tutor, Long> {
    List<Tutor> findTutorById (long kw);
    List<Tutor> findByEmailAndPassword(String email, String password);
    List<Tutor> findUserById (long kw);
    List<Tutor> findUserByEmail(String email);
    List<Tutor> findUserByPassword(String password);
    List <Tutor> findUserByFirstname(String email);
}
