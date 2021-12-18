package Sorting;

public class InsertionSort {
    public static void insertionSort(int []arr){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp=arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    static void printArr(int [] arr){
        for(int el:arr){
            System.out.print(el+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Insertion Sort ");
//        int[] arr={0,8,4,6,1,9,7,3,5};
        int arr[] = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        insertionSort(arr);
        printArr(arr);
    }
}
