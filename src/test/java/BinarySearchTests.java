package com.example.array; // Убедитесь, что у вас правильный пакет

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTests {

    @Test
    public void testBinarySearchByte() {
        byte[] array = {1, 2, 3, 4, 5};
        assertEquals(2, Arrays.binarySearch(array, (byte) 3)); // найден
        assertEquals(-6, Arrays.binarySearch(array, (byte) 6)); // не найден
    }

    @Test
    public void testBinarySearchChar() {
        char[] array = {'a', 'b', 'c', 'd', 'e'};
        assertEquals(2, Arrays.binarySearch(array, 'c')); // найден
        assertEquals(-6, Arrays.binarySearch(array, 'f')); // не найден
    }

    @Test
    public void testBinarySearchDouble() {
        double[] array = {1.1, 2.2, 3.3, 4.4, 5.5};
        assertEquals(2, Arrays.binarySearch(array, 3.3)); // найден
        assertEquals(-6, Arrays.binarySearch(array, 6.6)); // не найден
    }

    @Test
    public void testBinarySearchFloat() {
        float[] array = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        assertEquals(2, Arrays.binarySearch(array, 3.3f)); // найден
        assertEquals(-6, Arrays.binarySearch(array, 6.6f)); // не найден
    }

    @Test
    public void testBinarySearchInt() {
        int[] array = {1, 2, 3, 4, 5};
        assertEquals(2, Arrays.binarySearch(array, 3)); // найден
        assertEquals(-6, Arrays.binarySearch(array, 6)); // не найден
    }

    @Test
    public void testBinarySearchLong() {
        long[] array = {1L, 2L, 3L, 4L, 5L};
        assertEquals(2, Arrays.binarySearch(array, 3L)); // найден
        assertEquals(-6, Arrays.binarySearch(array, 6L)); // не найден
    }

    @Test
    public void testBinarySearchShort() {
        short[] array = {1, 2, 3, 4, 5};
        assertEquals(2, Arrays.binarySearch(array, (short) 3)); // найден
        assertEquals(-6, Arrays.binarySearch(array, (short) 6)); // не найден
    }

    @Test
    public void testBinarySearchGeneric() {
        String[] array = {"apple", "banana", "cherry", "date"};
        assertEquals(2, Arrays.binarySearch(array, "cherry", String::compareTo)); // найден
        assertEquals(-5, Arrays.binarySearch(array, "fig", String::compareTo)); // не найден
    }
}