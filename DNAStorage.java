import java.util.Scanner;

public class DNAStorage{
    public static void main(String[] args) {
 
  
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            // Your code goes here
            for(int i=0;i<n;i+=2){
                
                    if(s.charAt(i)=='0' && s.charAt(i+1)=='0'){
                        System.out.print("A");
                       
                    }
                  
                    else if(s.charAt(i)=='0' && s.charAt(i+1)=='1'){
                        System.out.print("T");
                       
                    }
                    else if(s.charAt(i)=='1' && s.charAt(i+1)=='0'){
                        System.out.print("C");
                        
                    }
                    else if(s.charAt(i)=='1' && s.charAt(i+1)=='1'){
                        System.out.print("G");
                       
                    }
                }
                g
            }


        }
    
    }
