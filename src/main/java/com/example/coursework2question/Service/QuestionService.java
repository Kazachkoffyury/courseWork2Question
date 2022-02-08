package com.example.coursework2question.Service;

import com.example.coursework2question.Data.Question;

import java.util.Collection;

public interface QuestionService {
    Question add(Question question);
    Question remove(Question question);
    Collection<Question> getAll();
    Question getRandomQuestion();
}