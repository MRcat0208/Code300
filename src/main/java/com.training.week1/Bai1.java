package com.training.week1;

import java.util.Scanner;

public class Bai1
{
    /*public static void main(String[] args) {

        int a = 5, b = 15, sum;
        sum = a + b;

        System.out.println("Tổng của hai số là: "+sum);
    }*/

    public static void main(String[] args) {

        int a, b, sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số thứ nhất: ");
        a = sc.nextInt();

        System.out.println("Nhập vào số thứ hai: ");
        b = sc.nextInt();

        sc.close();
        sum = a + b;
        System.out.println("Tổng của hai số vừa nhập là: "+sum);
    }
}
