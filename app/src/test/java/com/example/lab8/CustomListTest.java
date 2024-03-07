package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import androidx.test.filters.LargeTest;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.jupiter.api.BeforeAll;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        int listSize = list.getCount();
        list.deleteCity(city);
        assertEquals(list.getCount(),listSize - 1);
    }
//
//    @Test
//    public void hasCityTest(){
//        list = MockCityList();
//        City city = new City("Edmonton", "AB");
//        list.addCity(city);
//        int listSize = list.getCount();
//        assertTrue(list.hasCity(city));
//    }
//
//    @Test
//    public void countCityTest(){
//        list = MockCityList();
//        list.addCity(new City("Edmonton", "AB"));
//        list.addCity(new City("Vancouver", "BC"));
//        list.addCity(new City("Toronto", "ON"));
//        list.addCity(new City("New York", "NY"));
//        assertEquals(list.countCities(), 4);
//    }

}
