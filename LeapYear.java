package com.bridgelabz.day5problems;

import java.util.Scanner;

public class LeapYear {
    public void leapYear()
    {
        System.out.println("Enter year (4digit)");
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();


        if(year%4==0)
        {
            if(year%100==0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is Leap Year");
                }else {
                    System.out.println(year + " is not Leap Year");
                }
            }
                else {
                System.out.println(year+" is Leap Year");

            }
            }else
        {
            System.out.println(year + " is not Leap Year");
        }

        }

    public static void main(String[] args) {
        LeapYear obj = new LeapYear();
      // while(true)
        obj.leapYear();
    }
}


