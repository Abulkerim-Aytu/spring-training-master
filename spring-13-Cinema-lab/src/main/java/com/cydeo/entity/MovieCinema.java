package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Data
public class MovieCinema extends BaseEntity{

    @Column(columnDefinition = "DATE")
    private LocalDate dateTime;

    @ManyToOne
    private Cinema cinema;

    @ManyToOne
    private Movie movie;


    public MovieCinema(LocalDate dateTime) {
        this.dateTime = dateTime;
    }
}
