package com.find_max.check_for_character_second_approach;

import java.util.Scanner;
// import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // this class will check if the character (char) is string,int, or special using ascii character numbers
        Scanner sn = new Scanner(System.in) ;
        char input_from_user;
        System.out.println("input your character: ");
        input_from_user = sn.next().charAt(0);

        if ((input_from_user >= 60 && input_from_user <= 90 ) ||
            (input_from_user >= 97 && input_from_user <= 122))  {
                System.out.println("This is an alphabet");
        }
        else if ((input_from_user >= 48) && (input_from_user <= 54)) {
            System.out.println("This is a Digit");
        }
        else
            System.out.println("This is a special character");
    }
}