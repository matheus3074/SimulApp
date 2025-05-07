package com.simulapp.repositories;

import com.simulapp.Interfaces.UserAnswerRepository;
import com.simulapp.entities.UserAnswer;
import com.simulapp.repositories.JPA.UserAnswerJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserAnswerRepositoryImpl implements UserAnswerRepository {
    private final UserAnswerJpa userAnswerJpa;

    @Autowired
    public UserAnswerRepositoryImpl(UserAnswerJpa userAnswerJpa) {
        this.userAnswerJpa = userAnswerJpa;
    }

    @Override
    public UserAnswer searchByCode(Long id) {
        return this.userAnswerJpa.findById(id).orElse(null);  // Modificado para Long
    }

    @Override
    public List<UserAnswer> buscar() {
        return this.userAnswerJpa.findAll();
    }

    @Override
    public void addUserAnswer(UserAnswer userAnswer) {
        this.userAnswerJpa.save(userAnswer);
    }

    @Override
    public void removeUserAnswer(Long id) {
        this.userAnswerJpa.deleteById(id);  // Modificado para Long
    }

    @Override
    public void updateUserAnswer(Long id, UserAnswer userAnswer) {
        UserAnswer userAnswerInDb = this.userAnswerJpa.findById(id).orElse(null);
        if (userAnswerInDb != null) {
            userAnswerInDb.setRespostaSelecionada(userAnswer.getRespostaSelecionada());
            userAnswerInDb.setCorreta(userAnswer.isCorreta());

            this.userAnswerJpa.save(userAnswerInDb);
        }
    }

    @Override
    public boolean estaVazio() {
        return this.userAnswerJpa.count() == 0;
    }
}
