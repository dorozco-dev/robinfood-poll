package com.robinfood.poll.dto;

import com.robinfood.poll.entities.QuestionType;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class QuestionDTO implements Serializable {
    private Long id;
    private String question;
    private QuestionType questionType;
    private List<OptionsQuestionDTO> optionsQuestion;
}
