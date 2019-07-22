package ru.tsypaev;

import ru.tsypaev.csv.CsvEntity;
import ru.tsypaev.csv.CsvReader;

import java.util.List;

public class Application {
    public static void main(String[] args) {

        CsvReader reader = new CsvReader("C:\\Users\\user\\Desktop\\javaProjects\\CSV\\src\\main\\resources\\test.csv",";");
        List<CsvEntity> csvEntities = reader.readCsv();
        for(CsvEntity entity : csvEntities) {
            System.out.println(entity);
        }
    }
}
