package com.training.week2;
import  java.util.Scanner;

public class Bai13 {
    public static String upCaseAll(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }
        return String.valueOf(charArray);
    }

    public static String upCaseAll2(String s) {
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i]) && charArray[i] > 97) {
                charArray[i] -= 32;
            }
        }
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input string to solve: ");
        String input = sc.nextLine();
        sc.close();
        System.out.println("Original string:\n" + input);
        input = upCaseAll2(input);
        System.out.println("String is lower:\n " + input);

    }
}
