package Binary_Search;

public class MinimumElementInSortedAndRotatedArray {
    public static void main(String[] args) {
        int[] arr1 =  {5, 6, 1, 2, 3, 4};

//        int[] arr3={2, 3, 4, 5, 6, 7, 8, 1};
        int ans=minimumElementInSortedAndRotatedArray(arr1,0,arr1.length-1);
        System.out.println(ans);
    }
    static int minimumElementInSortedAndRotatedArray(int[] arr,int low,int high){
        //check all the cases
        //if one element is present in array
        if(arr[low]==arr[high]) return low;
        //if array is not rotated
//        if(high<low) return arr[0];

        //find mid
        int mid=low+(high-low)/2;

        //check if arr[mid]<arr[mid-1]; i.e, mid itself is a minimum element
        if(mid>low && arr[mid]<arr[mid-1]){
          return arr[mid];
        }

        //check if arr[mid+1]<arr[mid]  eg:{5,6,7,1,3};
        if( mid<high && arr[mid+1]<arr[mid]){
            return arr[mid+1];
        }

        if(arr[high]>arr[mid]){
            return minimumElementInSortedAndRotatedArray(arr,low,mid-1);
        }else{
            return minimumElementInSortedAndRotatedArray(arr,mid+1,high);
        }

    }
}
