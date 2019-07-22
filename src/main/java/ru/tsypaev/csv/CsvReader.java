package ru.tsypaev.csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {

    private static String line = "";

    private String csvFilePath;
    private String csvSeparator;

    public CsvReader(String csvFile, String csvSeparator) {
        this.csvFilePath = csvFile;
        this.csvSeparator = csvSeparator;
    }

    public List<CsvEntity> readCsv(){

        List<CsvEntity> products = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {

            while ((line = br.readLine()) != null) {
                String[] productColumns = line.split(csvSeparator);
                products.add(new CsvEntity(Integer.parseInt(productColumns[0]),
                        productColumns[1],
                        productColumns[2],
                        productColumns[3],
                        Float.parseFloat(productColumns[4])));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return products;
    }

}
