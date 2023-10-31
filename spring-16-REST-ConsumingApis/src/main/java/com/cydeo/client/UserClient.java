package com.cydeo.client;

import com.cydeo.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(url = "https://jsonplaceholder.typicode.com", name = "USER-CLIENT") // naming is important in MicroServices
public interface UserClient {

    @GetMapping("/users")
    List<User> getUsers(); // when ever we call this method above url endpoint gonna executed with getMapping just like controller.
}
