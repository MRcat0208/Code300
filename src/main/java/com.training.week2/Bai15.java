package com.training.week2;
import java.util.Scanner;
public class Bai15 {
        public static void main(String[] args) {
        int count;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        String string = scanner.nextLine();

        char[] ch = string.toCharArray();
        System.out.println("Duplicate: ");
        for (int i = 0; i < string.length(); i++) {
            count = 1;
            for (int j = i + 1; j < string.length(); j++) {
                if (ch[i] == ch[j] && ch[i] != ' ') {
                   count++;
                   ch[j] = '0';
                }
            }
                if (count > 1 && ch[i] !='0') {
                    System.out.println("char:" + ch[i] + " was duplicate " + count + " times.");
                }
        }
    }
}

