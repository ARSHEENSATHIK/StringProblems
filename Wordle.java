import java.util.*;
import java.lang.*;
import java.io.*;
public class Wordle {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-- >0){
            System.out.println("Enter the Hidden Word : ");
            String S=sc.next();
            System.out.println("Enter the Guess Word : ");
            String T=sc.next();
            String M="";
            for(int i=0,j=0;i<S.length();i++,j++){
               {
                    if(S.charAt(i)==T.charAt(j)){
                        M+="G";
                        
                    }
                    else{
                        M+="B";
                      
                    }
                }
               
            }
            System.out.println(M);
        }
       
        

    }
}
