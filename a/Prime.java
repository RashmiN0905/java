// WAJPT find the Prime Number


import java.util.Scanner;

class Prime
{
public static void num(int num)
{
int count=2;
for(int i=2; i<num/2;i++)
{
if(num%i==0)
{
count++;
}
}
if(count>2)
{
System.out.println(num+" is not a Prime number");
}
else
{
System.out.println(num+" is a Prime number");

}
}

public static void main(String[]args)
{
Scanner Sc= new Scanner(System.in);
System.out.println("Enter the number");
int n = Sc.nextInt();
num(n);
}
}