package com.robinfood.poll.controllers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
public class PollControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void getPoll() throws Exception {
        MvcResult mvcResult = this.mockMvc.perform(get("/poll/1").accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON).content("")).andReturn();
        Assertions.assertEquals(HttpStatus.OK.value(), mvcResult.getResponse().getStatus());
    }

    @Test
    public void getPollNoContent() throws Exception {
        MvcResult mvcResult = this.mockMvc.perform(get("/poll/3").accept(MediaType.APPLICATION_JSON)
                .contentType(MediaType.APPLICATION_JSON).content("")).andReturn();
        Assertions.assertEquals(HttpStatus.NO_CONTENT.value(), mvcResult.getResponse().getStatus());
    }
}
