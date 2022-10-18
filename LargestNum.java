package com.bridgelabz.day5problems;

import java.util.Scanner;

public class LargestNum {
    public void largestNum()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter num1 : ");
        int a= s.nextInt();
        System.out.println("Enter num2 : ");
        int b= s.nextInt();
        System.out.println("Enter num3 : ");
        int c= s.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is largest");
            }else {
                System.out.println(c+" is largest");
            }
        }else if (b>a)
        {
            if(b>c)
            {
                System.out.println(b+" is largest");
            }else
            {
                System.out.println(c+" is largest");
            }


            }

        }


    public static void main(String[] args) {
        LargestNum obj = new LargestNum();

        obj.largestNum();
    }
}
