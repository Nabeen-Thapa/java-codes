import java.util.Scanner;
public class reverse
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("enter the number to reverse: ");
        int num=sc.nextInt();
        int sum=0;
        while(num!=0)
        {
            int mod=num%10;
            sum=sum*10+mod;
            num/=10;
        }
        System.out.print("reverse number is "+sum);
    }
    
}
