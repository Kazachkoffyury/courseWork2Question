package com.example.coursework2question.Service;

import com.example.coursework2question.Data.Question;

import java.util.Collection;

public interface ExaminerService {
    Collection<Question> getQuestion(int amount);
}
