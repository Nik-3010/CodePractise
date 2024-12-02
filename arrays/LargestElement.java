package arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[] = {10, 324, 45, 90, 9808, 0, -9, 9999, -234};
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }
        System.out.print(max);
        /*
        * // Java Stream and LargestElement to find the LargestElement element
        int LargestElement = Arrays.stream(arr).LargestElement().getAsInt();

        // Printing the result
        System.out.println("Largest in given array is " + LargestElement);*/
    }

}
