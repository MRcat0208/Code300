package com.training.week4;

import com.opencsv.exceptions.CsvException;

import java.io.IOException;


public class SaoKeMain {
    public static void main(String[] args) throws IOException, CsvException {
    Data csvFile = new CSVData();
    csvFile.readFile("D:/Project Files/Code300/src/main/java/com.training.week3/SAOKE_T7.csv");
    Settlement settlementProcess = new Settlement(csvFile);
    settlementProcess.calculateCR();
    csvFile.writeFile("output.csv", settlementProcess.getOutputData());
}
}
