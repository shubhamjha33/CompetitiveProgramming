package com.shubhamjha33.input;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Shubham on 01/21/2018.
 */
public class InputReaderFactory {

    public static LongInputReader newLongInputReader() {
        return new LongInputReader();
    }

    public static IntegerInputReader newIntegerInputReader() {
        return new IntegerInputReader();
    }

    public static abstract class InputReader<T> {

        protected final BufferedReader br;

        public InputReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public List<List<T>> readInput(String delimiter) throws Exception {
            int t = Integer.parseInt(br.readLine());
            List<List<T>> dataset = new ArrayList<>();
            while (t-- > 0) {
                dataset.add(Arrays.stream(br.readLine().split(delimiter))
                        .map(this::convert)
                        .collect(Collectors.toList()));
            }
            return dataset;
        }

        protected abstract T convert(String input);
    }

    public static class LongInputReader extends InputReader<Long> {

        @Override
        protected Long convert(String input) {
            return Long.parseLong(input);
        }
    }

    public static class IntegerInputReader extends InputReader<Integer> {

        @Override
        protected Integer convert(String input) {
            return Integer.parseInt(input);
        }
    }

}
