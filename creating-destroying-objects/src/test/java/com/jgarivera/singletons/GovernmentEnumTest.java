package com.jgarivera.singletons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GovernmentEnumTest {

    @Test
    void it_accesses_singleton_enum() {
        var government = GovernmentEnum.INSTANCE;

        assertEquals("Philippines", government.getCountry());
    }
}
