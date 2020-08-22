package com.mog.rstq.norriv.summerProject.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @Id
    private String id;

    private String link;
    private String linkVk;
    private int score;
    private String fullName;
}