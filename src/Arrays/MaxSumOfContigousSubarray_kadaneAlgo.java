package Arrays;

public class MaxSumOfContigousSubarray_kadaneAlgo {
    public static void main(String[] args) {
        System.out.println("Maximum Sum of Contiguous Sub-Array");
//        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
//        int [] arr={-2,-3,4,-1,-2,1,5,-3};
        int [] arr={-2,-3,-1,-4};
        int ans=maxSumOfContigousSubarray(arr);
        System.out.println(ans);
    }
    public static int maxSumOfContigousSubarray(int[] arr){
        int currentSum=0;
        int maxSum=arr[0];
        for(int i=0;i<arr.length;i++){
            currentSum +=arr[i];
            if(currentSum>maxSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}
