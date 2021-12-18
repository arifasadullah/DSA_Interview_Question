package Arrays;

public class MoveAllNegativeToLeftAndPositiveToRight {
    public static void main(String[] args) {
        System.out.println("-: Move All Negative To Left And Positive To Right :-");
//        int [] arr={-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int [] arr={ -1, 2, -3, 4, 5, 6, -7, 8, 9 };
//        moveAllNegativeToLeftAndPositiveToRight(arr, arr.length);
        segregateNegativeAndPositive(arr, arr.length);
        printArr(arr);
    }
    public static void moveAllNegativeToLeftAndPositiveToRight(int[] arr,int n){

        //partition sort like quick sort
            int i=-1;
            int pivot=0;
            for(int j=0;j<n;j++){
                if(arr[j]<pivot ){
                       i++;
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                }

            }
    }

    //Another Approach
    public static void segregateNegativeAndPositive(int[] arr,int n){
        int left=0;
        int right=n-1;
        while (left<=right){

            if(arr[left]<0 && arr[right]<0){
                left++;

            }else if(arr[left]>0 && arr[right]>0){

                right--;
            }else if(arr[left]>0 && arr[right]<0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }else{
                right--;
                left++;
            }

        }
    }
    static void printArr(int[] arr){
        for(int el:arr){
            System.out.print(el+" ");
        }
    }
}
