package com.cydeo.controller;

import com.cydeo.dto.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/cydeo")
public class Consume_RestTemplate {

    private final String URI = "https://jsonplaceholder.typicode.com/users";
    private final RestTemplate restTemplate; // we injected this class here because we use some of its methods.

    public Consume_RestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    // getForEntity = if we want to get consuming api to our project with help of xxx the data mapped to our dto and ass output we will see what ever our dto has it.
    @GetMapping
    public ResponseEntity<User[]> realAllUsers(){
        return restTemplate.getForEntity(URI, User[].class); // this method return ResponseEntity
    }

    // getForEntity() method we can modify dto variables
    // but gerForObject we can not modify dto variables, we can just get what is gived to us.

    // getForObject = we don't have dto it is just taking the third party api and what ever json result is we will see it in our endpoint result.
    @GetMapping("{id}")
    public Object readUser (@PathVariable("id") Integer id){
        String URL = URI + "/{id}";
        return restTemplate.getForObject(URL, Object.class,id);
    }



}
