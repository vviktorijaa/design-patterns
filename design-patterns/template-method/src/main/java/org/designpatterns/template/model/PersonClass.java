package org.designpatterns.template.model;

import com.opencsv.bean.CsvBindByName;
import com.opencsv.bean.CsvCustomBindByName;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.designpatterns.template.LocalDateConverter;

import java.time.LocalDate;

@NoArgsConstructor
@Getter
public class PersonClass {

    @CsvBindByName(column = "personalId")
    long personalId;

    @CsvBindByName(column = "name")
    String name;

    @CsvCustomBindByName(column = "dateOfBirth", converter = LocalDateConverter.class)
    LocalDate dateOfBirth;

    @CsvBindByName(column = "seniorityLevel")
    int seniorityLevel;

    @CsvBindByName(column = "isEmployed")
    boolean isEmployed;

    @CsvBindByName(column = "yearsOfExperience")
    float yearsOfExperience;

    @Override
    public String toString() {
        return "Person{" +
                "personalId=" + personalId +
                ", name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", seniorityLevel=" + getSeniorityLevel() +
                ", isEmployed=" + isEmployed +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
