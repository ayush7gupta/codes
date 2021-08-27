package Array;

public class KadaneAlgo {
    public static void main (String[] args)
    {
        Integer [] a = new Integer[]{-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum contiguous sum is " +
                maxSubArraySum(a));
    }

    public static int maxSubArraySum(Integer[] arr){
        int ans = arr[0];
        int curr_max = arr[0];
        for (int i : arr){
            if(curr_max + i < 0){
                curr_max = 0;}
            else {
                curr_max = i + curr_max;}
            if(curr_max> ans)
                ans = curr_max;
        }

        return ans;
    }
}
