package Binary_Search;

public class FindElementInRotatedAndSortedArray {
    public static void main(String[] args) {
     int[] arr={20,30,40,50,60,1,2};
     int ans=findElementInRotatedAndSortedArray(arr,20);
        System.out.println(ans);

    }
    static int findElementInRotatedAndSortedArray(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while (start<=end){
          int mid=start+(end-start)/2;
          if(arr[mid]==target){
              return mid;
          }
          //check the which part of array is sorted
            // 1.start to mid-1
            // 2.mid+1 to end
          //In rotated and sorted array , it must sure that one of them is sorted
          //first we  find our target in sorted array,if exist discard another array
          //if not,again we divide the next unsorted  array into sorted and unsorted via new mid of unsorted array
            if(arr[start]<arr[mid]){
                if(arr[start]<= target && target<arr[mid]){
                          end=mid-1;
                }else{
                    start=mid+1;
                }
            }else{
                if(target>arr[mid] && target<=arr[end]){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }
}
