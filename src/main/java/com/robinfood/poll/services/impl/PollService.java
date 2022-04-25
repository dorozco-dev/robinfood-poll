package com.robinfood.poll.services.impl;

import com.robinfood.poll.services.IPollService;
import com.robinfood.poll.dto.PollDTO;
import com.robinfood.poll.mappers.IPollMapper;
import com.robinfood.poll.repositories.PollRepository;
import org.springframework.stereotype.Service;

@Service
public class PollService implements IPollService {

    private final PollRepository pollRepository;
    private final IPollMapper pollMapper;

    public PollService(PollRepository pollRepository, IPollMapper pollMapper) {
        this.pollRepository = pollRepository;
        this.pollMapper = pollMapper;
    }

    @Override
    public PollDTO findById(Long id) {
        return this.pollMapper.pollToPollDTO(this.pollRepository.findById(id).orElse(null));
    }
}
