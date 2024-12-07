package com.dev.hackerrankproblems;

import java.util.*;
import java.util.Arrays;

public class ExclusiveTimeCalculator {
    public static int[] exclusiveTime(int n, List<String> logs) {
        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>(); // To keep track of function IDs
        int prevTime = 0; // To track the previous timestamp

        for (String log : logs) {
            String[] parts = log.split(":");
            int functionId = Integer.parseInt(parts[0]);
            String type = parts[1];
            int timestamp = Integer.parseInt(parts[2]);

            if (type.equals("start")) {
                // Update the current function's time before switching
                if (!stack.isEmpty()) {
                    result[stack.peek()] += timestamp - prevTime;
                }
                stack.push(functionId);
                prevTime = timestamp;
            } else { // type.equals("end")
                // Update the current function's time
                result[stack.pop()] += timestamp - prevTime + 1;
                prevTime = timestamp + 1; // Move to the next second
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 2;
        List<String> logs = List.of(
                "0:start:0",
                "1:start:2",
                "1:end:5",
                "0:end:6"
        );

        int[] result = exclusiveTime(n, logs);
        Arrays.stream(result).forEach(i -> System.out.printf("%s, ", i)); // Output: [3, 4]
    }
}
