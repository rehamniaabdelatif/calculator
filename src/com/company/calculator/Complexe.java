package com.company.calculator;

class DoubleNumber {
    int real;
    int imaginary;
}

public class Complexe {
    DoubleNumber input_1 = new DoubleNumber();
    DoubleNumber input_2 = new DoubleNumber();
    DoubleNumber result = new DoubleNumber();

    public Complexe( int real_1, int imag_1, int real_2, int imag_2){
        this.input_1.real = real_1;
        this.input_1.imaginary = imag_1;
        this.input_2.real = real_2;
        this.input_2.imaginary = imag_2;
    }

    public void addition(){
        result.real = input_1.real + input_2.real;
        result.imaginary = input_1.imaginary + input_2.imaginary;
    }

    public void subtraction(){
        result.real = input_1.real - input_2.real;
        result.imaginary = input_1.imaginary - input_2.imaginary;
    }

    public void multiplication(){
        result.real = input_1.real * input_2.real - input_1.imaginary * input_2.imaginary;
        result.imaginary = input_1.real * input_2.imaginary + input_1.imaginary * input_2.real;
    }

    public void division(){
        result.real = (input_1.real * input_2.real + input_1.imaginary * input_2.imaginary)/(input_2.real * input_2.real + input_2.imaginary * input_2.imaginary);
        result.imaginary = (input_1.imaginary * input_2.real - input_1.real * input_2.imaginary)/(input_2.real * input_2.real + input_2.imaginary * input_2.imaginary);
    }

    public void show(){
        System.out.println(result.real + " + " +result.imaginary + "i");
    }

}
