package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class Genre extends BaseEntity {


private String name;


    public Genre(String name) {
        this.name = name;
    }
}
