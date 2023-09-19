package com.cydeo.entity;

import com.cydeo.enums.State;
import com.cydeo.enums.Types;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class Movie extends BaseEntity{

private int duration;

private String name;

private BigDecimal price;

@Column(columnDefinition = "DATE")
private LocalDate releaseDate;

@Enumerated(EnumType.STRING)
private State state;

private String summary;

@Enumerated(EnumType.STRING)
private Types type;

@ManyToMany
@JoinTable(name = "MovieGenreRel")
private List<Genre> genre;

    public Movie(Integer duration, String name, BigDecimal price, LocalDate releaseDate, State state, String summary, Types type) {
        this.duration = duration;
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
        this.state = state;
        this.summary = summary;
        this.type = type;
    }

}
