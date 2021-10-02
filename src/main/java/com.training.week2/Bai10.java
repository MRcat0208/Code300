package com.training.week2;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kì: ");
        String sentence = scanner.nextLine();
        System.out.println("\nChuỗi ban đầu: " + sentence);

        /*sentence = sentence.replaceAll(" ", "");
        System.out.println("Chuỗi sau khi xóa khoảng trắng: " + sentence);

        char[] ch = sentence.toCharArray();

        int count = 0;

        for (int i = 0; i < ch.length; i++)
        {
            if(ch[i] == ' '){
                count++;
                for( int j = i; j < ch.length-1; j++){
                    ch[j]= ch[j+1];
                }
            }
        }
        String sentence1 = String.valueOf(ch);
        sentence1 = sentence1.substring(0, ch.length-count);
        System.out.println("Chuỗi sau khi xóa khoảng trắng: " + sentence1 );*/


    }
}
