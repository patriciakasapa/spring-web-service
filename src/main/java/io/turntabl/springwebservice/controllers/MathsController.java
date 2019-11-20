package io.turntabl.springwebservice.controllers;

import io.turntabl.springwebservice.models.Number;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathsController {
    @Autowired
    private Maths operation;

    @GetMapping("add")
    public Number add(
            @RequestParam(name = "num1", defaultValue = "0")
            Integer num1,
            @RequestParam(name = "num2", defaultValue = "0")
            Integer num2){
        int first = Integer.parseInt(String.valueOf(num1));
        int second = Integer.parseInt(String.valueOf(num2));

        Number number = new Number();
        number.setValue(this.operation.add(first, second));
        return number;
    }

    @GetMapping("subtract")
    public Number subtract(
            @RequestParam(name = "num1", defaultValue = "0")
                    Integer num1,
            @RequestParam(name = "num2", defaultValue = "0")
                    Integer num2){
        int first = Integer.parseInt(String.valueOf(num1));
        int second = Integer.parseInt(String.valueOf(num2));

        Number number = new Number();
        number.setValue(this.operation.subtract(first, second));
        return number;
    }

}