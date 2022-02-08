package com.example.coursework2question;

import com.example.coursework2question.Exception.TooManyQuestion;
import com.example.coursework2question.Service.impl.ExaminerServiceImpl;
import com.example.coursework2question.Service.impl.QuestionServiceImpl;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class ExaminerServiceTest {
    @Mock
    private QuestionServiceImpl questionServiceImpl;

    @InjectMocks
    private ExaminerServiceImpl examinerServiceImpl;

    @Test
    void shouldGetRandomQuestionWrongAmount() {
        assertThrows(TooManyQuestion.class,()-> examinerServiceImpl.getQuestion(1));
    }
}
