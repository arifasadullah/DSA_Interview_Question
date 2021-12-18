package String;



public class IsAnagram {
    public static boolean isAnagram(String str1,String str2){
        String st1=str1.toLowerCase();
        String st2=str2.toLowerCase();
        char[]  ch1=st1.toCharArray();
        char[]  ch2=st2.toCharArray();
        int [] visited=new int[256];
        if(ch1.length !=ch2.length) return false;
        for(int i=0;i<ch1.length;i++){
            visited[ch1[i]-'a']++;
            visited[ch2[i]-'a']--;
        }
        for(int i=0;i< visited.length;i++){
            if(visited[i] !=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Valid Anagram Or Not");
        String str1="silent1";
        String str2="Listen";
        System.out.println(isAnagram(str1,str2));
    }
}
