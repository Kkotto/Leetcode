package com.kkotto.Leetcode75.P151;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kkotto151 {
    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
        System.out.println(reverseWords("a?"));
        System.out.println(reverseWords("???"));
        System.out.println(reverseWords("1234 12345 ? word"));
        System.out.println("");
        System.out.println(" ");
    }

    public static String reverseWords(String s) {
        List<String> filteredList = new ArrayList<>(Arrays.stream(s.split(" "))
                .filter(element -> !element.equals(" ") && !element.isEmpty())
                .toList());
        Collections.reverse(filteredList);
        return String.join(" ", filteredList);
    }
}
