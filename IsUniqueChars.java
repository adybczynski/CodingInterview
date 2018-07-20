//Determines if a given string contains only unique characters (true) or not (false).


public class IsUniqueChars {
	
	public static boolean IsUnique (String str){
		
		if (str.length()>128) return false; //there are 128 unique ASCII chars
		
		boolean[] count = new boolean[128];
		
		for (int i=0; i<str.length(); i++){
			
			int curr = str.charAt(i);
			
			if (count[curr]){	// already found this one in the string
				return false;
			}
			
			count[curr]=true;
		}
		
		return true;
		
	}


}



