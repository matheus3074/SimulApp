package com.simulapp.repositories;

import com.simulapp.Interfaces.QuestionsRepository;
import com.simulapp.entities.Questions;
import com.simulapp.repositories.JPA.QuestionsJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuestionsRepositoryImpl implements QuestionsRepository {
    private final QuestionsJpa questionsJpa;

    @Autowired
    public QuestionsRepositoryImpl(QuestionsJpa questionsJpa) {
        this.questionsJpa = questionsJpa;
    }

    @Override
    public Questions searchByCode(Long id) {
        return this.questionsJpa.findById(id).orElse(null);  // Modificado para Long
    }

    @Override
    public List<Questions> buscar() {
        return this.questionsJpa.findAll();
    }

    @Override
    public void addQuestions(Questions questions) {
        this.questionsJpa.save(questions);
    }

    @Override
    public void removeQuestions(Long id) {
        this.questionsJpa.deleteById(id);  // Modificado para Long
    }

    @Override
    public void updateQuestions(Long id, Questions questions) {
        Questions questionsInDb = this.questionsJpa.findById(id).orElse(null);
        if (questionsInDb != null) {
            questionsInDb.setAlternativa(questions.getAlternativa());
            questionsInDb.setAno(questions.getAno());
            questionsInDb.setPergunta(questions.getPergunta());

            this.questionsJpa.save(questionsInDb);
        }
    }

    @Override
    public boolean estaVazio() {
        return this.questionsJpa.count() == 0;
    }
}
