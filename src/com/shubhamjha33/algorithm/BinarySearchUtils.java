package com.shubhamjha33.algorithm;

public class BinarySearchUtils {

    public static int binarySearch(Long[] arr, long val) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start < end) {
            mid = (start + end + 1) / 2;
            if (arr[mid] < val) {
                start = mid + 1;
            } else if (arr[mid] > val) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }
        if (start == end) {
            if(arr[start]<=val)
                return start;
            else
                return start-1;
        }
        else
            return Math.min(start, end);
    }
}
