package com.bridgelabz.day5problems;

import java.util.Scanner;

public class VowelConsCheck {


    public void vowelconCheck() {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter any alphabet : ");
        char alpha = s.next().charAt(0);

        if(alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u')
        {
            System.out.println(alpha +" is Vowel");
        }else
            System.out.println(alpha+" is Consonant");



    }

    public static void main(String[] args) {
        VowelConsCheck obj = new VowelConsCheck();
        obj.vowelconCheck();
    }
}