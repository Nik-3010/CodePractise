package string;


// print the vowels with their count in descending order and in case of tie, sort the vowels in alphabetical order
// eg. BENGALURU -> [U-2, A-1, E-1]


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

// -------------solution approach ----------------
// extract the vowels from the input string and store it in TreeMap, so that it gets stored in the sorted order of Key
// find a way to sort the TreeMap in case of tie in alphabetical order
public class VowelCountAndSorting {

//    public static void printVowelsCountsInSortedAndDescendingOrder(String input) {
//
//        String vowels = "AEIOUaeiou";
//        Map<Character, Integer> vowelCountMap = new TreeMap<>();
//
//        for (char c : input.toCharArray()) {
//            if (input.indexOf(c) != -1) {
//                char upperCaseVowel = Character.toUpperCase(c);
//                vowelCountMap.put(upperCaseVowel, vowelCountMap.getOrDefault(upperCaseVowel, 1) + 1);
//            }
//        }
//
//        //convert the map to list and then sort
//        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(vowelCountMap.entrySet());
//        Collections.sort();

    }

