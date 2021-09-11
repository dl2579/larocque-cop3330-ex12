package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "Enter the principal: " );
        float P = sc.nextFloat();

        System.out.print("Enter the rate of interest (%): ");
        float r = sc.nextFloat();

        System.out.print("Enter the number of years: ");
        int t = sc.nextInt();

        float A = P*(1+ (r/100) *t); //amt at end of investment

        System.out.printf("After %d years at %.1f%%, the investment will be worth $%.2f.%n", t, r, A);
    }
}
