package com.training.week1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int a, b, X;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        a = sc.nextInt();

        System.out.println("Nhập vào số thứ hai: ");
        b = sc.nextInt();

        sc.close();
        X = a * b;
        System.out.println("Tích của hai số vừa nhập là: " + X);
    }
}
