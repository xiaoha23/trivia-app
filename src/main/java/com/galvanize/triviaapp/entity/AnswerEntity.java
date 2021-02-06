package com.galvanize.triviaapp.entity;

import lombok.*;

import javax.persistence.*;

import org.springframework.data.rest.core.annotation.RestResource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "answer")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnswerEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne(optional=false)
    @ToString.Exclude
    @JsonIgnore
    @RestResource(exported = false)
    private QuestionEntity question;

    private String choice;
    private String text;
    private boolean correct;
}
