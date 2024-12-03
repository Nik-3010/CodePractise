package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListCreation {

   static class Student{
        int id;
    }
    public static void main(String[] args){

//        int[] arr = new int[]{1,2,3,4,5,6};
//
//        List<Integer> numList = Arrays.asList(arr);
//        Problem: Arrays.asList(arr) is being used with a primitive
//        int[] array. This creates a single element List<int[]>, where the list contains the entire int[] as a single element,
//                rather than converting the array elements into a list of Integer.

        Integer[] arr = {1,2,3,4,5,6};
        Integer[] arr2 = {4,5,6};

        Student x=new Student();
        x.id=1;


        Student a = new Student();
        a.id = 2;
        x = a;
        arr=arr2;
        System.out.println(arr);
        System.out.println(x.id);
        System.out.println(a.id);





    }
}
