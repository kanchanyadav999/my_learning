package com.find_max;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // We are trying to find the max number from the three number
        Scanner sn = new Scanner(System.in);

        int[] three_num = new int[3];
        three_num[0] = sn.nextInt();
        three_num[1] = sn.nextInt();
        three_num[2] = sn.nextInt();
        if (three_num[0] > three_num[1] && three_num[0] > three_num[2]) {
            System.out.println("the number " + three_num[0] + " is the greatest number");
        }
        else if (three_num[1] > three_num[2]) {
            System.out.println("the number " + three_num[1] + " is the greatest number");
        }
        else {
            System.out.println("the number " + three_num[2] + " is the greatest number");
    }
    }
}