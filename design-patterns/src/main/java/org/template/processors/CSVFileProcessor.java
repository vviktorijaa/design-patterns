package org.template.processors;

import org.template.FileProcessor;

import java.nio.file.Path;

public class CSVFileProcessor extends FileProcessor {

    private static final String fileExtension = ".csv";

    public CSVFileProcessor() {}

    @Override
    public void openFile() {
        try {

        } catch (Exception ex) {
            throw new RuntimeException("Error opening CSV file", ex);
        }
    }

    @Override
    public void readFile(Path path) {
        //don't forget to use the extension
    }

    @Override
    public void closeFile() {
        try {

        } catch (Exception ex) {
            throw new RuntimeException("Error opening CSV file", ex);
        }
    }

    @Override
    public void getFileInformation() {
        super.getFileInformation();
        System.out.println("File Type: " + fileExtension);
    }
}
