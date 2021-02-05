package com.galvanize.triviaapp.model;

import org.springframework.beans.BeanUtils;

import com.galvanize.triviaapp.entity.AnswerEntity;

import lombok.Data;

@Data
public class AnswerDTO {
    private String text;
    private boolean correct;
    private String choice;
    public AnswerDTO (AnswerEntity entity) {
    	BeanUtils.copyProperties(entity, this);
    }
}
