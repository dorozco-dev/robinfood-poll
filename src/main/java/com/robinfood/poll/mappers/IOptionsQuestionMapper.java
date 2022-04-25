package com.robinfood.poll.mappers;

import com.robinfood.poll.dto.OptionsQuestionDTO;
import com.robinfood.poll.entities.OptionsByQuestion;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface IOptionsQuestionMapper {
    public List<OptionsQuestionDTO> optionsByQuestionListToOptionsQuestionDTO(List<OptionsByQuestion> optionsByQuestionList);
    public OptionsQuestionDTO optionQuestionToOptionQuestionDTO(OptionsByQuestion optionsByQuestion);
}
