package io.turntabl.springwebservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathsController {

    @GetMapping
    public Number add(
            @RequestParam(name = "num1", defaultValue = "0")
            Integer num1,
            @RequestParam(name = "num2", defaultValue = "0")
            Integer num2){
        int first = Integer.parseInt(String.valueOf(num1));
        int second = Integer.parseInt(String.valueOf(num2));
        return first + second;
    }

    @GetMapping
    public Number subtract(
            @RequestParam(name = "num1", defaultValue = "0")
                    Integer num1,
            @RequestParam(name = "num2", defaultValue = "0")
                    Integer num2){
        int first = Integer.parseInt(String.valueOf(num1));
        int second = Integer.parseInt(String.valueOf(num2));
        return first - second;
    }
}
