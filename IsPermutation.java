//Check if one string is a permutation of another
import java.util.*;


public class IsPermutation {
	
	public static String sort (String s){
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String (c);
	}
	
	
	
	public static boolean isPermutation(String s1, String s2){
		
		if (s1.length() != s2.length()) return false; 
		
		return sort(s1).equals(sort(s2));		
		
	}
	

