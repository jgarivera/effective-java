package com.jgarivera.builders.basic;

class Contact {

    private final String name;

    // Forgive my Primitive Obsession
    private final String email;
    private final String phoneNumber;

    static class Builder {
        private final String name;
        private String email;
        private String phoneNumber;

        public Builder(String name) {
            this.name = name;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Contact build() {
            return new Contact(this);
        }
    }

    private Contact(Builder builder) {
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
