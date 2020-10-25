package com.company;

import com.company.calculator.Complexe;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Complexe value = new Complexe(2,5,6,7);
        value.addition();
        value.show();
        value.division();
        value.show();
        value.multiplication();
        value.show();
        value.subtraction();
        value.show();
    }
}
