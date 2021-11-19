public class LongestCommonPrefix{
	public static void main(String[] args){
	 String str="iifa";
        System.out.println(repeatingLeftMost(str));
		
	}
	public static String repeatingLeftMost(String str){
		str=str.toLowerCase();
		int[] visited= new int[26];
		String res="-1";
		for(char c:str.toCharArray()){
			visited[c-'a']++;
		}
		for(char c:str.toCharArray()){
			if(visited[c-'a']==1){
				res =""+c;
				break;
			}
		}
		return res;
	}
		
}
	