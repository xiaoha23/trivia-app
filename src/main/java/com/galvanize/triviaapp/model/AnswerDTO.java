package com.galvanize.triviaapp.model;

import lombok.Data;

@Data
public class AnswerDTO {
    private String text;
    private boolean correct;
    private String choice;
}
