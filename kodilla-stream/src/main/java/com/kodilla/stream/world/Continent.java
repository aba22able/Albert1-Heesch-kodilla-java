package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Continent
{
    List<Country> countryList = new ArrayList<>();
    String continentName;

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountryList() {
        return countryList;
    }

    public void addCountry(Country country) {
        countryList.add(country);
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName=" + continentName +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent = (Continent) o;
        return continentName.equals(continent.continentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(continentName);
    }
}
