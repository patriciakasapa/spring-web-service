package io.turntabl.springwebservice.controllers;

import io.turntabl.springwebservice.models.Number;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathsController {

    @GetMapping("add")
    public Number add(
            @RequestParam(name = "num1", defaultValue = "0")
            Integer num1,
            @RequestParam(name = "num2", defaultValue = "0")
            Integer num2){
        int first = Integer.parseInt(String.valueOf(num1));
        int second = Integer.parseInt(String.valueOf(num2));
        int value = first + second;
        Number number = new Number();
        number.setValue(value);
        return number;
    }

    @GetMapping("subtract")
    public Number subtact(
            @RequestParam(name = "num1", defaultValue = "0")
                    Integer num1,
            @RequestParam(name = "num2", defaultValue = "0")
                    Integer num2){
        int first = Integer.parseInt(String.valueOf(num1));
        int second = Integer.parseInt(String.valueOf(num2));
        int value = first - second;
        Number number = new Number();
        number.setValue(value);
        return number;
    }

}