// WAJPT Print the Prime Number in between 20-50

import java.util.Scanner;

class PrimeRange
{
public static void range(int m, int n)
{
for(int i=m; i<=n; i++)
{
int count=2;
for(int j=2; j<i; j++)
{
if(i%j==0)
{
count++;
}
}
if(count>2)
{
System.out.println(i+" is not a Prime number");
}
else
{
System.out.println(i+" is a Prime number");
}
}
}

public static void main (String[]args)
{
Scanner Sc= new Scanner(System.in);
System.out.println(" Enter the value of m");
int m= Sc.nextInt();
System.out.println(" Enter the value of n");
int n= Sc.nextInt();
System.out.println("=========================================");
range(m,n);
}
}