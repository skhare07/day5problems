package com.bridgelabz.day5problems;

import java.util.Scanner;


public class PowerOf2 {
    public void powerof2()
    {
        System.out.println("Enter value of power not more than 30");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int result =1;

        for(int i = 1 ; i<=num ; i++)

        {
           result=result*2;
            System.out.println(result);
        }

    }

    public static void main(String[] args) {
        PowerOf2 obj = new PowerOf2();
        obj.powerof2();


    }

}
