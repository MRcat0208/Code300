package com.training.week2;
import java.io.InputStream;
import java.util.Scanner;

public class Bai8 {
    static float P;
    static float R;
    static float T;

    private static double nhapSoLieu(InputStream in) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập vào số tiền gửi vào ngân hàng : ");
        P = scan.nextFloat();
        System.out.print("Nhập vào lãi xuất hàng năm (%) : ");
        R = scan.nextFloat();
        System.out.print("Nhập vào thời gian gửi (tính bằng năm) : ");
        T = scan.nextFloat();
        scan.close();
        return 0;
    }

    public static double tinhLaiSuat(){
        return (P * R * T) / 100;
    }

    public static void main(String args[])
    {
        double S = nhapSoLieu(System.in);
        double laiSuat = tinhLaiSuat();
        System.out.print("Số tiền lãi là: " +laiSuat);
    }

}
