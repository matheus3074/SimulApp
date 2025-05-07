package com.simulapp.applications;

import com.simulapp.Interfaces.UserAnswerRepository;
import com.simulapp.entities.UserAnswer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAnswerApplication {
    private final UserAnswerRepository userAnswerRepository;

    public UserAnswerApplication(UserAnswerRepository userAnswerRepository) {
        this.userAnswerRepository = userAnswerRepository;
    }

    public List<UserAnswer> obterTodosuserAnswer() {
        return userAnswerRepository.buscar();
    }

    public UserAnswer obterUserAnswerPorId(long id) {
        return userAnswerRepository.searchByCode(id);
    }

    public void criarUserAnswer(UserAnswer userAnswer) {
        userAnswerRepository.addUserAnswer(userAnswer);
    }

    public void excluirUserAnswer(long id) {
        userAnswerRepository.removeUserAnswer(id);
    }

    public void atualizarUserAnswer(int id, UserAnswer userAnswer) {
        userAnswerRepository.updateUserAnswer((long) id, userAnswer);
    }
}
