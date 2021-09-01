package Array;

import java.util.Arrays;

public class DifferenceInHeightsWithK {

    public static void main (String[] args)
    {
        Integer [] a = new Integer[]{0,10};
        int k =2;
        System.out.print(minDifference(a, k));

    }

    public static int minDifference(Integer[] arr, int k){
        if(arr.length  == 1){
            return 0;
        }
        Arrays.sort(arr);
        int ans = arr[arr.length -1] - arr[0];

        for (int i = 0; i < arr.length-1; i++){
            int a = arr[i];
            int b = arr[i+1];
            int high = Math.max(arr[arr.length-1] - k, a + k);
            int low = Math.min(arr[0] + k, b - k);
            ans = Math.min(ans, high - low);

        }
        return ans;
    }
}
