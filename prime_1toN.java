package basic;
import java.util.*;
public class prime_1toN{public static void main(String[] args) {
    int i,count;
    Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(int j=2;j<=n;j++)
	{
	count=0;
	for(i=1;i<=j;i++)
	{
	   if(j%i==0)
	   {
	        count++;        
	   }
	}
	if(count==2)
	       System.out.println(j);     
	}
}
    
}
