package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor

public class Genre {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

private String name;

@ManyToMany(mappedBy = "genreList")
private List<Movie> movieList;

    public Genre(String name) {
        this.name = name;
    }
}
