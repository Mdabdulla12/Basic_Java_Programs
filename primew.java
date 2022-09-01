package basic;
import java.util.Scanner;
public class primew {public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
    int div=2;
    boolean isprime=true;
    for(div=2;div<=n-1;div++)
    {
        if(n%div==0)
        {
            isprime=false;


        }
 }
    if(isprime)
    {
        System.out.println("prime");
    }
    else{
        System.out.println("composite");
    }




}
    
}
