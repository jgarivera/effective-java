package com.jgarivera.staticfactorymethods;

class Contact {

    public static final Contact EMPTY = new Contact("No Name");
    private final String name;

    private Contact(String name) {
        this.name = name;
    }

    public static Contact from(String name) {
        // Just return the same Dummy contact if there is no name provided
        // Prevents creating multiple empty contacts in the heap
        if (name == null) {
            return EMPTY;
        } else {
            return new Contact(name);
        }
    }

    public String getName() {
        return name;
    }
}
