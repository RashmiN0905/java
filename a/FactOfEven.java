import java.util.Scanner;

class FactOfEven
{
public static void num(int n)
{
int rev=0;
while(n>0)
{
int m=n%10;
rev= rev*10+m;
n=n/10;
}
dig(rev);
}

public static void dig(int rev)
{
while(rev>0)
{
int m=rev%10;
int fact=1;
if(m%2==0)
{
for(int i=1;i<=m;i++)
{
fact=fact*i;
}

System.out.println(fact+" is the factorial of "+m);
fact=1;
}
else
{
fact=0;
}
rev=rev/10;
}
}

public static void main(String[]args)
{
Scanner Sc = new Scanner(System.in);
System.out.println("Enter the number");
int n = Sc.nextInt();
num(n);
}
}