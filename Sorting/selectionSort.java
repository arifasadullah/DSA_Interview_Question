public class SelectionSort{
	 public static void main(String[] args){
        System.out.println("Array before sorting..");
        int[] arr={2,6,1,5,0,5,10};
        printArr(arr);
        System.out.println();
        selectionSort(arr);
        System.out.println("Array after sorting..");
        printArr(arr);

    }
    public static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int min_index=i;
            for(int j=i+1;j<n;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
    public static void printArr(int[] arr){
        for(int el:arr){
            System.out.print(el+" ");
        }
    }
}