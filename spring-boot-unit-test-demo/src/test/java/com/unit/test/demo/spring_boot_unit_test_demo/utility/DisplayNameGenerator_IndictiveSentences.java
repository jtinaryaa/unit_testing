package com.unit.test.demo.spring_boot_unit_test_demo.utility;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DisplayNameGeneration(DisplayNameGenerator.IndicativeSentences.class)
class DisplayNameGenerator_IndictiveSentences {

    LifeCycleAnnotations lifeCycleAnnotations;

    @Test
    void test_Subtraction() {
        System.out.println("Running TestCase:testSubtraction\n");
        lifeCycleAnnotations = new LifeCycleAnnotations();
        assertEquals(5, lifeCycleAnnotations.subtraction(10,5), "10-5 must be 5");
        assertNotEquals(6, lifeCycleAnnotations.subtraction(10,5), "10-5 must not be 6");
    }

    @Test
    void test_Multiply() {
        System.out.println("Running TestCase:testMultiply\n");
        lifeCycleAnnotations = new LifeCycleAnnotations();
        assertEquals(50, lifeCycleAnnotations.multiplication(10,5), "10X5 must be 50");
        assertNotEquals(60, lifeCycleAnnotations.subtraction(10,5), "10X5 must not be 60");
    }

}
