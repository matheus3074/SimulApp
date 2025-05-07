package com.simulapp.controllers;

import com.simulapp.entities.UserAnswer;
import com.simulapp.facades.UserAnswerFacade;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usersAnswer")
public class UserAnswerController {
    private final UserAnswerFacade userAnswerFacade;

    public UserAnswerController(UserAnswerFacade userAnswerFacade) {
        this.userAnswerFacade = userAnswerFacade;
    }

    @GetMapping
    public List<UserAnswer> listUserAnswer() {
        return userAnswerFacade.listUserAnswer();
    }

    @GetMapping("/{id}")
    public UserAnswer getUserAnswer(@PathVariable int id) {
        return userAnswerFacade.getUserAnswerForId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createUserAnswer(@RequestBody UserAnswer userAnswer) {
        userAnswerFacade.saveUserAnswer(userAnswer);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUserAnswer(@PathVariable int id) {
        userAnswerFacade.deleteUserAnswer(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateUserAnswer(@PathVariable int id,@RequestBody UserAnswer userAnswer){
        userAnswerFacade.updateUserAnswer(id, userAnswer);
    }
}
