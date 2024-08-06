package org.designpatterns.template.processors;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.designpatterns.template.FileExtension;
import org.designpatterns.template.FileProcessor;
import org.designpatterns.template.JsonObjectMapperConfigurator;
import org.designpatterns.template.model.FileContent;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public class JSONFileProcessor extends FileProcessor {

    private static final FileExtension JSON_FILE_EXTENSION = FileExtension.JSON;
    private final ObjectMapper jsonObjectMapper;

    public JSONFileProcessor() {
        jsonObjectMapper = JsonObjectMapperConfigurator.getJsonObjectMapper();
    }

    @Override
    public void openFile() {}

    @Override
    public void readFile(Path filePath) {
        try {
            this.filePath = filePath;
            fileContent = jsonObjectMapper.readValue(new File(filePath.toString()), FileContent.class);
        } catch (IOException ex) {
            throw new RuntimeException("Error reading JSON file " + ex);
        }
    }

    @Override
    public void closeFile() {}

    @Override
    public void getFileInformation() {
        super.getFileInformation();
        System.out.println("File Type: " + JSON_FILE_EXTENSION);
    }
}
