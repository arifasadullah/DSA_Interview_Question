package String;
//T.C--> O(length of first string * length of array)==O(MN)
//S.C --> O(N)
public class Longest_CommonPrefix {

    public static String longestCommonPrefix(String[] str){
        String longestCommonPrefix="";
        int index=0;
        if( str==null || str.length==0){
            return longestCommonPrefix;
        }
        for(char c:str[0].toCharArray()){
             for(int i=1;i<str.length;i++){
                 if(index >= str[i].length() || c !=str[i].charAt(index)){
                     return longestCommonPrefix;
                 }
             }
             longestCommonPrefix +=c;
             index++;
        }
        return longestCommonPrefix;
    }



    public static void main(String[] args) {
        System.out.println("Longest Common Prefix");
        String [] str = {"geek","geeker","geeksforgeeks"};
        System.out.println(longestCommonPrefix(str));
    }
}
