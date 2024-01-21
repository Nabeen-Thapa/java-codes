import java.util.Scanner;
public class fabonacci 
{
    public static void main(String args[])
	{
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter he no. of terms: ");
        int term=sc.nextInt();
        int a=1,b=1,c=0,i=0;
		System.out.print(+ a + "\t"+ b);
        for(i=1;i<=term-2;i++)
        {   
            c=a+b;
		    System.out.print("\t" + c);
            a=b;
            b=c;
        }
    }
}