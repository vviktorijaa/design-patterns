package org.designpatterns.template.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.opencsv.bean.CsvBindByName;

import java.time.LocalDate;

public record Person(@JsonProperty("personalId") @CsvBindByName(column = "personalId")
                     long personalId,

                     @JsonProperty("name") @CsvBindByName(column = "name")
                     String name,

                     @JsonProperty("dateOfBirth") @JsonFormat(pattern = "dd-MM-yyyy") @CsvBindByName(column = "dateOfBirth")
                     LocalDate dateOfBirth,

                     @JsonProperty("seniorityLevel") @CsvBindByName(column = "seniorityLevel")
                     SeniorityLevel seniorityLevel,

                     @JsonProperty("isEmployed") @CsvBindByName(column = "isEmployed")
                     boolean isEmployed,

                     @JsonProperty("yearsOfExperience") @CsvBindByName(column = "yearsOfExperience")
                     float yearsOfExperience){
}
