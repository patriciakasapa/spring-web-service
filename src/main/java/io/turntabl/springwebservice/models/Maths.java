package io.turntabl.springwebservice.models;

@Bean
public class Maths {
    private int firstNumber;
    private int secondNumber;

    public void setFirstNumber (int firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber (int secondNumber){
        this.secondNumber = secondNumber;
    }

    public int getFirstNumber() {
        return this.firstNumber;
    }

    public int getSecondNumber () {
        return this.secondNumber;
    }

}
