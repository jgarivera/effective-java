package com.jgarivera.dependencyinjection;

import java.util.List;
import java.util.Objects;

/**
 * A business card formats a consultant's information to presented lines which can then be printed.
 */
class BusinessCard {

    public static final String SEPARATOR = "-----";

    private final Consultant consultant;

    // Inject dependency (consultant) for improved flexibility and testability
    public BusinessCard(Consultant consultant) {
        this.consultant = Objects.requireNonNull(consultant);
    }

    public List<String> getFormattedLines() {
        var header = String.format("%s (%s)", consultant.name(), consultant.profession());
        var footer = String.format("Contact: %s / %s", consultant.phoneNumber(), consultant.email());

        return List.of(header, SEPARATOR, footer);
    }
}
