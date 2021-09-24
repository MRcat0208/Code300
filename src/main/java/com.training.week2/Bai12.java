package com.training.week2;
import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message;
        System.out.println("\n\nNhập vào chuỗi cần chuyển đổi: ");
        message = sc.nextLine();

        char[] charArray = message.toCharArray();
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] >= 65 && charArray[i] <= 90){
                charArray[i] += 32;
            }
        }

        System.out.println("Chuỗi sau khi đổi: \n" + message.toLowerCase());

        message = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: \n" + message);
    }
}
