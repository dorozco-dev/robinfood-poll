package com.robinfood.poll.services;

import com.robinfood.poll.dto.PollDTO;

public interface IPollService {
    public PollDTO findById(Long id);
}
