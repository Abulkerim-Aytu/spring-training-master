package com.cydeo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

// jackson trying to convert This class(ResponseWrapper) to JSON.
// Here we use Getter and Setter because Jackson doing mapping based on getter and setter.
@Getter
@Setter
@NoArgsConstructor
public class ResponseWrapper {
    // This class is created for customize JSON Objects.
    // We will see this Object on API JSON.

    private boolean success;
    private String message;
    private Integer code;
    private Object data; // here we use Object because to handle different objects like abcDTO, htfDTO..etc.

    public ResponseWrapper(String message, Object data){
        this.message = message;
        this.data=data;
        this.code= HttpStatus.OK.value();
        this.success=true;
    }

    public ResponseWrapper(String message){
        this.message=message;
        this.code=HttpStatus.OK.value();
        this.success=true;
    }

}
