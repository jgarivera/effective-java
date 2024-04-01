package com.jgarivera.staticfactorymethods;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {

    @Test
    void creates_empty_contact() {
        var contact = Contact.from(null);

        assertEquals(contact.getName(), "No Name");
    }

    @Test
    void creates_empty_contact_once() {
        var contactA = Contact.from(null);
        var contactB = Contact.from(null);

        assertEquals(contactA, contactB);
    }
}
