package com.training.week4;

import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.util.List;

public abstract class Data {

    public abstract void readFile(String fileName);
    public abstract List<List<String>> convertDataToListString();
    public abstract void writeFile(String outputFile, List<List<String>> content) throws IOException, CsvException;
}
