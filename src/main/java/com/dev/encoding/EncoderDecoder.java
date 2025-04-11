package com.dev.encoding;

import java.util.Base64;

public class EncoderDecoder {

    public static void main(String[] args) {
        // Convert a string to Base64
        String str = "Hello, World!";
        String base64Encoded = Base64.getEncoder().encodeToString(str.getBytes());
//        String base30Encoded = Base30.getEncoder().encodeToString(str.getBytes());
        System.out.println(base64Encoded);// Output: "SGVsbG8sIFdvcmxkIQ=="
        System.out.println("base64Encoded.length() = " + base64Encoded.length());

// Decode the Base64 back to the original string
        byte[] decodedBytes = Base64.getDecoder().decode(base64Encoded);
        String decodedStr = new String(decodedBytes);
        System.out.println(decodedStr);  // Output: "Hello, World!"
    }
}
