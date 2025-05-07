package com.simulapp.Interfaces;

import com.simulapp.entities.Questions;
import com.simulapp.entities.UserAnswer;

import java.util.List;

public interface QuestionsRepository {
    public Questions searchByCode(Long id);
    public List<Questions> buscar();
    public void addQuestions(Questions questions);
    public void removeQuestions(Long id);
    public void updateQuestions(Long id, Questions questions);
    public boolean estaVazio();
}
