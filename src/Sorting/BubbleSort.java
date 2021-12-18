package Sorting;

public class BubbleSort {
    public static void bubbleSort(int [] arr,int n){
        for(int i=0;i<n-1;i++){
            boolean swapped=false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j+1]<arr[j]){
                    swapped=true;
                    int temp=arr[j+1];
                     arr[j+1]=arr[j];
                     arr[j]=temp;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    static void printArr(int [] arr){
        for(int el:arr){
            System.out.print(el+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Bubble Sort");
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
//        int[] arr={0,8,4,6,1,9,7,3,5};
        bubbleSort(arr, arr.length);
        printArr(arr);
    }
}
