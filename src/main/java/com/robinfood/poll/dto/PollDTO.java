package com.robinfood.poll.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PollDTO {
    private Long id;
    private String name;
    List<QuestionDTO> questionList;
}
