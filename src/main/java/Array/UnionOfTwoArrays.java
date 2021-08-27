package Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoArrays {

    public static void unionOfArrays(Integer[] arr1, Integer[] arr2){
        Set<Integer> unionSet = new HashSet<Integer>();
        Collections.addAll(unionSet, arr1);
        Collections.addAll(unionSet, arr2);

        System.out.println("union is" + unionSet);



    }
    public static void main(String[] args){
        Integer[] arr1 = new Integer[] {12, 3, 5, 7, 4, 19, 26};
        Integer[] arr2 = new Integer[] {10, 3, 5, 7, 4, 15, 20};

        unionOfArrays(arr1, arr2);
    }
}
