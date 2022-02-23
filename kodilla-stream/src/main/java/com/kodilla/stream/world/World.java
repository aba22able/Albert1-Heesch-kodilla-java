package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class World
{
    private final Set<Continent> continentsSet = new HashSet<>();

    public void addContinent(Continent continent) {
        continentsSet.add(continent);
    }

    public Set<Continent> getContinentsSet() {
        return continentsSet;
    }

    public BigDecimal getPeopleQuantity(Set<Continent> continent)
    {
        return continentsSet.stream()
                .flatMap(conti -> conti.getCountryList().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
