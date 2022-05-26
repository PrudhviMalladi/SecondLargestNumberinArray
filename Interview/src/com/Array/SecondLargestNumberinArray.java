package com.Array;

public class SecondLargestNumberinArray {
	public static int getSecondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
		            for (int j = i + 1; j < total; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       return a[total-2]; 
	}

	public static void main(String[] args) {
		int a[] = {10,50,60,70,80,90};
		int b[] = {44,66,77,88,99,111,555,999};
		System.out.println("Second Largest Number :"+getSecondLargest(a,6));
		System.out.println("Second largest number:"+getSecondLargest(b,7));
		
		
	}

}
