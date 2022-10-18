package com.bridgelabz.day5problems;

import java.util.Scanner;

public class QuotientReminder {
    public void quotrem()
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Divident");
        int divident=s.nextInt();

        System.out.println("Enter Divisor");
        int divisor= s.nextInt();

        int quotient=divident/divisor;

        int reminder= divident%divisor;

        System.out.println("Reminder : "+reminder);
        System.out.println("Quotient : "+quotient);


    }

    public static void main(String[] args) {
        QuotientReminder obj = new QuotientReminder();
        obj.quotrem();
    }
}
