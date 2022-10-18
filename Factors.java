package com.bridgelabz.day5problems;

import java.util.Scanner;

public class Factors {
    int result;
    public void factors() {

        System.out.println("Enter number: " );
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 2; i*i <= n; i++) {
            while(n%i==0)
            {
                System.out.print(i+ " ");
                n=n/i;
            }

        }
        if(n!=1) {
            System.out.println(n);
        }
        }
    public static void main(String[] args) {
        Factors obj = new Factors();
        obj.factors();
    }
}
