package com.robinfood.poll.mappers.impl;

import com.robinfood.poll.entities.Poll;
import com.robinfood.poll.dto.PollDTO;
import com.robinfood.poll.mappers.IPollMapper;
import com.robinfood.poll.mappers.IQuestionMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class PollMapper implements IPollMapper {

    @Autowired
    private IQuestionMapper questionMapper;

    @Override
    public PollDTO pollToPollDTO(Poll poll) {
        if (poll == null) {
            return null;
        }

        PollDTO pollDTO = new PollDTO();

        pollDTO.setId(poll.getId());
        pollDTO.setName(poll.getName());
        pollDTO.setQuestionList(this.questionMapper.questionByPollListToQuestionList(poll.getQuestionByPollList()));

        return pollDTO;
    }
}
