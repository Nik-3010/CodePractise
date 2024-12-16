package sorting;

public class QuickSort {

    // Core idea : 1. Select a pivot (generally last element is selected as pivot) any element can be selected.
    //             2. Re-arrange the elements in array so that all the elements smaller than pivot are towards left
    //              loop through the entire array, keeping track of pIndex(initialized set to start i.e 0)
    //              call quickSort function recursivelly on both left and right half.



    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int pIndex = start;

        for(int i = start; i < end; i++){
            if(arr[i] <= pivot){
                swap(arr, i, pIndex);
                pIndex++;
            }
        }
        swap(arr, pIndex, end);
        return pIndex;
    }

    public static void swap(int[] arr, int a , int b){
        int temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void printArray(int[] arr){
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int start, int end){
        if(start < end){
            int pIndex = partition(arr, start, end);
            quickSort(arr, start , pIndex - 1);
            quickSort(arr, pIndex + 1, end);
        }
    }



    public static void main(String[] args){
        int[] arr = {8,3,6,7,2,3,5,6,4};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
