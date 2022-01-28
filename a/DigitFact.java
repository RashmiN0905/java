//WAJPT find the factorial of digits in a number

import java.util.*;
class DigitFact
{
public static void main(String[]args)
{
int num=456;
while(num>0)
{
int n=num%10;
int fact=1;
for(int i=1; i<n;i++)
{
fact=fact*i;
}
System.out.println(fact+ " i  the factorial of "+n);
num=num/10;
}
}
}


class DigitFact1
{


public static void dig(int num)
{
int rev=0;
while(num>0)
{
int n = nums
rev= rev*10 +n;
num=num/10;
}
digit(rev);
}


public static void digit(int num)
{
int fact=1;
while(num>0)
{
int n=num%10;
for(int i=1; i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact+ " is  the factorial of "+n);
fact=1;
num=num/10;
}
return ;
}
public static void main(String[]args)
{
Scanner Sc= new Scanner(System.in);
System.out.println("Enter the number ");
int a=Sc.nextInt();
dig(a);
}
}