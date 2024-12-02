package arrays;

// two pointers approach to merge two SORTED ARRAY

import java.util.Arrays;

public class MergeSortedArrays {
	public static void main(String[] args)
	{
		int[] a = {-5,-2,0,1,3,90};
		int[] b = {7, 8, 9};
		int n1 = 0, n2 = 0, index = 0;
		int l1 = a.length, l2 = b.length;
		int[] result = new int[l1 + l2];

		while(n1 < l1 && n2 < l2){
			if(a[n1] <= b[n2]){
				result[index++] = a[n1++];
			}
			else{
				result[index++] = b[n2++];
			}
		}
		//store the remaining elements of 1 st array
		while(n1 < l1){
			result[index++] = a[n1++];
		}

		while(n2 < l2){
			result[index++] = b[n2++];
		}
		System.out.println("Sorted merged array:" + Arrays.toString(result));
	}
}
