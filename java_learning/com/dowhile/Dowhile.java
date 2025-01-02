package com.dowhile;

import java.util.Scanner;

public class Dowhile{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do { 
            System.out.println("input your number: ");
            number = sc.nextInt();
            System.out.println("here is your number from the loop: ");
            System.out.println(number);
            number--;
        } while (number>=0);

        System.out.println("Here's the end of the code: ");
    }
}