package com.flaiker.logistics;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LogisticsTest {
    private int[][] ladungsListe;

    @Before
    public void setUp() throws Exception {
        ladungsListe = new int[][]{
                {800, 0, 276201},
                {500, 0, 276196},
                {4900, 0, 276198},
                {700, 0, 276172},
                {700, 0, 276179},
                {1100, 0, 276179},
                {700, 0, 276179},
                {100, 0, 276112},
                {400, 0, 276123},
                {700, 0, 276179},
                {300, 0, 276171},
        };
    }

    @After
    public void tearDown() throws Exception {
        ladungsListe = null;
    }

    @Test
    public void erstelleLadungsListe() throws Exception {
        Logistics.erstelleLadungsListe(ladungsListe, 7500, 17);
    }
}
