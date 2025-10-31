package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }

    public void addCity(City city) {
        cities.add(city);
    }

    

    // Will be implemented later using TDD (leave blank for now)
    // public boolean hasCity(City city) { ... }
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    // implementing deleteCity for Participation Exercise
    /**
     * this method deletes the city from the list
     * @param city
     *      a city string to be referenced for deletion
     *  note: this code was borrowed from my own Lab 6 exercise
     */
    public void delete(City city) {
        if (cities.contains(city)) {
            cities.remove(city);
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * This method checks the total count of cities in the list
     * @return
     *      Returns how many cities are in the list
     */
    public int countCities() {
        return cities.size();
    }

}
