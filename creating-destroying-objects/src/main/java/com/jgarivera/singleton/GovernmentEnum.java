package com.jgarivera.singleton;

enum GovernmentEnum {
    INSTANCE;

    GovernmentEnum() {
        // Guarantees out-of-the-box protection from:
        // - multiple instantiation
        // - serialization and reflection attacks
    }

    public String getCountry() {
        return "Philippines";
    }
}
