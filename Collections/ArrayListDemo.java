package Collections;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(100);

//        int[] arr = {1,2,3,4,5,5,6};
//        List<Integer> numList = Arrays.asList(arr);

        Integer[] arr = {1,2,3,4,5,5,6};
        List<Integer> numList = Arrays.asList(arr);

        String[] array = {"Apple", "Banana", "Mango"};
        List<String> list2 = Arrays.asList(array);


        System.out.println(list2);
        System.out.println(numList);

        //numList.remove(2);
        numList.remove(Integer.valueOf(1));
        System.out.println(numList);

        List<Integer> newList = new ArrayList<>();
        newList.add(1);
        newList.add(2);
        newList.add(3);
        //newList.remove(2);
        newList.remove(Integer.valueOf(1));
        System.out.println(newList);
    }
}

