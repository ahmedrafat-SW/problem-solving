package com.dev.hackerrankproblems;

public class MessageDecrypter {
    public static void main(String[] args) {
        String encryptedMessage = "world hel2o";

        String str = "hel2o";
        String convertedStr = str.replaceAll("([a-zA-Z])\\d", "$1$1");
        System.out.println(convertedStr); // Output: helllo

//        String decryptedMessage = decryptMessage(encryptedMessage);
//        System.out.println(decryptedMessage); // Output: hello world

    }

    public static String decryptMessage(String encryptedMessage) {
        // Split the encrypted message into individual words
        String[] words = encryptedMessage.split(" ");

        // Reverse each word in the sentence
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseWord(words[i]);
        }

        // Join the decrypted words back into a single message
        return String.join(" ", words);
    }

    public static String reverseWord(String word) {
        String res = "";
        int val = 0;
        int [] rep = new int [word.length()];
        for (int i = 0; i < word.length(); i++) {
            if(Character.isDigit(word.charAt(i))){
                val = Character.getNumericValue(word.charAt(i));
                for (int j = 0; j < val; j++) {

                }
            }
        }

        return new StringBuilder(word).reverse().toString();
    }
}
