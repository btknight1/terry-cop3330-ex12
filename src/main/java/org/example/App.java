/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brandon Terry
 */
package org.example;
import java.util.Scanner;
public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: " );
        double principal = input.nextDouble();

        System.out.print("Enter the rate of interest: ");
        double interest_rate = input.nextDouble();

        System.out.print("Enter the number of years: ");
        double years = input.nextDouble();

        System.out.printf("After %.0f years at %.1f%%, the investment will be worth $%.0f.", years, interest_rate, principal*(1+((interest_rate/100)*years)));
    }
}