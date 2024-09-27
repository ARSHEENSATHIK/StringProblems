import java.util.Arrays;
import java.util.*;
public class pangram {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.nextLine();
        String t=s.toLowerCase();
        char[]ch=t.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]&&ch[i]!=' '){
                    ch[j]='@';
                }
            }
        }
        boolean isPangram=true;
        int sum=0;
        for(int i=0;i<ch.length;i++){
            for(char c='a';c<='z';c++){
                if(ch[i]==c){
                    sum++;
                    isPangram=true;
                }
            }
        }
        if(isPangram&&sum==26){
            System.out.println("Yes it is a Pangram");
        }
        else{
            System.out.println("No it is not a Pangram");
        }
        
    }
}
