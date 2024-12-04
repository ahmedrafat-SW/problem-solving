package com.dev.hackerrankproblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class IPTracker {

    public static String ipTracker(String ip) {
        String apiUrl = "https://jsonmock.hackerrank.com/api/ip?ip=" + ip; // Correct URL format
        try {
            // Create the URL and open a connection
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            // Read the response
            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            in.close();

            // Parse the JSON response
            String jsonResponse = response.toString();
            System.out.println("jsonResponse = " + jsonResponse);
            // Check if no results are returned
            if (jsonResponse.contains("\"total\":0")) {
                return "No Result Found";
            }

            // Extract the country field if it exists
            int countryStartIndex = jsonResponse.indexOf("\"country\":\"");
            if (countryStartIndex == -1) {
                return "No Result Found";
            }

            countryStartIndex += 11; // Move index to the start of the country code value
            int countryEndIndex = jsonResponse.indexOf("\"", countryStartIndex);

            // Return the extracted country code
            return jsonResponse.substring(countryStartIndex, countryEndIndex);

        } catch (Exception e) {
            e.printStackTrace();
            return "No Result Found";
        }
    }

    public static void main(String[] args) {
        // Test the function with sample input
        String ip = "172.217.20.46"; // Example IP
        System.out.println(ipTracker(ip)); // Expected Output: US
    }
}

