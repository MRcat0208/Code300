package com.training.week3;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SaoKe {
    public static int findIndex(String[] st, String string, int length) {
        if (length < 1)
            return -1;

        for (int i = 0; i < length; i++) {
            if (st[i].equals(string))
                return i;
        }

        return -1;
    }

    public static void main(String[] args) throws IOException, CsvException {
        try {
            OutputStreamWriter csvWriter = new OutputStreamWriter(new FileOutputStream("finalSaoKe.csv"), StandardCharsets.UTF_8);
            csvWriter.append("Note");
            csvWriter.append(",");
            csvWriter.append("CashIn");
            csvWriter.append(",");
            csvWriter.append("CashOut");
            csvWriter.append("\n");
            String fileName1 = "D:/Project Files/Code300/src/main/java/com.training.week3/SAOKE_T7.csv";
            String fileName2 = "D:/Project Files/Code300/src/main/java/com.training.week3/SAOKE_T8.csv";
            String fileName3 = "D:/Project Files/Code300/src/main/java/com.training.week3/SAOKE_T7.csv";

            List<String> fileName = new ArrayList<>();
            fileName.add(fileName1);
            fileName.add(fileName2);
            fileName.add(fileName3);
            int fileCount = 1;
            List<List<String>> allRows = new ArrayList<>();
            for (String file : fileName) {
                try (CSVReader reader = new CSVReader(new FileReader(file));) {
                    List<String[]> r = reader.readAll();

                    String[] cashIn = new String[r.size()];
                    String[] cashOut = new String[r.size()];
                    String[] note = new String[r.size()];
                    //Convert to array
                    for (int i = 1; i < r.size(); i++) {

                        String[] temp = r.get(i);
                        cashIn[i] = temp[0];
                        cashOut[i] = temp[1];
                        note[i] = temp[2].replaceAll(",", "");

                    }

                    long[] sumCashIn = new long[note.length];
                    long[] sumCashOut = new long[note.length];
                    String[] isNoted = new String[note.length];
                    int lastIndex = 0;
                    if (fileCount < 3) {
                        for (int i = 1; i < note.length; i++) {
                            int index = findIndex(isNoted, note[i], lastIndex);
                            if (index >= 0) {
                                sumCashIn[index] = sumCashIn[index] + Long.parseLong(cashIn[i]);
                                sumCashOut[index] = sumCashOut[index] + Long.parseLong(cashOut[i]);
                            } else {

                                isNoted[lastIndex] = note[i];
                                sumCashIn[lastIndex] = Long.parseLong(cashIn[i]);
                                sumCashOut[lastIndex] = Long.parseLong(cashOut[i]);
                                lastIndex++;
                            }
                        }

                    } else {
                        for (int i = 1; i < cashIn.length; i++) {
                            if (cashOut[i].equals("1")) {
                                int index = findIndex(isNoted, "Li Xi", lastIndex);
                                if (index >= 0) {
                                    sumCashIn[index] = sumCashIn[index] + Long.parseLong(cashIn[i]);
                                    sumCashOut[index] = sumCashOut[index] + Long.parseLong(cashOut[i]);
                                } else {

                                    isNoted[lastIndex] = "Li Xi";
                                    sumCashIn[lastIndex] = Long.parseLong(cashIn[i]);
                                    sumCashOut[lastIndex] = Long.parseLong(cashOut[i]);
                                    lastIndex++;
                                }
                            } else {
                                isNoted[lastIndex] = note[i];
                                sumCashIn[lastIndex] = Long.parseLong(cashIn[i]);
                                sumCashOut[lastIndex] = Long.parseLong(cashOut[i]);
                                lastIndex++;
                            }
                        }

                    }
                    for (int i = 0; i < lastIndex; i++) {
                        List<String> tempString = Arrays.asList(isNoted[i], String.valueOf(sumCashIn[i]), String.valueOf(sumCashOut[i]));
                        csvWriter.append(isNoted[i]);
                        csvWriter.append(",");
                        csvWriter.append(String.valueOf(sumCashIn[i]));
                        csvWriter.append(",");
                        csvWriter.append(String.valueOf(sumCashOut[i]));
                        csvWriter.append("\n");
                        System.out.println(tempString);
                    }
                    fileCount++;
                }
            }
            csvWriter.flush();
            csvWriter.close();
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
