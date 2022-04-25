package com.robinfood.poll.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class OptionsQuestionDTO implements Serializable {
    private Long id;
    private String optionValue;
}
