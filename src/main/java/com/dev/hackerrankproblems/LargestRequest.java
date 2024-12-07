package com.dev.hackerrankproblems;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LargestRequest {


    public static void getLargeRequest(List<String> responses, String filename) {
        int numLargeRequest = 0;
        int totalLargeRequest = 0;

        for (String line : responses) {
            String[] data = line.split("\\s+");
            if (Integer.parseInt(data[4]) > 5000) {
                numLargeRequest++;
                totalLargeRequest += Integer.parseInt(data[4]);
            }
        }

        System.out.println(numLargeRequest);
        System.out.println(totalLargeRequest);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("bytes_" + filename))) {
            writer.write(numLargeRequest + "\n");
            writer.write(totalLargeRequest + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        List<String> responses = List.of(
                "host1 timestamp GET 200 2646",
                "host2 timestamp GET 200 5667",
                "host3 timestamp GET 404 7646",
                "host4 timestamp GET 202 2344",
                "host5 timestamp GET 250 9344"
        );

        getLargeRequest(responses, "file.txt");
    }
}
