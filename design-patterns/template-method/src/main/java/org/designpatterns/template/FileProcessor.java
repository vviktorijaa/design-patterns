package org.designpatterns.template;

import org.designpatterns.template.model.FileContent;
import org.designpatterns.template.processors.CSVFileProcessor;
import org.designpatterns.template.processors.JSONFileProcessor;

import java.nio.file.Path;

public abstract class FileProcessor {

    protected Path filePath;
    protected FileContent fileContent;

    protected abstract void openFile();
    protected abstract void readFile(Path filePath);
    protected abstract void closeFile();

    public final void processFile(Path filePath) {
        this.filePath = filePath;
        openFile();
        readFile(filePath);
        closeFile();
    }

    public static FileProcessor createFileProcessor(FileExtension fileExtension) {
        return switch (fileExtension) {
            case JSON -> new JSONFileProcessor();
            case CSV -> new CSVFileProcessor();
        };
    }

    protected void getFileInformation() {
        System.out.println("File Name: " + getFileName()
                + "\nFile Size: " + getFileSize() + "B"
                + "\nFile Content: " + getFileContent());
    }

    public String getFileName() {
        return filePath.getFileName().toString();
    }

    public long getFileSize() {
        return fileContent.content().toString().getBytes().length;
    }

    public FileContent getFileContent() {
        return fileContent;
    }
}
