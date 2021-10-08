package com.training.week4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Settlement {

    List<List<String>> convertedData = new ArrayList<>();


    List<List<String>> outputData = new ArrayList<>();

    public Settlement(Data data) {
        this.convertedData = data.convertDataToListString();
    }

    public List<List<String>> getConvertedData() {
        return convertedData;
    }

    public List<List<String>> getOutputData() {
        return outputData;
    }

    public void calculateCR() {
        List<String> column1 = new ArrayList<>();
        List<String> column2 = new ArrayList<>();
        List<String> column3 = new ArrayList<>();

        for (List<String> eachRow : convertedData) {
            column1.add(eachRow.get(0));
            column2.add(eachRow.get(1));
            column3.add(eachRow.get(2).replaceAll(",", ""));
        }

        List<Long> cashIn = new ArrayList<>();
        List<Long> cashOut = new ArrayList<>();
        List<String> isNoted = new ArrayList<>();

        for (int i = 1; i < column3.size(); i++) {
            int index = isNoted.indexOf(column3.get(i));
            if (index >= 0) {
                cashIn.set(index, cashIn.get(index) + Long.parseLong(column1.get(i)));
                cashOut.set(index, cashOut.get(index) + Long.parseLong(column2.get(i)));
            } else {
                isNoted.add(column3.get(i));
                cashIn.add(Long.parseLong(column1.get(i)));
                cashOut.add(Long.parseLong(column2.get(i)));
            }
        }

        for (int i = 0; i < isNoted.size(); i++) {
            List<String> tempString = Arrays.asList(isNoted.get(i), String.valueOf(cashIn.get(i)), String.valueOf(cashOut.get(i)));
            this.outputData.add(tempString);
        }
    }

}
