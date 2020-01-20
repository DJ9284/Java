package ab;

import java.util.Arrays;

public class Bubble_recursive 
{
	 static void bubbleSort(int array[],int n) 
	    {
	        if (n == 1) 
	            return; 
	        for (int i=0; i<n-1; i++) 
	            if (array[i] > array[i+1]) 
	            { 
	                int temp = array[i]; 
	                array[i] = array[i+1]; 
	                array[i+1] = temp; 
	            } 
	       
	        bubbleSort(array,n-1); 
	    }
	 public static void main(String args[])
	 {
		 int array[]= {5,4,3,2,1};
		 Bubble_recursive.bubbleSort(array,array.length);
		 System.out.println(Arrays.toString(array));
	 }

}
