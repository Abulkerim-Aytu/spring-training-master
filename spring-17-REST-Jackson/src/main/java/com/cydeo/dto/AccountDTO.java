package com.cydeo.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@JsonIgnoreProperties(value = {"address", "country"}, ignoreUnknown = true)
// if I want to ignore multiple fields.
@JsonIgnoreProperties(ignoreUnknown = true)
// (ignoreUnknown = true) = Unknown fields that are coming from outside are not getting to our app.(mostly unMatch fields, we can say this is an extra protection)
public class AccountDTO {

    @JsonIgnore // Ignore field completely
    private String name;

    private String address;
    private String country;
    private String state;
    private String city;
    private Integer age;
    private String postalCode;

    @JsonBackReference  // This field is not going to be serialized (we are not going to see this object to converted as json inside AccountDTO)
    // This annotation mean hide UserDTO inside the AccountDTO
    private UserDTO user;

//    The difference between @JsonBackReference and @JsonIgnore:
//    with jsonIgnore we can not send or change hided fields that annotated with @JsonIgnore
//    with @JsonBackReference we can send or change hided fields.



}
