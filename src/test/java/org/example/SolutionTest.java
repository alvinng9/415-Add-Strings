package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void addStringsTest() {
        Solution solution = new Solution();
        assertEquals("134", solution.addStrings("11", "123"));
        assertEquals("533", solution.addStrings("456", "77"));
        assertEquals("0", solution.addStrings("0", "0"));
        assertEquals("10", solution.addStrings("4", "6"));
        assertEquals("100000", solution.addStrings("40000", "60000"));
        assertEquals("100000", solution.addStrings("99999", "1"));
    }

}