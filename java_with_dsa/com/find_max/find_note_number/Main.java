package com.find_max.find_note_number;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /* so this class basically takes an integer input from the 
        * user and checks how many minimum number of notes (Rs. 500, 100, 50, 20, 10, 5, 2, 1)
        * required for the amount.
        * */
        int user_int;
        int notes_of_500, notes_of_100, notes_of_50, notes_of_20, notes_of_10, notes_of_5, notes_of_2, notes_of_1;
        notes_of_500=  notes_of_100= notes_of_50= notes_of_20= notes_of_10= notes_of_5= notes_of_2= notes_of_1 = 0;
        

        Scanner sc = new Scanner(System.in);
        System.out.println(" Input the number to find the no. of notes required: ");

        user_int = sc.nextInt() ;
        // int notes[] = {5,2};  // {500,100,50,20,10,5,2,1};
        if (user_int >= 500) {
            notes_of_500 = user_int / 500;
            user_int -= notes_of_500 * 500; 
        }
        if (user_int >= 100) {
            notes_of_100 = user_int / 100;
            user_int -= notes_of_100 * 100; 
        }
        if (user_int >= 50) {
            notes_of_50 = user_int / 50;
            user_int -= notes_of_50 * 50; 
        }
        if (user_int >= 20) {
            notes_of_20 = user_int / 20;
            user_int -= notes_of_20 * 20; 
        }
        if (user_int >= 10) {
            notes_of_10 = user_int / 10;
            user_int -= notes_of_10 * 10; 
        }
        if (user_int >= 5) {
            notes_of_5 = user_int / 5;
            user_int -= notes_of_5 * 5; 
        }
        if (user_int >= 2) {
            notes_of_2 = user_int / 2;
            user_int -= notes_of_2 * 2; 
        }
        if (user_int >= 1) {
            user_int = notes_of_1 ; 
        }

        System.out.println("the number of 500 notes required is " + notes_of_500);
        System.out.println("the number of 100 notes required is " + notes_of_100);
        System.out.println("the number of 50 notes required is " + notes_of_50);
        System.out.println("the number of 20 notes required is " + notes_of_20);
        System.out.println("the number of 10 notes required is " + notes_of_10);
        System.out.println("the number of 5 notes required is " + notes_of_5);
        System.out.println("the number of 2 notes required is " + notes_of_2);
        System.out.println("the number of 1 notes required is " + notes_of_1);

        sc.close();
    }
}