import java.util.Scanner;
public class factorial
{
    public static void main(String args[])
	{
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter number for factorial: ");
        int num=sc.nextInt();
        int i=1,fact=1;
        for(i=1;i<=num;i++)
	{
		fact=fact*i;
		}
       System.out.print("the factorial of  " + num+ " is  " + fact);
        
    }
}