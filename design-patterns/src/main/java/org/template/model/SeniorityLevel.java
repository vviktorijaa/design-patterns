package org.template.model;

import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum SeniorityLevel {
    JUNIOR(1), INTERMEDIATE(2), SENIOR(3);


    private final int seniorityLevel;
    private static final Map<Integer, SeniorityLevel> MAP = new HashMap<>();

    static {
        for (SeniorityLevel level : SeniorityLevel.values()) {
            MAP.put(level.getSeniorityLevel(), level);
        }
    }

    SeniorityLevel(int seniorityLevel) {
        this.seniorityLevel = seniorityLevel;
    }

    @JsonValue
    public int getSeniorityLevel() {
        return seniorityLevel;
    }
}
