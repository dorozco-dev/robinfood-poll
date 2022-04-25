package com.robinfood.poll.config;

import com.robinfood.poll.mappers.IOptionsQuestionMapper;
import com.robinfood.poll.mappers.IPollMapper;
import com.robinfood.poll.mappers.IQuestionMapper;
import com.robinfood.poll.mappers.impl.OptionsQuestionMapper;
import com.robinfood.poll.mappers.impl.PollMapper;
import com.robinfood.poll.mappers.impl.QuestionMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanMapper {
    @Bean
    @Scope("singleton")
    public IPollMapper pollMapper() {
        return new PollMapper();
    }

    @Bean
    @Scope("singleton")
    public IQuestionMapper questionMapper() {
        return new QuestionMapper();
    }

    @Bean
    @Scope("singleton")
    public IOptionsQuestionMapper optionsQuestionMapper() {
        return new OptionsQuestionMapper();
    }
}
