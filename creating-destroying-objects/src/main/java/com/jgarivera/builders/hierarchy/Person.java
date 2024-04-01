package com.jgarivera.builders.hierarchy;

import java.time.LocalDate;

class Person extends Contact {

    private final LocalDate birthday;

    static class Builder extends Contact.Builder<Builder> {
        private LocalDate birthday;

        public Builder(String name) {
            super(name);
        }

        public Builder birthday(LocalDate birthday) {
            this.birthday = birthday;
            return this;
        }

        @Override
        public Person build() {
            return new Person(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Person(Builder builder) {
        super(builder);
        birthday = builder.birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }
}
