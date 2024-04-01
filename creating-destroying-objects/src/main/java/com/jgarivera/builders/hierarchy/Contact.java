package com.jgarivera.builders.hierarchy;

/**
 * Assume Contact is an abstract type. It must be concrete like a {@link Company} and {@link Person}.
 */
abstract class Contact {

    private final String name;
    private final String email;
    private final String phoneNumber;

    // Contact.Builder is a generic type with a recursive type parameter
    abstract static class Builder<T extends Builder<T>> {
        private final String name;
        private String email;
        private String phoneNumber;

        public Builder(String name) {
            this.name = name;
        }

        public T email(String email) {
            this.email = email;
            return self();
        }
        public T phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return self();
        }

        abstract Contact build();

        // Since Java doesn't have a self type, we use a
        // simulated self-type idiom
        protected abstract T self();
    }

    Contact(Builder<?> builder) {
        name = builder.name;
        email = builder.email;
        phoneNumber = builder.phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
