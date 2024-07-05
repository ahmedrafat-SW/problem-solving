package org.example.problemsolving.ibm.interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

    public class RomanNumeralConverter {

        public static String intToRoman(int num) {
            // Define the mappings for Roman numerals
            Map<Integer, String> numeralMap = new HashMap<>();
            numeralMap.put(1, "I");
            numeralMap.put(4, "IV");
            numeralMap.put(5, "V");
            numeralMap.put(9, "IX");
            numeralMap.put(10, "X");
            numeralMap.put(40, "XL");
            numeralMap.put(50, "L");
            numeralMap.put(90, "XC");
            numeralMap.put(100, "C");
            numeralMap.put(400, "CD");
            numeralMap.put(500, "D");
            numeralMap.put(900, "CM");
            numeralMap.put(1000, "M");

            // Generate the Roman numeral representation
            StringBuilder romanNumeral = new StringBuilder();
            for (int key : numeralMap.keySet()) {
                while (num >= key) {
                    if (num == key) {
                        romanNumeral.append(numeralMap.get(key));
                        num -= key;
                    }
                }
            }

            return romanNumeral.toString();
        }

        public static List<String> convertToRomanNumerals(List<Integer> numbers) {
            List<String> romanNumerals = new ArrayList<>();

            for (int num : numbers) {
                String romanNumeral = intToRoman(num);
                romanNumerals.add(romanNumeral);
            }

            return romanNumerals;
        }

        public static void main(String[] args) {
            // Example usage
            List<Integer> numbers = List.of(1, 4, 9, 27, 49, 50, 99, 500, 999, 1000);

            List<String> romanNumerals = convertToRomanNumerals(numbers);

            // Print results
            for (int i = 0; i < numbers.size(); i++) {
                System.out.println(numbers.get(i) + " -> " + romanNumerals.get(i));
            }
        }
}
