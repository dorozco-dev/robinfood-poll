package com.robinfood.poll.mappers;

import com.robinfood.poll.dto.PollDTO;
import com.robinfood.poll.entities.Poll;
import org.mapstruct.Mapper;

@Mapper
public interface IPollMapper {
    public PollDTO pollToPollDTO(Poll poll);
}
