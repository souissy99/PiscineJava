public class App {
    
    public int countCharInString(String s, char cInput){

	char[] strtab = s.toCharArray();
	int count = 0;

	for (int i = 0; i < strtab.length; i++) {
	    if(strtab[i] == cInput)
		count++;
	}

	return count;
	
    }

    public boolean isPalindrom(String word){

	String str = new StringBuilder(word).reverse().toString();
	if(str.equals(word))
	    return true;
	return false;
    }
	
    public int countDiffChars(String word){

	String str="";

	for (int i = 0; i < word.length(); i++) {
	    if(str.indexOf(word.charAt(i)) == -1 ){
		str = str + word.charAt(i);
	    }
	}
	return str.length();
    }
}
