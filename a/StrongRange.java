// WAJPT Print the Strong Number in given range

import java.util.Scanner;
class StrongRange
{
public static void range(int m, int n)
{
for(int i=m; i<=n; i++)
{
int n1=i;
int sum=0;
while(n1>0)
{
int s= n1%10;
int fact=1;
for(int j=1; j<=s; j++)
{
fact=fact*j;
}
sum=sum+fact;
n1=n1/10;
}
if(sum==i)
{
System.out.println(i+" is a Strong number");
}
}
}
public static void main(String[]args) 
{
Scanner Sc= new Scanner(System.in);
System.out.println("Enter the value for m");
int m = Sc.nextInt();
System.out.println("Enter the value for n");
int n = Sc.nextInt();
range(m,n);
}
}
