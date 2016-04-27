package com.flaiker.checksum;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ChecksumCheckerTest {
    @Test
    public void checkIdTrue() throws Exception {
        final String numbersCorrect = "6258431979";
        assertTrue(ChecksumChecker.checkId(numbersCorrect));
    }

    @Test
    public void checkIdFalse() throws Exception {
        final String numbersFalse = "6258431978";
        assertFalse(ChecksumChecker.checkId(numbersFalse));
    }
}
