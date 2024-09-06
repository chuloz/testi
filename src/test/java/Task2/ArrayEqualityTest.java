package Task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ArrayEqualityTest {

    @Test
    public void testSingleDimensionalArrayEquality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 5, 7 };
        assertArrayEquals(a1, a2, "Should be equal");
    }

    @Test
    public void testSingleDimensionalArrayInequality() {
        int[] a1 = { 2, 3, 5, 7 };
        int[] a2 = { 2, 3, 6, 7 }; // Intentional mismatch
        assertArrayEquals(a1, a2, "Should NOT be equal");
    }

    @Test
    public void testMultiDimensionalArrayEquality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        assertArrayEquals(a11, a12, "Should be equal");
    }

    @Test
    public void testMultiDimensionalArrayInequality() {
        int[][] a11 = { { 2, 3 }, { 5, 7 }, { 11, 13 } };
        int[][] a12 = { { 2, 3 }, { 5, 8 }, { 11, 13 } }; // Intentional mismatch
        assertArrayEquals(a11, a12, "Should NOT be equal");
    }

    @Test
    public void testStringArrayEquality() {
        String[] s1 = { "apple", "banana", "cherry" };
        String[] s2 = { "apple", "banana", "cherry" };
        assertArrayEquals(s1, s2, "String arrays should be equal");
    }

    @Test
    public void testDoubleArrayEquality() {
        double[] d1 = { 2.5, 3.5, 4.5 };
        double[] d2 = { 2.5, 3.5, 4.5 };
        assertArrayEquals(d1, d2, "Double arrays should be equal");
    }
}