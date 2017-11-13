
public class Strings3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(sameEnds("TESTendyyyET"));
	
	}
	
	
	static public String sameEnds(String string) {
		if(string.length()<2)return string;
		
		return string;
	}
	
	

/*	Given a string and an int n, return a string made of n repetitions of the last n characters of the string. You may assume that n is between 0 and the length of the string, inclusive.
*/	public String repeatEnd(String str, int n) {
		  
	}
	
	public boolean prefixAgain(String str, int n) {
		  if(str.length()<n)return false;
			
			String subStr = str.substring(0,n);
			if(str.indexOf(subStr,n)>0)
				return true;
			else 
				return false;
		  
	}



}
