package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double change, change_cents;
        int owed = 0;
        int quarter = 25;
        int nickel = 5;
        int dime = 10;
        int pennie = 1;
        System.out.println("How much change is owed?: ");
        change = input.nextDouble();
        if (change < 0) {
            System.out.println("How much change is owed?: ");
            change = input.nextDouble();
        }
        change_cents = Math.round(change *100);
        while (change_cents >= 25) {
            change_cents-=quarter;
            owed++;
        }
        while (change_cents >= 10 && change_cents < 25) {
            change_cents-=dime;
            owed++;
        }
        while(change_cents >= 5 && change_cents < 10) {
            change_cents-=nickel;
            owed++;
        }
        while (change_cents >= 1 && change_cents < 10) {
            change_cents -= pennie;
            owed++;
        }
        System.out.println("Amount of coins:"+ owed);
        }
}
