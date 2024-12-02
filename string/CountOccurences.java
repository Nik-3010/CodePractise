package string;

import java.util.HashMap;
import java.util.Map;

public class CountOccurences {

    public static void charCounts(String input) {

        char[] charArr = input.toCharArray();
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : charArr) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else charCountMap.put(c, 1);
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + ", ");
        }


    }

    public static void main(String[] args) {
        String input = "Nishant Ranjan!@#$%&*(0";
        String filteredInput = input.replaceAll("[^a-zA-Z0-9@]", "");
        charCounts(filteredInput);
    }
}
