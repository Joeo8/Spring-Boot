package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: Joeo8
 * Time: 16:54
 * Description: No Description
 */
@RestController
public class HelloJollyController {
    @RequestMapping("/hello")
    public String hello(){
        return " Hello Jolly,This is Spring Boot !";
    }
}
