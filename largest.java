import java.util.Scanner;
public class largest
{
    public static void main(String args[])
	{
        Scanner sc = new Scanner (System.in);
		System.out.println("enter four numbers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int large=a
		if(large<b)
			large= b;
		else if(c>large)
			large=c;
		else
			large=d;
		
		System.out.println("largest number is  "+large);
    }
}