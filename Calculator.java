import java.util.*;
class Add
{
int r;
void Add(int a,int b)
{
r=a+b;
System.out.println(a+"+"+b+"="+r);
}
}
class Subtract
{
int r;
void Subtract(int a,int b)
{
r=a-b;
System.out.println(a+"-"+b+"="+r);
}
}
class Multiply
{
int r;
void Multiply(int a,int b)
{
r=a*b;
System.out.println(a+"*"+b+"="+r);
}
}
class Divide
{
int r;
void Divide(int a,int b)
{
r=a/b;
System.out.println(a+"/"+b+"="+r);
}
}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,a,b,flag=1;
		Add ad=new Add();
		Subtract sb=new Subtract();
		Multiply ml=new Multiply();
		Divide d=new Divide();
		Scanner s=new Scanner(System.in);
		while(flag==1)
		{
		System.out.print("enter a and b:");
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Choose Operation:\n1.Addition 2.Subtraction 3.Multiplication 4.Division");
		choice=s.nextInt();
		if(choice==1)
		{
		ad.Add(a,b);
		}
		else if(choice==2)
		{
		sb.Subtract(a,b);
		}
		else if(choice==3)
		{
		ml.Multiply(a,b);
		}
		else if(choice==4)
		{
		d.Divide(a,b);
		}
		System.out.println("Do you want to continue (if yes press 1 else 0):");
		flag=s.nextInt();

	}

}
}