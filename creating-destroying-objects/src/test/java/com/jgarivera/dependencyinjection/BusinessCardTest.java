package com.jgarivera.dependencyinjection;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BusinessCardTest {

    @Test
    void it_creates_business_card() {
        var consultant = new Consultant(
                "John Smith",
                "Accountant",
                "333-3333",
                "jsmith@example.com"
        );

        var card = new BusinessCard(consultant);

        List<String> expectedLines = List.of(
                "John Smith (Accountant)",
                BusinessCard.SEPARATOR,
                "Contact: 333-3333 / jsmith@example.com"
        );

        assertEquals(card.getFormattedLines(), expectedLines);
    }

    @Test
    void it_throws_error_when_no_consultant_is_provided() {
        assertThrows(NullPointerException.class, () -> new BusinessCard(null));
    }
}
