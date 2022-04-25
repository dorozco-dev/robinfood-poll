package com.robinfood.poll.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "question")
public class Question implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;
    @Enumerated(EnumType.STRING)
    @Column(name="type")
    private QuestionType type;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "question")
    private List<OptionsByQuestion> options;
}
