import java.util.Arrays;
import java.util.Scanner;
public class diffConsecutice {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter test cases: " );
        int t=sc.nextInt();
        String s="";
        char[]c;
        int count=0;
        while(t-- >0){
            System.out.print("Enter n: ");
            int n=sc.nextInt();
            System.out.println("Enter ur String :");
            for(int i=0;i<n;i++){
                s=sc.next();
                System.out.println(i+":"+s);
                c=s.toCharArray();
            }

          
            
            // System.out.println("io : "+Arrays.toString(c));
            // for(int i=0;i<c.length;i++){
            //     for(int j=i+1;j<c.length;j++ ){
            //       if(c[i]==c[j]){
            //         count++;
            //       }
            //     }
            //     System.out.println("count : "+count);
            // }
            
            
        }
    }
}
