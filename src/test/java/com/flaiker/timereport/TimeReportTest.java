package com.flaiker.timereport;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeReportTest {
    private int[][] times;

    @Before
    public void setUp() throws Exception {
        times = new int[30][2];
        times[1][0] = 480;
        times[1][1] = 1040;
        times[2][0] = 470;
        times[5][0] = 480;
        times[5][1] = 960;
        times[6][0] = 990;
        times[7][0] = 480;
        times[7][1] = 960;
        times[29][0] = 990;
    }

    @After
    public void tearDown() throws Exception {
        times = null;
    }

    @Test
    public void erzeugeListe() throws Exception {
        TimeReport.erzeugeListe(12345, times, 2013, 5);
    }

    @Test
    public void getTimeFormatted() throws Exception {
        assertEquals("01:01", TimeReport.getTimeFormatted(61));
    }

}