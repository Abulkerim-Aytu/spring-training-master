package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor

public class Ticket {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

@Column(columnDefinition = "DATE")
private LocalDate dateTime;

private int seatNumber;
private int rowNumber;

@ManyToOne
private UserAccount userAccount;

@ManyToOne
private MovieCinema movieCinema;

    public Ticket(LocalDate dateTime, int seatNumber, int rowNumber) {
        this.dateTime = dateTime;
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
    }
}
