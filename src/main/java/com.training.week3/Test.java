package com.training.week3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        String saoKe ="D:/Project Files/Code300/src/main/java/com.training.week3/SAOKE_T7.csv";
        File file = new File(saoKe);

        try{
            Scanner inPut = new Scanner(file);
            inPut.nextLine();
            while (inPut.hasNext()){
                String data = inPut.nextLine();
                String[] collum = data.split(",");
                for(String chuThich : collum)
                {
                    for(int i = 0; i < collum[2].length(); i++)
                    {
                        if()
                    }
                }
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
