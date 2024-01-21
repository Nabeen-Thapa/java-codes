import java.util.Scanner;
public class palindrome
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter a five digits number to check palindrome or not: ");
        int num=sc.nextInt();
        int temp=num;
        int mod=0,sum=0;
        if(num>=10000 && num<=99999)
        { while(num!=0)
            {
                mod=num%10;
                sum=sum*10+mod;
                num/=10;
            }
            if(temp==sum)
            {
                 System.out.print("entered numbwer is palindrome");
            }
            else
            {
                System.out.print("entered number is not palindrome");
            }
        }
        else
        {
            System.out.println("entered numeber is not five digits number "); 
            
        }
    }
    
}
