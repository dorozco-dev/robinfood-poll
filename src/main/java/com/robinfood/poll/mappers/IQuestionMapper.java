package com.robinfood.poll.mappers;

import com.robinfood.poll.dto.QuestionDTO;
import com.robinfood.poll.entities.QuestionByPoll;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface IQuestionMapper {
    public List<QuestionDTO> questionByPollListToQuestionList(List<QuestionByPoll> questionByPollList);
    public QuestionDTO questionByPollToQuestion(QuestionByPoll questionByPoll);
}
