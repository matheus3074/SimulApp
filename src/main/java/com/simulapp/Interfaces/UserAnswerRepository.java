package com.simulapp.Interfaces;

import com.simulapp.entities.UserAnswer;
import com.simulapp.entities.Users;

import java.util.List;

public interface UserAnswerRepository {
    public UserAnswer searchByCode(Long id);
    public List<UserAnswer> buscar();
    public void addUserAnswer(UserAnswer userAnswer);
    public void removeUserAnswer(Long id);
    public void updateUserAnswer(Long id, UserAnswer userAnswer);
    public boolean estaVazio();
}
