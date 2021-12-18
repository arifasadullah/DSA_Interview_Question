package String;

public class IsPanagaram {
    public static boolean isPanagaram(String str){
        String st=str.toLowerCase();
        char[] ch=st.toCharArray();
        int[] visited=new int[26];
        for(int i=0;i< ch.length;i++){
            visited[ch[i]-'a']++;
        }
        for(int i=0;i< visited.length;i++){
            if(visited[i] ==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Valid Panagaram Or Not");
        String str = "The quick brown fox jumps over the lazy dog";
        String st=str.replaceAll("\\s", "");
        System.out.println(st);

        System.out.println(isPanagaram(st));
    }
}
