class Vivo
{
int feature1(int a)
{
System.out.println("Oldest");
return 10;
}
}

class Vivo1 extends Vivo 
{
 public void feature1()
{
System.out.println("new feature added");
}
}

class Driver
{

public static void main(String[] args) 
{
Vivo app = new Vivo1();
app.feature1();
}
}

