package string;

public class ReverseString_1 {
    public static String reverseStringPreservingSpaces(String str) {

        char[] inputCharArray = str.toCharArray();
        char[] resultCharArray = new char[str.length()];

        // mark spaces in the resultCharArray
        for (int i = 0; i < inputCharArray.length; i++) {
            if (inputCharArray[i] == ' ') {
                resultCharArray[i] = ' ';
            }
        }

        // loop from the beginning in the inputCharArray and copy char one by one from the last in the resultCharArray
        int j = inputCharArray.length - 1;
        for (int i = 0; i < inputCharArray.length; i++) {
            if (inputCharArray[i] != ' ') {
                if (resultCharArray[j] == ' ') {
                    j--;
                }
                resultCharArray[j] = inputCharArray[i];
                j--;
            }
        }
        return String.valueOf(resultCharArray);
    }


    public static void main(String[] args) {
        String input = "I am a Software Engineer";
        String reversedString = reverseStringPreservingSpaces(input);
        System.out.println(reversedString);
    }
}
