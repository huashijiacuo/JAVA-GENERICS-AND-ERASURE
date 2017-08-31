package com.generics;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shun on 2017/8/31.
 */
public class MultiGenericContainerTest {
    @Test
    public void multiGenericContainerTest() {
        MultiGenericContainer<String, String> mondayWeather =new MultiGenericContainer<String, String>("Monday", "Sunny");
        MultiGenericContainer<Integer, Double> dayOfWeekDegrees = new MultiGenericContainer<Integer, Double>(1, 78.0);

        String mondayForecast = mondayWeather.getFirstPosition();
        System.out.println("mondayForecast: " + mondayForecast);
        // The Double type is unboxed--to double, in this case. More on this in next section!
        double sundayDegrees = dayOfWeekDegrees.getSecondPosition();
        System.out.println("sundayDegrees: " + sundayDegrees);

    }


}