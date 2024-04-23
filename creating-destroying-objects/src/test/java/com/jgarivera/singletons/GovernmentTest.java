package com.jgarivera.singletons;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class GovernmentTest {

    @Test
    void it_accesses_singleton_field() {
        var government = Government.INSTANCE;

        assertEquals("Philippines", government.getCountry());
    }

    @Test
    void it_accesses_singleton_static_factory() {
        var government = Government.getInstance();

        assertEquals("Philippines", government.getCountry());
    }

    @Test
    void it_prevents_reflection_attacks() throws Exception {
        Constructor<Government> governmentCons = Government.class.getDeclaredConstructor();
        governmentCons.setAccessible(true);

        Throwable exception = assertThrows(InvocationTargetException.class, governmentCons::newInstance);
        assertEquals(IllegalAccessException.class, exception.getCause().getClass());
    }
}
