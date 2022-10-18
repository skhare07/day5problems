package com.bridgelabz.day5problems;

import java.util.Random;
import java.util.Scanner;

public class FlipCoin {

    public void Flip()
    {
        System.out.println("Enter Number of Flips: ");
        Scanner sc = new Scanner(System.in);
        int flips = sc.nextInt();

        int count=0;

        double headCount=0;
        double tailCount=0;

        int OutCome = 0;


        Random r = new Random();


       if(flips>0) {
           while (count < flips) {
               OutCome = r.nextInt(2);
               if (OutCome == 0) {
                   headCount++;
               } else {
                   tailCount++;
               }

               count++;
           }

           System.out.println("Head Count :" + headCount);
           System.out.println("Tail Count :" + tailCount);

           double headPercent = (double) ((headCount / flips) * 100);
           System.out.println("Head Percent : " + headPercent);
           double tailPercent = (double) ((tailCount / flips) * 100);
           System.out.println("Tail Percent : " + tailPercent);


       }
    }

    public static void main(String[] args) {

        FlipCoin obj =  new FlipCoin();
        obj.Flip();

    }

}
