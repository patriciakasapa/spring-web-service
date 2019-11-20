package io.turntabl.springwebservice.controllers;

import org.springframework.context.annotation.Bean;


public class Maths {
    public int add(int num1, int num2){
        return num1 + num2;
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }
}
