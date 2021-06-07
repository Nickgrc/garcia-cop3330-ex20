import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nickolas Garcia
 */

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        String order = in.nextLine();

        System.out.print("What state do you live in? ");
        String state = in.nextLine();

        double tax = 0;
        double a = Double.parseDouble(order);

        if("Wisconsin".equals(state)) {
            tax = 0.05;
            System.out.print("What county do you live in? ");
            String county = in.nextLine();
            if("Eau Claire".equals(county)){
                tax = tax + 0.005;
            }else if("Dunn".equals(county)){
                tax = tax + 0.004;
            }
        }
        else if("Illinois".equals(state)){
            tax = 0.08;
        }

        double b = tax * a;
        double total = b + a;

        String s = String.format("%.2f", total);
        String g = String.format("%.2f", b);

        System.out.print("The tax is $" + g + ".\nThe total is $" + s + ".");
    }
}