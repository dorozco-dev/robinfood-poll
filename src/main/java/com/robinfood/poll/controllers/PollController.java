package com.robinfood.poll.controllers;

import com.robinfood.poll.dto.PollDTO;
import com.robinfood.poll.services.IPollService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/poll")
public class PollController {


    private final IPollService pollService;

    public PollController(IPollService pollService) {
        this.pollService = pollService;
    }

    @GetMapping
    @RequestMapping("/{id}")
    private ResponseEntity<PollDTO> createPoll(@PathVariable("id") Long id) {
        PollDTO pollDTO = this.pollService.findById(id);
        if (pollDTO == null)
            return ResponseEntity.noContent().build();

        return ResponseEntity.ok().body(pollDTO);
    }
}
