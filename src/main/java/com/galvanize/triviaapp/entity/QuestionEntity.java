package com.galvanize.triviaapp.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.rest.core.annotation.RestResource;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "question")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionEntity {

    @Id
    @GeneratedValue
    @JsonIgnore
    @RestResource(exported = false)
    private Integer id;
    private Integer quizId;
    private Integer questionNumber;
    private String question;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "question")
    private List<AnswerEntity> answers;
    @CreatedDate
    @JsonProperty("timestamp")
    private Date createdAt;
}
