package com.jgarivera.builders.hierarchy;

class Company extends Contact {

    private final String tradeName;
    private final String industry;

    static class Builder extends Contact.Builder<Builder> {
        private String tradeName;
        private String industry;

        public Builder(String name) {
            super(name);
        }

        public Builder tradeName(String tradeName) {
            this.tradeName = tradeName;
            return this;
        }

        public Builder industry(String industry) {
            this.industry = industry;
            return this;
        }

        @Override
        public Company build() {
            return new Company(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    private Company(Builder builder) {
        super(builder);
        tradeName = builder.tradeName;
        industry = builder.industry;
    }

    public String getTradeName() {
        return tradeName;
    }

    public String getIndustry() {
        return industry;
    }
}
