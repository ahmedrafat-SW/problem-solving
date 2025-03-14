package com.dev.amazonsde;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CustomerReviewSearchAutoComplete {
    /***
    example
    repository = [mobile, mouse, moneyPot, monitor, mousePad]
    customerQuery = mouse \n
     brute force solution with O(N * M) Time Complexity
     **/
    public static List<List<String>> findKeywordSuggestions (List<String> repository, String customerQuery) {
        List<List<String>> keywordSuggestionList = new ArrayList<>();

        List<String> sortedRepository = new ArrayList<>(repository);
        sortedRepository.replaceAll(String::toLowerCase);
        Collections.sort(sortedRepository);


        for (int i = 2; i < customerQuery.length(); i++) {
            List<String> singlePassingList = new ArrayList<>();
            String prefix = customerQuery.substring(0, i).toLowerCase();

            for (String keyword : repository) {
                if (keyword.startsWith(prefix) && singlePassingList.size() < 3) {
                    singlePassingList.add(keyword);
                }
            }
            keywordSuggestionList.add(singlePassingList);
        }

        return keywordSuggestionList;
    }

    public static void main(String[] args) {
        List<String> repository = Arrays.asList("mobile", "mouse", "moneypot", "monitor", "mousepad");
        String customerQuery = "mouse";

        List<List<String>> suggestions = findKeywordSuggestions(repository, customerQuery);

        for (List<String> suggestion : suggestions) {
            System.out.println(suggestion);
        }
    }
}
