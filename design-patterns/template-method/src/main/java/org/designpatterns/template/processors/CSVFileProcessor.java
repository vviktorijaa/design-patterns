package org.designpatterns.template.processors;

import com.opencsv.bean.CsvToBeanBuilder;
import org.designpatterns.template.FileProcessor;
import org.designpatterns.template.model.FileContent;
import org.designpatterns.template.model.PersonClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class CSVFileProcessor extends FileProcessor {

    private static final String fileExtension = ".csv";

    public CSVFileProcessor() {}

    @Override
    public void openFile() {}

    @Override
    public void readFile(Path path) {
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            List<PersonClass> beans = new CsvToBeanBuilder<PersonClass>(reader)
                    .withType(PersonClass.class)
                    .build()
                    .parse();

            this.fileContent = new FileContent<>(beans);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void closeFile() {}

    @Override
    public void getFileInformation() {
        super.getFileInformation();
        System.out.println("File Type: " + fileExtension);
    }
}
