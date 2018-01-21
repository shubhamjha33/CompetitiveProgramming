package com.shubhamjha33.algorithm;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class BinarySearchUtilTest {

    @Test
    public void testLowerBound() throws Exception {
        List<Long> arrList = Arrays.stream("1 2 2 3 4 7 8 8 9 9 100 200".split(" "))
                .map(Long::parseLong)
                .collect(Collectors.toList());
        Long[] arr = arrList.toArray(new Long[0]);
        assertEquals(0, BinarySearchUtils.binarySearch(arr, 1));
        assertEquals(2, BinarySearchUtils.binarySearch(arr, 2));
        assertEquals(3, BinarySearchUtils.binarySearch(arr, 3));
        assertEquals(4, BinarySearchUtils.binarySearch(arr, 4));
        assertEquals(4, BinarySearchUtils.binarySearch(arr, 5));
        assertEquals(4, BinarySearchUtils.binarySearch(arr, 6));
        assertEquals(5, BinarySearchUtils.binarySearch(arr, 7));
        assertEquals(7, BinarySearchUtils.binarySearch(arr, 8));
        assertEquals(9, BinarySearchUtils.binarySearch(arr, 9));
        assertEquals(9, BinarySearchUtils.binarySearch(arr, 10));
        assertEquals(10, BinarySearchUtils.binarySearch(arr, 101));
    }
}
