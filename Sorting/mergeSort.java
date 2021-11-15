public class mergeSort{
    public static void main(String[] args){
       int[] arr={0,8,4,6,1,9,7,3,5};
        mergeSort(arr,0, arr.length-1);
        printArray(arr);
    }
	
	//mergeSort main function
    public static void mergeSort(int[] arr,int start,int end){
        if(start<end){
            int mid=start+(end-start)/2;
            mergeSort(arr,start,mid);
            mergeSort(arr,mid+1,end);
            merge(arr,start,mid,end);

        }
        
    }
	
	//function for merging the two sorted array
    public static void merge(int [] arr,int start,int mid,int end){
              int n1=mid-start+1;
              int n2=end-mid;
              int[]L=new int[n1];
              int[]R =new int[n2];
            for(int i=0;i<n1;i++){
                L[i]=arr[i+start];
            }  
            for(int i=0;i<n2;i++){
                R[i]=arr[i+mid+1];
            } 
            int i=0,j=0;
            int k=start;

            while(i<n1 && j<n2){
                if(L[i]<=R[j]){
                    arr[k]=L[i];
                    i++;
                }else{
                    arr[k]=R[j];
                    j++;
                }
                k++;
            }
            while(i<n1){
                 arr[k]=L[i];
                    i++;
                    k++;

            }
             while(j<n2){
                 arr[k]=R[j];
                    j++;
                    k++;

            }
        }
		
		//printing the array
        public static void printArray(int [] arr){
            for(int el:arr){
                System.out.print(el+" ");
            }
        }
}