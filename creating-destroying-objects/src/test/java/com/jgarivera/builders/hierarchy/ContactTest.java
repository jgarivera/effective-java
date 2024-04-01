package com.jgarivera.builders.hierarchy;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ContactTest {

    @Test
    void it_creates_company_contact() {
        var company = new Company.Builder("Acme")
                .email("acme@example.com")
                .phoneNumber("111-1111")
                .tradeName("Acme Corporation")
                .industry("Professional Services")
                .build();

        assertEquals(company.getName(), "Acme");
        assertEquals(company.getEmail(), "acme@example.com");
        assertEquals(company.getPhoneNumber(), "111-1111");
        assertEquals(company.getTradeName(), "Acme Corporation");
        assertEquals(company.getIndustry(), "Professional Services");
    }

    @Test
    void it_creates_person_contact() {
        LocalDate today = LocalDate.now();
        Person person = new Person.Builder("John")
                .email("john@example.com")
                .phoneNumber("222-2222")
                .birthday(today)
                .build();

        assertEquals(person.getName(), "John");
        assertEquals(person.getEmail(), "john@example.com");
        assertEquals(person.getPhoneNumber(), "222-2222");
        assertEquals(person.getBirthday(), today);
    }
}
