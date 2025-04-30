
import java.util.Scanner;

public class integerInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number");
        int n=sc.nextInt();
      //String s=""+n;
      //  s=s+n;   //int to string
      String s=Integer.toString(n); //built fxn
      
       System.out.println(s); 
       System.out.println(s.length());
    }
}
