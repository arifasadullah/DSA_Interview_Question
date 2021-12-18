package Arrays;

//int [] arr={0, 1, 1, 0, 1,1, 2, 1, 2, 0, 0, 0, 1};
// 1->2->3->4->5

//Sort an array of 0's 1's & 2's without using sorting algo
// Segregate 0s and 1s in an array
//Dutch National Flag Algorithm
public class Sort_0_1_2_Dutch_National_Flag {
    public static void main(String[] args) {
        System.out.println("Sort an array of 0's 1's & 2's without using sorting algo");
        int [] arr={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort(arr, arr.length);
        System.out.println("Sort an array of 0's 1's & 2's without using sorting algo");
        printArr(arr);
    }
    public static void sort(int[] arr,int n){
        int low=0;
        int mid=0;
        int high=n-1;
        int temp;

        while(mid<=high){
            switch (arr[mid]){
                case 0:{
                    temp=arr[low];
                    arr[low]=arr[mid];
                    arr[mid]=temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:{
                    mid++;
                    break;
                }
                case 2:{
                    temp=arr[mid];
                    arr[mid]=arr[high];
                    arr[high]=temp;
                   high--;
                   break;
                }
            }
        }
    }
    static void printArr(int[] arr){
        for(int el:arr){
            System.out.print(el+" ");
        }
    }
}
