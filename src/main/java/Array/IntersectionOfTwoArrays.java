package Array;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static void intersectionOfTwoArrays(Integer arr1[], Integer[] arr2){
        Set<Integer> arr1Set = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        Collections.addAll(arr1Set, arr1);

        for(int i : arr2){
            if(arr1Set.contains(i)){
                ans.add(i);
            }
        }

        System.out.print("Intersection is " + ans);

    }
    public static void main(String[] args){
        Integer[] arr1 = new Integer[] {12, 3, 5, 7, 4, 19, 26, 3};
        Integer[] arr2 = new Integer[] {10, 3, 5, 7, 4, 15, 20, 3};

        intersectionOfTwoArrays(arr1, arr2);
    }
}
