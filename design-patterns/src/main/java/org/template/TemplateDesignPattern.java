package org.template;

import java.io.File;

public class TemplateDesignPattern {
    public static void main(String[] args) {
        FileProcessor jsonFileProcessor = FileProcessor.createFileProcessor(FileExtension.JSON);
        jsonFileProcessor.processFile(new File("src/main/resources/jsonFile.json").toPath());
        System.out.println("JSON File Name: " + jsonFileProcessor.getFileName());
        System.out.println("JSON File Size: " + jsonFileProcessor.getFileSize());
        System.out.println("JSON File Content: " + jsonFileProcessor.getFileContent() + "\n");

        FileProcessor csvFileProcessor = FileProcessor.createFileProcessor(FileExtension.CSV);
        csvFileProcessor.processFile(new File("src/main/resources/csvFile.csv").toPath());
        System.out.println("CSV File Name: " + csvFileProcessor.getFileName());
        System.out.println("CSV File Size: " + csvFileProcessor.getFileSize());
        System.out.println("CSV File Content: " + csvFileProcessor.getFileContent());
    }
}