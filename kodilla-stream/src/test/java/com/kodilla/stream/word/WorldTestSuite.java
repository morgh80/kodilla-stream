package com.kodilla.stream.word;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        // Given
        Country poland = new Country(new BigDecimal("4000000"));
        Country holand = new Country(new BigDecimal("400000"));
        Country germany = new Country(new BigDecimal("80000000"));
        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(poland);
        europeCountries.add(holand);
        europeCountries.add(germany);
        Continent europe = new Continent(europeCountries);

        Country usa = new Country(new BigDecimal("300000000"));
        Country canada = new Country(new BigDecimal("4000000"));
        List<Country> northAmericaCountries = new ArrayList<>();
        northAmericaCountries.add(usa);
        northAmericaCountries.add(canada);
        Continent northAmerica = new Continent(northAmericaCountries);

        Country china = new Country(new BigDecimal("1400000000"));
        Country india = new Country(new BigDecimal("1300000000"));
        List<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(china);
        asiaCountries.add(india);
        Continent asia = new Continent(asiaCountries);

        List<Continent> continents = new ArrayList<>();
        continents.add(europe);
        continents.add(northAmerica);
        continents.add(asia);
        World world = new World(continents);

        // When
        BigDecimal wordPopulation = world.getPeopleQuantity();

        // Then
        Assert.assertEquals(new BigDecimal("3088400000"), wordPopulation);

    }
}
