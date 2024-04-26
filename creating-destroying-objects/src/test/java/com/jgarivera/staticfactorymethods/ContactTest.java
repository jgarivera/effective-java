package com.jgarivera.staticfactorymethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContactTest {

    @Test
    void it_creates_empty_contact() {
        var contact = Contact.from(null);

        assertEquals(contact.getName(), "No Name");
    }

    @Test
    void it_creates_empty_contact_once() {
        var contactA = Contact.from(null);
        var contactB = Contact.from(null);

        assertEquals(contactA, contactB);
    }
}
