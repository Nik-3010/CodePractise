package string;

public class Anagram {
    static boolean isAnagram(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();

        //base condition
        if (l1 != l2) {
            return false;
        }
        int[] charCount = new int[26];

        for (int i = 0; i < l1; i++) {
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String input1 = "anagram";
        String input2 = "nagaram";
        System.out.print("Are the given input string are Anagrams?: " + isAnagram(input1, input2));

    }
}
