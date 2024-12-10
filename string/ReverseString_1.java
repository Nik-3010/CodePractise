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
    public static String preserveSpace(String str)
    {
        int n = str.length();

        // Initialize two pointers as two corners
        int start = 0;
        int end = n - 1;

        char[] Str = str.toCharArray();

        // Move both pointers toward each other
        while (start < end)
        {

            // If character at start or end
            // is space, ignore it
            if (Str[start] == ' ')
            {
                start++;
                continue;
            }
            else if (Str[end] == ' ')
            {
                end--;
                continue;
            }

            // If both are not spaces, do swap
            else
            {
                char temp = Str[start];
                Str[start] = Str[end];
                Str[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(Str);
    }



    public static void main(String[] args) {
        String input = "I am a Software Engineer";
        String reversedString = preserveSpace(input);
        System.out.println(reversedString);
    }
}
