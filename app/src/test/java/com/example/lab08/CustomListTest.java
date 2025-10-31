package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {


    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
// This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity(){
        CustomList cityList = new CustomList();
        City city = new City("Vancouver","BC");
        cityList.addCity(city);

        // Delete and assert that city is not in the list, then check cityList's size
        cityList.delete(city);
        assertFalse(cityList.hasCity(city));
    }

    @Test
    public void testCountCities(){
        CustomList cityList = new CustomList();
        City calgary = new City("Calgary", "AB");
        cityList.addCity(calgary);
        // add vancouver as second city to test for 2 cities counted in the list
        City vancouver = new City("Vancouver", "BC");
        cityList.addCity(vancouver);
        assertEquals(2, cityList.countCities());
    }
}
