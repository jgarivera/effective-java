package com.jgarivera.builders.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class ContactTest {

    @Test
    void it_creates_contact_only_name() {
        var contact = new Contact.Builder("Bob").build();

        assertEquals("Bob", contact.getName());
        assertNull(contact.getEmail());
        assertNull(contact.getPhoneNumber());
    }

    @Test
    void it_creates_contact_name_email() {
        var contact = new Contact.Builder("Bob")
                .email("bob@example.com")
                .build();

        assertEquals("Bob", contact.getName());
        assertEquals("bob@example.com", contact.getEmail());
        assertNull(contact.getPhoneNumber());
    }

    @Test
    void it_creates_contact_name_phone_number() {
        var contact = new Contact.Builder("Bob")
                .phoneNumber("111-1111")
                .build();

        assertEquals("Bob", contact.getName());
        assertNull(contact.getEmail());
        assertEquals("111-1111", contact.getPhoneNumber());
    }

    @Test
    void it_creates_contact_full() {
        var contact = new Contact.Builder("Bob")
                .email("bob@example.com")
                .phoneNumber("111-1111")
                .build();

        assertEquals("Bob", contact.getName());
        assertEquals("bob@example.com", contact.getEmail());
        assertEquals("111-1111", contact.getPhoneNumber());
    }
}
