package com.robinfood.poll.mappers.impl;

import com.robinfood.poll.dto.OptionsQuestionDTO;
import com.robinfood.poll.entities.OptionsByQuestion;
import com.robinfood.poll.mappers.IOptionsQuestionMapper;

import java.util.ArrayList;
import java.util.List;

public class OptionsQuestionMapper implements IOptionsQuestionMapper {
    @Override
    public List<OptionsQuestionDTO> optionsByQuestionListToOptionsQuestionDTO(List<OptionsByQuestion> optionsByQuestionList) {
        if (optionsByQuestionList == null) {
            return new ArrayList<>();
        }

        List<OptionsQuestionDTO> questionDTOList = new ArrayList<>();

        for (OptionsByQuestion optionsByQuestion : optionsByQuestionList) {
            questionDTOList.add(this.optionQuestionToOptionQuestionDTO(optionsByQuestion));
        }

        return questionDTOList;
    }

    @Override
    public OptionsQuestionDTO optionQuestionToOptionQuestionDTO(OptionsByQuestion optionsByQuestion) {
        if (optionsByQuestion == null) {
            return null;
        }

        OptionsQuestionDTO optionsQuestionDTO = new OptionsQuestionDTO();

        optionsQuestionDTO.setId(optionsByQuestion.getId());
        optionsQuestionDTO.setOptionValue(optionsByQuestion.getOptionValue());


        return optionsQuestionDTO;
    }
}
