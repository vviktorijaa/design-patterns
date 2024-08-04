package org.template.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public record Person(@JsonProperty("personalId") long personalId,
                     @JsonProperty("name") String name,
                     @JsonProperty("dateOfBirth") @JsonFormat(pattern = "dd-MM-yyyy") LocalDate dateOfBirth,
                     @JsonProperty("seniorityLevel") SeniorityLevel seniorityLevel,
                     @JsonProperty("isEmployed") boolean isEmployed,
                     @JsonProperty("yearsOfExperience") float yearsOfExperience){
}
