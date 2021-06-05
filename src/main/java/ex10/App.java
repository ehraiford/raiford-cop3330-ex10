/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Evan Raiford
 */
package ex10;

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("####.##");

        double subtotal = 0, tax = .055, total;
        int quantity;
        for(int ticker = 0; ticker < 3; ticker++)
        {
            System.out.print("Enter the price of item "+ (ticker+1)+ ": ");
            double item = in.nextDouble();
            System.out.print("Enter the quantity of item " + (ticker+1) + ": ");
            quantity = in.nextInt();
            subtotal = subtotal + (item * quantity);
        }

        tax = tax * subtotal;
        total = subtotal + tax;

        System.out.println("Subtotal: $" + dec.format(subtotal));
        System.out.println("Tax: $" + dec.format(tax));
        System.out.println("Total: $" + dec.format(total));
    }
}
