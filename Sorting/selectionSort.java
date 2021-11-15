public class selectionSort{
	
	//main function
    public static void main(String [] args){
	int [] arr={2,50,25,14,6,0,6,63};
	selectionSort(arr);
	printArr(arr);
   }
   
   //code for selection Sort
   public static void selectionSort(int[] arr){
	int n=arr.length;
	for(int i=0;i<n;i++){
		int min_element_index=i;
		for(int j=i+1;j<n;j++){
			if(arr[min_element_index]>arr[j]){
				//updating the min_element_index index
				min_element_index=j;
	}
		}
		//swap the element 
	int temp=arr[min_element_index];
	arr[min_element_index]=arr[i];
	arr[i]=temp;
	}
}

//for printing the array
public static void printArr(int [] arr){
	for(int el:arr){
		System.out.print(el+" ");
    }
   }
}