package org.template.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum SeniorityLevel {
    JUNIOR(1), INTERMEDIATE(2), SENIOR(3);


    private final int seniorityLevel;

    SeniorityLevel(int seniorityLevel) {
        this.seniorityLevel = seniorityLevel;
    }

    @JsonValue
    public int getSeniorityLevel() {
        return seniorityLevel;
    }
}
