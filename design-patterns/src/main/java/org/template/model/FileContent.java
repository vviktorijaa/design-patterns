package org.template.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public record FileContent<T>(@JsonProperty("content") T content) {}
