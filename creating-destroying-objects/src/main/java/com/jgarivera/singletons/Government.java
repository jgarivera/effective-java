package com.jgarivera.singletons;

/**
 * Demonstrates singleton pattern using two approaches.
 * Only one approach should be used in the real world.
 */
class Government {

    /**
     * (1) Singleton with a public final field
     */
    public static final Government INSTANCE;

    static {
        try {
            INSTANCE = new Government();
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private Government() throws IllegalAccessException {
        // Defend against reflection attacks from trying to invoke this private constructor
        // See GovernmentTest unit test
        if (INSTANCE != null) {
            throw new IllegalAccessException();
        }
    }

    /**
     * (2) Singleton with a static factory. Much more flexible.
     */
    public static Government getInstance() {
        return INSTANCE;
    }

    public String getCountry() {
        return "Philippines";
    }
}
