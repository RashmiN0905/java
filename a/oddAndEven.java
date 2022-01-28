// WAJPT find the Summation of even digit factorials and odd digit factorial

import java.util.Scanner;

class oddAndEven
{


public static void num(int a)
{
int rev=0;
while(a>0)
{
int m = a%10;
rev=rev*10+m;
a=a/10;
}
dig(rev);
}

public static void dig(int rev)
{
int Esum=0;
int OSum=0;
int fact1=1;
while(rev>0)
{
int m =rev%10;
if(m%2==0)
{
for(int i=1;i<=m;i++)
{
fact1=fact1*i;
}
Esum=Esum+fact1;
System.out.println(fact1+" is the factorial of "+m);
fact1=1;
}
else
{
for(int i=1;i<=m;i++)
{
fact1=fact1*i;
}
OSum=OSum+fact1;
System.out.println(fact1+" is the factorial of "+m);
fact1=1;
}
rev=rev/10;
}
System.out.println("--------------------------------------------------------------");
System.out.println(Esum+ " ---->is the Even sum of factorial of digits in a number");
System.out.println("--------------------------------------------------------------");
System.out.println(OSum+ "---->is the Odd sum of factorial of digits in a number");
}


public static void main(String[]args)
{
Scanner Sc= new Scanner(System.in);
System.out.println("Enter the number first ");
int a = Sc.nextInt();
num(a);
}
}