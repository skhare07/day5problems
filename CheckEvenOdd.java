package com.bridgelabz.day5problems;

import java.util.Scanner;

public class CheckEvenOdd {


    public void EvenOddCheck() {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = s.nextInt();

        if(num%2==0)
        {
            System.out.println(+num+" is Even");

        }else
            System.out.println(+num+" is Odd");

    }

    public static void main(String[] args) {
        CheckEvenOdd obj=new CheckEvenOdd();
        obj.EvenOddCheck();
    }
}