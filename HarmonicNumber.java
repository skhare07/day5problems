package com.bridgelabz.day5problems;

import java.util.Scanner;

public class HarmonicNumber {
int i;

    public void Harmonic() {
        System.out.println("Enter the value till you want to Print Harmonic Series : ");
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();

        for  (i = 1; i <n; i++) {

            System.out.print("1/"+i+ " +");

          }
        System.out.print("1/" +i+ "");
        }


    public static void main(String[] args) {
        HarmonicNumber obj = new HarmonicNumber();
        obj.Harmonic();
    }
}
