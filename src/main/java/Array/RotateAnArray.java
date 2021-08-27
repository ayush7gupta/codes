package Array;

import java.util.Collections;

public class RotateAnArray {

    public static Integer[] rotateByN(int n, Integer[] arr){

        arr = reverseArr(arr, 0, n-1);
        arr = reverseArr(arr, n, arr.length-1);
        arr = reverseArr(arr, 0, arr.length-1);

        return arr;
    }

    public static Integer[] reverseArr(Integer[] arr, int i, int j){
        int temp;
        while(i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Rotated array is ");
        for( int k: arr){
            System.out.println(k);
        }
        return arr;
    }
    public static void main(String[] args){
        Integer[] arr1 = new Integer[] {1,2,3,4,5};

        rotateByN(2, arr1);

    }
}
