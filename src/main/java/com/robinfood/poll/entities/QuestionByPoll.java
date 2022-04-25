package com.robinfood.poll.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "question_poll")
public class QuestionByPoll implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(optional = false)
    @JoinColumn(name = "questionId", nullable = false)
    private Question questionId;
    @ManyToOne(optional = false)
    private Poll poll;
}
