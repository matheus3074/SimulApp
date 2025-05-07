package com.simulapp.controllers;

import com.simulapp.entities.Questions;
import com.simulapp.facades.QuestionsFacade;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/questions")
public class QuestionsController {
    private final QuestionsFacade questionsFacade;

    public QuestionsController(QuestionsFacade questionsFacade) {
        this.questionsFacade = questionsFacade;
    }

    @GetMapping
    public List<Questions> listQuestions() {
        return questionsFacade.listQuestions();
    }

    @GetMapping("/{id}")
    public Questions getQuestions(@PathVariable int id) {
        return questionsFacade.getQuestionsForId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createQuestions(@RequestBody Questions questions) {
        questionsFacade.saveQuestions(questions);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteQuestions(@PathVariable int id) {
        questionsFacade.deleteQuestions(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateQuestions(@PathVariable int id,@RequestBody Questions questions){
        questionsFacade.updateQuestions(id, questions);
    }
}
