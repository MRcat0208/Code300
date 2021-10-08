package com.training.week4;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVData extends Data {

    List<String[]> dataList = new ArrayList<>();

    public CSVData() {
    }

    @Override
    public void readFile(String fileName) {
        try (CSVReader reader = new CSVReader(new FileReader(fileName));) {
            this.dataList = reader.readAll();
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<List<String>> convertDataToListString() {
        // logic to read csv file
        List<List<String>> convertedData = new ArrayList<>();

        for (String[] eachRow : dataList) {
            List<String> temp = Arrays.asList(eachRow);
            convertedData.add(temp);
        }
        return convertedData;
    }

    @Override
    public void writeFile(String outputFile, List<List<String>> content) throws IOException, CsvException {
        OutputStreamWriter csvWriter = new OutputStreamWriter(new FileOutputStream(outputFile), StandardCharsets.UTF_8);
        for (List<String> strings : content) {
            csvWriter.append(strings.get(0));
            csvWriter.append(",");
            csvWriter.append(strings.get(1));
            csvWriter.append(",");
            csvWriter.append(strings.get(2));
            csvWriter.append("\n");
            System.out.println(strings);
        }
        csvWriter.flush();
        csvWriter.close();

    }
}