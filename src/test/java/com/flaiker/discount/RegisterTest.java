package com.flaiker.discount;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class RegisterTest {
    private String[][] artikel;
    private Map<Character, Float> rabatt;

    @Before
    public void setUp() throws Exception {
        artikel = new String[][]{
                {"Dünger", "A", "7.80", "2"},
                {"Garteneinfassung Granit", "B", "94.86", "20"},
                {"Rosen", "C", "56.00", "3"},
                {"Werkzeugset", "D", "87.50", "1"},
                {"Fliesen, Feinsteinzeug", "B", "40.00", "5"}
        };
        rabatt = new HashMap<>();
        rabatt.put('A', 2f);
        rabatt.put('B', 2.5f);
        rabatt.put('C', 7f);
        rabatt.put('D', 6f);
        rabatt.put('E', 5f);
    }

    @After
    public void tearDown() throws Exception {
        artikel = null;
        rabatt = null;
    }

    @Test
    public void rabatt() throws Exception {
        float applied = Register.rabatt(artikel, rabatt);
        System.out.printf("Rabatt gesamt: %.2f€\n", applied);
        assertEquals(applied, 69.75f, 0.09f);
    }
}
