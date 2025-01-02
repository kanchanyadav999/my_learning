package com.find_max.check_for_character;
// import java.lang.classfile.CodeBuilder;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
        char variable;

        // this class takes an input from the user and check its type
        Scanner sn = new Scanner(System.in);
        String input = sn.nextLine();
        
        variable = input.charAt(0);
        System.out.println(variable);
        // System.out.println(type(variable));
        // if ((variable >= 'a' && variable <= 'z') || (variable >= 'A' && variable <= 'Z')) {
        if (Character.isLetter(variable)) {
            System.out.println("Print the variable is of the type of a string");
        } else if (Character.isDigit(variable)) {
            System.out.println("Print the variable is of the type of a Integer");
        } else {
            System.out.println("Print the variable is special character type");
        } 
        sn.close();
        } 
        catch (Exception exception)   {
            char character_from_user;
            Scanner sn2 = new Scanner(System.in);
            character_from_user = sn2.next().charAt(0);

        if ((character_from_user >= 'a' && character_from_user <= 'z') || (character_from_user >= 'A' && character_from_user <= 'Z')) {
            System.out.println("Print the variable is of the type of a string");
        } else if ((character_from_user >=0 && (character_from_user <= 9))) {
            System.out.println("Print the variable is of the type of a Integer");
        } else {
            System.out.println("Print the variable is special character type");
        }
        sn2.close();
    }
}
}