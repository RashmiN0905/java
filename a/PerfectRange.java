// WAJPT Print the Perfect Number in given range

import java.util.Scanner;

class PerfectRange
{
public static void range(int m, int n)
{
for(int i=m; i<=n; i++)
{
int sum=0;
for(int j=1; j<i; j++)
{
if(i%j==0)
{
sum=sum+j;
}
}
if(sum==i)
{
System.out.println(i+"is a perfect number");
}
}
}

public static void main(String[]args)
{
Scanner Sc = new Scanner(System.in);
System.out.println("Enter the value of m");
int m = Sc.nextInt();
System.out.println("Enter the value of n");
int n = Sc.nextInt();
System.out.println("------------------------------------");
range(m,n);

}
}