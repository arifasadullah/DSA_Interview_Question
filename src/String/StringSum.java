package String;

public class StringSum {
    public static void main(String[] args) {
        System.out.println("Sum Of String ");
        String str="1234";
        System.out.println(sum(str));
    }
    static int sum(String str){
        char[] ch=str.toCharArray();
        int sum=0;
        for(int i=0;i< ch.length;i++){
            sum += ch[i]-'0';
        }
        return sum;
    }
}
