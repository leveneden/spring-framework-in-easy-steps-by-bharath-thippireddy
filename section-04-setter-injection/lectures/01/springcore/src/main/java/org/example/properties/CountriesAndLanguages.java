package org.example.properties;

import java.util.Properties;

public class CountriesAndLanguages {

    private Properties countriesAndLanguages;

    public Properties getCountriesAndLanguages() {
        return countriesAndLanguages;
    }

    public CountriesAndLanguages setCountriesAndLanguages(Properties countriesAndLanguages) {
        this.countriesAndLanguages = countriesAndLanguages;
        return this;
    }

    @Override
    public String toString() {
        return "ContriesAndLanguages{" +
                "countriesAndLanguages=" + countriesAndLanguages +
                '}';
    }
}
