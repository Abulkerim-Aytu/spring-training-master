package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor

public class UserAccount extends BaseEntity{

private String email;
private String password;
private String username;

@OneToOne
private AccountDetails accountDetails;

    public UserAccount(String email, String password, String username) {
        this.email = email;
        this.password = password;
        this.username = username;
    }
}
