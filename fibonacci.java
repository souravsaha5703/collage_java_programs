import java.util.Scanner;

public class fibonacci {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=1,c;
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();
        System.out.print("The fibonacci series is :");
        for (int i=1;i<=n;i++)
        {
            System.out.print(" "+a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}