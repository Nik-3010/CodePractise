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
            else{
                arr[k++] = right[j++];
            }
        }

        // copy remaining elements from left array if any leftover
        while( i < n1){
            arr[k++] = left[i++];
        }

        while(j < n2){
            arr[k++] = right[j++];
        }
    }

    public static void mergeSort(int[] arr){
        int n = arr.length;
        int mid;

        // base condition
        if(n < 2){
            return;
        }

        mid = n / 2;

        // initialize two temp arrays to copy the elements from original array
        int[] leftArr = new int[mid];
        int[] rightArr = new int[n - mid];

        for(int i = 0; i < mid; i++){
            leftArr[i] = arr[i];
        }
        for(int i = mid; i < n; i++){
            rightArr[i - mid] = arr[i];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(arr, leftArr, rightArr);

    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args){
        int[] arr = {4,2,-9,89,0,2};

        System.out.println("Original array------");
        printArray(arr);

        mergeSort(arr);
        System.out.println("Sorted array --------");
        printArray(arr);

    }
}