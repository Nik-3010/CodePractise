package Searching;

public class BinarySearch {


    public static int binarySearch(int[] arr, int key){
        int n = arr.length;
        int low = 0, high = n - 1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == key){
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }


    public static void main(String[] args){
        int[] arr = {3,5,7,8,12,34,90};
        int key = 2;

        int pos = binarySearch(arr, key);
        if(pos == -1){
            System.out.println("element is not present in the array");
        }else{
            System.out.println("element is found at: " + arr[pos]);
        }

    }
}
