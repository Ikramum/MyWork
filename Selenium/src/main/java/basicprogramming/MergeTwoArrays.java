package basicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeTwoArrays {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4,5};
		int arr2[]= {3,4,5,6,7};
		int[]c = new int[arr1.length+arr2.length];
		Set<Integer> unique=new HashSet<Integer>();
	    int count = 0;
	      
	      for(int i = 0; i<arr1.length; i++) { 
	         c[i] = arr1[i];
	         count++;
	      } 
	      for(int j = 0;j<arr2.length;j++) { 
	    		  
	         c[count++] = arr2[j];
	      } 
	      for(int i = 0;i<c.length;i++) 
	      {
	    	  
	      unique.add(c[i]);
	      System.out.println(unique);
	      }
	      
	      System.out.println(unique);
	    	  
	   } 
	}
			
	



