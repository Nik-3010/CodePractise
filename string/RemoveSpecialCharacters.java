package string;

public class RemoveSpecialCharacters {

    public static String removeSpecialCharacters(String input) {
        // return input.replaceAll("[^a-zA-Z0-9]", "");

        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetterOrDigit(c) || Character.isWhitespace(c)) sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "Hello@  World!";
        System.out.println(removeSpecialCharacters(input));
    }
}
