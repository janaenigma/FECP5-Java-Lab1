package org.example;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");

        float tempCel = myObj.nextFloat();
        double tempFar = tempCel * 1.8 + 32;
        System.out.printf("Temperature in Fahrenheit: " + "%.2f%n", tempFar);
    }
}