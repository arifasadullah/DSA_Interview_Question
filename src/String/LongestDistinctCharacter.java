import java.util.*;
public class LongestDistinctCharacter{
	public static void main(String [] args){
		 String str="abababcdefababcdab";
       // String str="gccksfvrgccks";
		System.out.println(longestDistinctCharacter(str));
		
	}
	public static int longestDistinctCharacter(String str){
		HashMap<Character,Integer> mpp= new HashMap<Character,Integer>();
		int right=0;
		int left=0;
		int len=0;
		while(right<str.length()){
			//if map contains the character
			if(mpp.containsKey(str.charAt(right))){
				//we will update the left
				left=Math.max(mpp.get(str.charAt(right))+1,left);
			}
			//if map contains the character we update the value of key
			// if not we will just put the value in map
			mpp.put(str.charAt(right),right);
			
			//if new length(right-left+1) is greater than previous length we will update length 
			len=Math.max(len,right-left+1);
			right++;
	}
	return len;
	}
}