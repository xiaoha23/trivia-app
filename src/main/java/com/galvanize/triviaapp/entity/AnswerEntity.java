package com.galvanize.triviaapp.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "answer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnswerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    @ToString.Exclude
    private QuestionEntity question;

    private String choice;
    private String text;
    private boolean correct;
}
