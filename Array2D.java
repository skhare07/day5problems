package com.bridgelabz.day5problems;

import java.util.Scanner;

public class Array2D {

    public static void array2d() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter row : ");
        int m = s.nextInt();
        System.out.println("Enter Column : ");
        int n = s.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter element");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("Array : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();


        }
    }
    public static void main(String[] args) {

        array2d();
    }
}




