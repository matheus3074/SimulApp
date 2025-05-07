package com.simulapp.repositories.JPA;

import com.simulapp.entities.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionsJpa extends JpaRepository<Questions, Long>{
}
