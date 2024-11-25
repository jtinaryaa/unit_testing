package com.unit.test.demo.spring_boot_unit_test_demo.utility;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LifeCycleAnnotationsTest {

    LifeCycleAnnotations lifeCycleAnnotations;

    @BeforeEach
    void setUpBeforeEach() {
        System.out.println("Running @BeforeEach\n");
        lifeCycleAnnotations = new LifeCycleAnnotations();
    }

    @Test
    void testSubtraction() {
        System.out.println("Running TestCase:testSubtraction\n");
        assertEquals(5, lifeCycleAnnotations.subtraction(10,5), "10-5 must be 5");
        assertNotEquals(6, lifeCycleAnnotations.subtraction(10,5), "10-5 must not be 6");
    }

    @Test
    void testMultiply() {
        System.out.println("Running TestCase:testMultiply\n");
        assertEquals(50, lifeCycleAnnotations.multiplication(10,5), "10X5 must be 50");
        assertNotEquals(60, lifeCycleAnnotations.subtraction(10,5), "10X5 must not be 60");
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Running @AfterEach\n");
    }
}
