import java.util.Scanner;
public class compare 
{
    public static void main(String args[])
	{
        Scanner sc = new Scanner (System.in);
		System.out.println("enter amount: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a==b)
			System.out.println("Both numbers are equal");
		else if(a>b)
			System.out.println("a is greater than b");
		else if(a<b)
			System.out.println("a is less tha b");
    }
}