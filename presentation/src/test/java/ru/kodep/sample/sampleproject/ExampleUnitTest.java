package ru.kodep.sample.sampleproject;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void addition_isAnother() {
        assertEquals(6, 3 * 2);
    }

    @Test
    public void addition_isLastSampleTest() {
        assertEquals(20, 4 * 5);
    }

    @Test
    public void addition_isLastSampleError() {
        int a = 1;
        assertEquals(20, a * 4 * 5);
    }
}