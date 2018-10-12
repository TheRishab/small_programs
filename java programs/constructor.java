import java.io.*;
import java.util.*;
class library
{
	String name;
	int quantity;
	float price;
	void getdata()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter name");
		name=obj.next();
		System.out.println("Enter the quantity");
		quantity=obj.nextInt();
		System.out.println("Enter price");
		price=obj.nextFloat();	
	}
	
	void showdata()
	{
		System.out.println("Name\t     Price\t Quantity");
		System.out.println(name+"\t"+price+"\t  "+quantity);
	}
	library()
	{
		name="sherlock";
		quantity=10;
		price=1000;
	}
	library(String s,int x,float y)
	{
		name=s;
		quantity=x;
		price=y;
	}

	public static void main(String args[])
	{	
		library l1=new library();
		library l2=new library("Mockingbird",5,5500);
		l1.showdata();
		l2.showdata();
	}
}

		