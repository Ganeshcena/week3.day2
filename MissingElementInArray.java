package week3.day2;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

import org.apache.poi.hssf.record.PageBreakRecord.Break;

public class MissingElementInArray {

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,7,6,8};
		Set<Integer>set= new LinkedHashSet<Integer>();
		Arrays.sort(arr);
		for (int i=0 ;i<arr.length;i++)
		{
			if(i!=arr[i-0])
			System.out.println(i);
			break;
		}
		
			
	}	
}		

	


