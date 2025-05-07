package com.simulapp.repositories.JPA;

import com.simulapp.entities.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAnswerJpa extends JpaRepository<UserAnswer, Long> {
}
