import java.lang.*;
import java.util.*;
class furniture
{
String type,size,color,price;
public static void main(String args[])
{

furniture obj=new furniture();
obj.input();
obj.display();
}

public void input()
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the type of the furniture");
type=sc.next();
System.out.println("Enter the size of the furniture");
size=sc.next();
System.out.println("Enter the color of the furniture");
color=sc.next();
System.out.println("Enter the price of the furniture");
price=sc.next();
}

public void display()
{
System.out.println("The type of the furniture is"+type);
System.out.println("The size of the furniture is"+size);
System.out.println("The color of the furniture is"+color);
System.out.println("The price of the furniture is"+price);
}
}