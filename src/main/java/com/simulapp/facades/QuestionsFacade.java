package com.simulapp.facades;

import com.simulapp.applications.QuestionsApplication;
import com.simulapp.entities.Questions;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionsFacade {
    private final QuestionsApplication questionsApplication;

    public QuestionsFacade(QuestionsApplication questionsApplication) {
        this.questionsApplication = questionsApplication;
    }

    public List<Questions> listQuestions() {
        return questionsApplication.obterTodosQuestions();
    }

    public Questions getQuestionsForId(int id) {
        return questionsApplication.obterQuestionsPorId(id);
    }

    public void saveQuestions(Questions questions) {
        questionsApplication.criarQuestions(questions);
    }

    public void deleteQuestions(int id) {
        questionsApplication.excluirQuestions(id);
    }

    public void updateQuestions(int id, Questions questions) {
        questionsApplication.atualizarQuestions(id, questions);
    }
}
