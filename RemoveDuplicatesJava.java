package week3.day2;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesJava {
	public static void main(String[] args) {
	String text = "We learn java basics as part of java sesions in java week1";
	char[] input = text.toCharArray();
	Set<Character> charset = new LinkedHashSet<Character>(); 
	
  for(Character dupcharset : input)
  {
	  if (dupcharset != ' ')
		  charset.add(dupcharset);
  }
  System.out.println(charset);
  }
}

