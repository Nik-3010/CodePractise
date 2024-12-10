package sorting;

public class MergeSort {

    public static void merge(int[] arr, int[] left, int[] right){
        int n1 = left.length;
        int n2 = right.length;
        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }

        // copy remaining elements from left array if any
        while(i < n1){
            arr[k++] = left[i++];
        }

        // copy remaining elements from right array if any
        while(j < n2){
            arr[k++] = right[j++];
        }
    }


    public static void mergeSort(int[] arr){
        int n = arr.length;
        int mid, left = 0, right = n - 1;

        // base case
        if(n < 2){
            return;
        }

        // calculate mid
        //mid = (left + right)/2;
        mid = n/2;

        // initialize two temporary array left and right
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n - mid];

        // copy the elements from original array to leftArr and rightArr
        for(int i = 0 ; i < mid; i++){
            leftArr[i] = arr[i];
        }
        for(int i = mid; i < n; i++){
            rightArr[i - mid] = arr[i];
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(arr, leftArr,rightArr);
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] arr = {90,-9,3,5,1,0};
        System.out.println("Original array");
        printArray(arr);

        mergeSort(arr);
        System.out.println("Sorted array by Merge sort");
        printArray(arr);

    }
}
