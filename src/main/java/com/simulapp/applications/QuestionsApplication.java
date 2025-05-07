package com.simulapp.applications;

import com.simulapp.Interfaces.QuestionsRepository;
import com.simulapp.entities.Questions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionsApplication {
    private final QuestionsRepository questionsRepository;

    public QuestionsApplication(QuestionsRepository questionsRepository) {
        this.questionsRepository = questionsRepository;
    }

    public List<Questions> obterTodosQuestions() {
        return questionsRepository.buscar();
    }

    public Questions obterQuestionsPorId(long id) {
        return questionsRepository.searchByCode(id);
    }

    public void criarQuestions(Questions questions) {
        questionsRepository.addQuestions(questions);
    }

    public void excluirQuestions(long id) {
        questionsRepository.removeQuestions(id);
    }

    public void atualizarQuestions(int id, Questions questions) {
        questionsRepository.updateQuestions((long) id, questions);
    }
}
