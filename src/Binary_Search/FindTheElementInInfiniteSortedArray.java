package Binary_Search;

public class FindTheElementInInfiniteSortedArray {
    public static void main(String[] args) {
        //here we are assuming this is infinite array
       int[] arr={2,3,5,6,8,10,12,15,22,24,26,28,30,33,36,38,40};
       int target=12;
       int mainAns=ans(arr,target);
        System.out.println(mainAns);
    }
    private static int ans(int[] arr,int target){
        //first find the range
        //first start with the box size of 2
        int start=0;
        int end=1;

        //Then we increase the size of box exponentially and check whether target element is less than end or not
        while( target >arr[end]){
            int newStart=end+1;  //here we are taking a temp start to save our start value for further use
            //double the box value by below formula
            //end=previous end +size*2;
            end =end+(end-start+1)*2;
            start=newStart;
        }
       return binarySearch(arr,start,end,target);
    }
    //binary search program(O(log(n))
    public  static int binarySearch(int[] arr,int start,int end,int target){
       while(start  <= end){
           int mid=start+(end-start)/2;
           if(arr[mid]==target){
               return mid;
           }else if(arr[mid]>target){
               end=mid-1;
           }else {
               start=mid+1;
           }
       }
       return -1;
    }
}
