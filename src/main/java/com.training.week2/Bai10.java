package com.training.week2;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập một chuỗi bất kì: ");
        String sentence = scanner.nextLine();
        System.out.println("\nChuỗi ban đầu: " + sentence);

        sentence = sentence.replaceAll(" ", "");
        System.out.println("Chuỗi sau khi xóa khoảng trắng: " + sentence);
    }
}
