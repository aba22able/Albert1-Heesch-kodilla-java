package com.kodilla.stream.world;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite
{
    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: ok!");
    }

    @DisplayName(
            "When created SimpleUser with name, " +
                    "then getUsername should return correct name"
    )
    @Test
    public void testGetPeopleQuantity()
    {
        //Given
        Country katoland = new Country(new BigDecimal("2137"));
        Country germany = new Country(new BigDecimal("6000"));
        Country monaco = new Country(new BigDecimal("20"));

        Country japan = new Country(new BigDecimal("8000"));
        Country china = new Country(new BigDecimal("9999"));
        Country kazachstan = new Country(new BigDecimal("300"));

        Country egipt = new Country(new BigDecimal("500"));
        Country somalia = new Country(new BigDecimal("6000"));
        Country zimbabwe = new Country(new BigDecimal("7000"));

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        europe.addCountry(katoland);
        europe.addCountry(germany);
        europe.addCountry(monaco);

        asia.addCountry(japan);
        asia.addCountry(china);
        asia.addCountry(kazachstan);

        africa.addCountry(egipt);
        africa.addCountry(somalia);
        africa.addCountry(zimbabwe);

        World theEarth = new World();

        theEarth.addContinent(europe);
        theEarth.addContinent(asia);
        theEarth.addContinent(africa);



        //When
        Set<Continent> europeList = theEarth.getContinentsSet();
        BigDecimal peopleOnTheEarth = theEarth.getPeopleQuantity(europeList);

        //Then
        BigDecimal expectedSand = new BigDecimal("39956");
        assertEquals(expectedSand, peopleOnTheEarth);
    }

}
