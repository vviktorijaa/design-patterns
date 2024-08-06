package org.designpatterns.template;

import com.opencsv.bean.AbstractBeanField;
import com.opencsv.exceptions.CsvDataTypeMismatchException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateConverter extends AbstractBeanField<LocalDate, String> {
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    @Override
    protected LocalDate convert(String value) throws CsvDataTypeMismatchException {
        try {
            return LocalDate.parse(value, formatter);
        } catch (Exception e) {
            throw new CsvDataTypeMismatchException(value, LocalDate.class, "Failed to parse date: " + value);
        }
    }
}