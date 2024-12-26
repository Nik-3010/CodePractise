package string;


// input is str ='aaabbaccggh"
// output is "a3b2a1c2g2h1"

public class PrintFrequencyString {

    public static String countChars(String str){
        int count = 1;
        StringBuilder result = new StringBuilder();

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == str.charAt(i - 1))
                count++;
            else{
                result.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // append the last remaining character with the count
        result.append(str.charAt(str.length() - 1)).append(count);

        return result.toString();
    }


    public static void main(String[] args){
        String input = "aaabbaccggh";
        System.out.println(countChars(input));
    }
}
