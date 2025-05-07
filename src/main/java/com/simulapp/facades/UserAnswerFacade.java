package com.simulapp.facades;

import com.simulapp.applications.UserAnswerApplication;
import com.simulapp.entities.UserAnswer;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserAnswerFacade {
    private final UserAnswerApplication userAnswerApplication;

    public UserAnswerFacade(UserAnswerApplication userAnswerApplication) {
        this.userAnswerApplication = userAnswerApplication;
    }

    public List<UserAnswer> listUserAnswer() {
        return userAnswerApplication.obterTodosUserAnswer();
    }

    public UserAnswer getUserAnswerForId(int id) {
        return userAnswerApplication.obterUserAnswerPorId(id);
    }

    public void saveUserAnswer(UserAnswer userAnswer) {
        userAnswerApplication.criarUserAnswer(userAnswer);
    }

    public void deleteUserAnswer(int id) {
        userAnswerApplication.excluirUserAnswer(id);
    }

    public void updateUserAnswer(int id, UserAnswer userAnswer) {
        userAnswerApplication.atualizarUserAnswer(id, userAnswer);
    }
}
