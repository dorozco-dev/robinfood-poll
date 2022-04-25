package com.robinfood.poll.mappers.impl;

import com.robinfood.poll.dto.QuestionDTO;
import com.robinfood.poll.entities.Question;
import com.robinfood.poll.entities.QuestionByPoll;
import com.robinfood.poll.mappers.IOptionsQuestionMapper;
import com.robinfood.poll.mappers.IQuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class QuestionMapper implements IQuestionMapper {

    @Autowired
    private IOptionsQuestionMapper optionsQuestionMapper;

    @Override
    public List<QuestionDTO> questionByPollListToQuestionList(List<QuestionByPoll> questionByPollList) {
        if (questionByPollList == null) {
            return new ArrayList<>();
        }

        List<QuestionDTO> questionDTOList = new ArrayList<>();

        for (QuestionByPoll questionByPoll : questionByPollList) {
            questionDTOList.add(this.questionByPollToQuestion(questionByPoll));
        }

        return questionDTOList;
    }

    @Override
    public QuestionDTO questionByPollToQuestion(QuestionByPoll questionByPoll) {
        if (questionByPoll == null) {
            return null;
        }

        QuestionDTO questionDTO = null;

        if (questionByPoll.getQuestionId() != null) {
            questionDTO = new QuestionDTO();
            Question question = questionByPoll.getQuestionId();
            questionDTO.setId(question.getId());
            questionDTO.setQuestion(question.getQuestion());
            questionDTO.setQuestionType(question.getType());
            questionDTO.setOptionsQuestion(this.optionsQuestionMapper.optionsByQuestionListToOptionsQuestionDTO(questionByPoll.getQuestionId().getOptions()));
        }


        return questionDTO;
    }
}
