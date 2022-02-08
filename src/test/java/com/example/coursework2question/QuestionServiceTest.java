package com.example.coursework2question;

import com.example.coursework2question.Exception.DuplicateQuestion;
import com.example.coursework2question.Exception.QuestionNotFound;
import com.example.coursework2question.Service.QuestionService;
import com.example.coursework2question.Service.impl.QuestionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.example.coursework2question.Constants.QUEST1;
import static com.example.coursework2question.Constants.QUEST2;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class QuestionServiceTest {
    private QuestionService out;

    @BeforeEach
    void  setUp() {
        out = new QuestionServiceImpl();
    }
    @Test
    void shouldAddQuestionDuplicate() {
        out.add(QUEST1);
        assertThrows(DuplicateQuestion.class, () -> out.add(QUEST1));
    }
    @Test
    void shouldRemoveQuestionNotFound(){
        out.add(QUEST1);
        assertThrows(QuestionNotFound.class,()-> out.remove(QUEST2));
    }


}
