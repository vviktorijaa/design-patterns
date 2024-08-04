package org.template.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record People(@JsonProperty("people") List<Person> people) {}
