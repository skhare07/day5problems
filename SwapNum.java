package com.bridgelabz.day5problems;

import java.util.Scanner;

public class SwapNum {

    public void swapnumber()
    {
        int temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1= s.nextInt();
        System.out.print("Enter num2 : ");
        int num2=s.nextInt();

        System.out.println("Before swap : " +num1+ " "+num2);
        temp=num1;
        num1=num2;
        num2=temp;

        System.out.println("After swap : " +num1+ " "+num2);




    }

    public static void main(String[] args) {
        SwapNum obj = new SwapNum();
        obj.swapnumber();
    }
}
