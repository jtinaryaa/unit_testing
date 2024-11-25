package com.unit.test.demo.spring_boot_unit_test_demo.utility;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LifeCycleAnnotationsAllTest {

    static LifeCycleAnnotations lifeCycleAnnotations;

    @BeforeAll
    static void setUpBeforeAll() {
        System.out.println("Running @BeforeAll\n");
        lifeCycleAnnotations = new LifeCycleAnnotations();
    }

    @Test
    void testSubtractionEqualsAndNotEquals() {
        System.out.println("Running TestCase :: testSubtractionEqualsAndNotEquals()\n");
        assertEquals(5, lifeCycleAnnotations.subtraction(10,5), "10-5 must be 5");
        assertNotEquals(6, lifeCycleAnnotations.subtraction(10,5), "10-5 must not be 6");
    }

    @Test
    void testMultiplyEqualsAndNotEquals() {
        System.out.println("Running TestCase :: testMultiplyEqualsAndNotEquals()\n");
        assertEquals(50, lifeCycleAnnotations.multiplication(10,5), "10X5 must be 50");
        assertNotEquals(60, lifeCycleAnnotations.subtraction(10,5), "10X5 must not be 60");
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("Running @AfterAll\n");
    }
}
