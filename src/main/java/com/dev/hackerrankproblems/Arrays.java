package com.dev.hackerrankproblems;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class Arrays {


    static class Result {

        /*
         * Complete the 'hourglassSum' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY arr as parameter.
         */

        public static int hourglassSum(List<List<Integer>> arr) {
            // Write your code here
            int maxSum = Integer.MIN_VALUE; // Initialize to minimum possible value

            // Loop over the top-left corners of each hourglass
            for (int i = 0; i <= 3; i++) {
                for (int j = 0; j <= 3; j++) {
                    // Calculate the sum of the current hourglass
                    int currentSum = arr.get(i).get(j) + arr.get(i).get(j + 1) + arr.get(i).get(j + 2)
                            // Top row
                            + arr.get(i + 1).get(j + 1)                                      // Middle element
                            + arr.get(i + 2).get(j) + arr.get(i + 2).get(j + 1) + arr.get(i + 2).get(j + 2); // Bottom row

                    // Update maxSum if currentSum is greater
                    maxSum = Math.max(maxSum, currentSum);
                }
            }

            return maxSum;
        }

    }

    static public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            List<List<Integer>> arr = new ArrayList<>();

            IntStream.range(0, 6).forEach(i -> {
                try {
                    arr.add(
                            Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                    .map(Integer::parseInt)
                                    .collect(toList())
                    );
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });

            int result = Result.hourglassSum(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
