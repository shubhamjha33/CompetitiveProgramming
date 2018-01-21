package com.shubhamjha33.utils;

public class IntegerArrayUtils {

    public static int[] reset(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=0;
        }
        return arr;
    }
}
