mport java.util.Scanner;
public class min&max
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10];
		int i,min,max;
		System.out.println("Enter 10 numbers:");
		for(i=0;i<a.length;i++)
		a[i]=sc.nextInt();
		max=a[0];
		min=a[0];
		for(i=0;i<a.length;i++)
		{
			if(max<a[i])
			max=a[i];
			if(min>a[i])
			min=a[i];
		}
		System.out.println("Maximum=" + max);
		System.out.println("Minimum=" + min);
	}
}