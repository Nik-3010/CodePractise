package sorting;

public class BubbleSort {

    //int arr = [9,0,2,3,4,8]
               //0,1,2,3,4,5   // n = 5
    //What is the Boundary Case for Bubble sort?
    //Bubble sort takes minimum time O(n) (Order of n) when elements are already sorted.
    // Hence it is best to check if the array is already sorted or not beforehand, to avoid O(n2) time complexity.

    // --------------------------------------------
    //What is the maximum number of comparisons that can take place when a bubble sort algorithm is implemented?, suppose there are n elements in the array.
    // n*(n - 1)/2
    // pass 1-> n-1, pass 2-> n -2, pass 3 -> n - 3 ..... and so on

    public static void bubbleSort(int[] arr){
        int temp;
        int n = arr.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1;  j++){
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int[] arr = {9,3,5,-9, -1,1,0};
        bubbleSort(arr);
    }
}
