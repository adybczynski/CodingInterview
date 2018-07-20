// Method to change spaces to %20 in a string


public class URLify {

	public static void swapSpaces (char[] str, int trueLength){
		
	int spaceCount = 0, i=0, index;
	
	for (i=0; i<trueLength; i++){
		if(str[i] == ' '){
			spaceCount++;
		}
	}
	
	index = trueLength + 2*spaceCount; // two additional places for each space needed
	
	for (i=trueLength-1; i>=0; i--){
		if (str[i]==' '){
			str[index-1] = '0';
			str[index-2] = '2';
			str[index-3] = '%';
			index -= 3;
		}
		else {
			str[index-1]=str[i];
			index --;
		}
	}
	
	
	}
	public static void main(String[] args) {
		
//		String s = new String ("  dsgdsg dfsgsdfg    dfgdgfs     ff     ");
//		char[] c = new char[70];
//		for (int i=0; i<s.length();i++) c[i]=s.toCharArray()[i];
//		
//		swapSpaces(c, c.length);
//		
//		System.out.println(c.length);
//		System.out.println(s.length());
		
		char[] buffer = { 'M','r',' ','J','o','h','n',' ','S','m','i','t','h','*','*','*','*' };
		int inLen = 13;
		swapSpaces(buffer, inLen);
		//System.out.println("outLen: " + outLen);
		//System.out.println("result: '" + new String(buffer, 0, outLen) + "'");
		System.out.println(buffer);

	}

}
