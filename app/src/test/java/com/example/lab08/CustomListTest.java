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
}
