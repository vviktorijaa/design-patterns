package org.template.processors;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.template.FileExtension;
import org.template.FileProcessor;
import org.template.JsonObjectMapperConfigurator;
import org.template.model.FileContent;

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
