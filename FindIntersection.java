package week3.day2;


import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class FindIntersection {
	
	public static void main(String[] args) {
		int [] firstArray1= {3,2,11,4,6,7};
		int [] secondArray2= {1,2,8,4,9,7};
		Set<Integer>set= new LinkedHashSet<Integer>();
		 for (int i = 0; i < firstArray1.length; i++) {
			 for (int j = 0; j < secondArray2.length; j++) {
				if ( firstArray1[i]== secondArray2[j]) {
					System.out.println(firstArray1[i]);
					
				}
			}
			
		}
		
				}
				
			
			
		
		
	
						
			
			
			
		
		
		
		 
		
		
		
	
		

}


