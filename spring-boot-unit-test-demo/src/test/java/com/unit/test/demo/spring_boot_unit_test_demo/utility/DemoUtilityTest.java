package com.unit.test.demo.spring_boot_unit_test_demo.utility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoUtilityTest {


    /*
     * This test case checks if the add method of the DemoUtility class
     * are working correctly by asserting the expected results with the actual results.
     * It also demonstrates the use of the assertEquals and assertNotEquals methods
     * to assert equality and inequality of the actual and expected results respectively.
     * The assertEquals method takes a third argument as a lambda expression to provide a custom error message
     * in case of assertion failure.
     */
    @Test
    void testEqualsAndNotEquals() {
        DemoUtility demoUtility = new DemoUtility();
        assertEquals(5, demoUtility.add(2,3), "2+3 must be 5");
        assertNotEquals(10, demoUtility.add(5,4), () -> "5+4 must not be 10");
    }

    /*
     * This test case checks if the checkNull method of the DemoUtility class
     * are working correctly by asserting the expected results with the actual results.
     * It also demonstrates the use of the assertNull and assertNotNull methods
     * to assert null and non-null values respectively.
     * The assertNull method takes a third argument as a lambda expression to provide a custom error message
     * in case of assertion failure.
     */
    @Test
    void testNullAndNotNull() {
        DemoUtility demoUtility = new DemoUtility();
        assertNull(demoUtility.checkNull(null), () -> "Object must be null.");
        assertNotNull(demoUtility.checkNull("Jatin"),() -> "Object can not be null.");
    }
}
