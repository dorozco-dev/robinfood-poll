package com.robinfood.poll.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class PollDTO implements Serializable {
    private Long id;
    private String name;
    List<QuestionDTO> questionList;
}
