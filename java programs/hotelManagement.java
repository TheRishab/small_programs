import java.io.*;
import java.util.*;

class hhi{
		String name,job,address,roomServices,paymentMethod,meals;
		int nofrooms,phone,nofpersons,period;
		
		public void enterdata(){
			Scanner sc=new Scanner(System.in);
			System.out.println("your name?");
			name=sc.nextLine();
			System.out.println("job??");
			job=sc.nextLine();
			System.out.println("address!!");
			address=sc.nextLine();
	        System.out.println("number of rooms you would like");
			nofrooms=sc.nextInt();
			System.out.println("enter your phonne number");
			phone=sc.nextInt();
			System.out.println(" enter the number of persons accompanied");
			nofpersons=sc.nextInt();
			System.out.println("enter the period of stay in days");
			period=sc.nextInt();
		}
	    public void hi(){
			System.out.println("                          welcome to HHI                                ");
			System.out.println("                    ours is a five stared rating                        ");
			System.out.println("                 one of the best chef of our restraunt                  ");
		}	
		public void display(){
				System.out.println( name);
				System.out.println( job);
				System.out.println( address);
				System.out.println( nofrooms);
				System.out.println( phone);
				System.out.println( nofpersons);
				System.out.println( period);
				
		}
		public void laundry(){
			Scanner s=new Scanner(System.in);
			System.out.println("DO you need laundry yes or no ");
				System.out.println("roomServices=");
			    roomServices=s.nextLine();
			    if(roomServices=="yes"){
					System.out.println("Laundry services included");
				}
				else
					System.out.println("Laundry services not included");
		}
		public void meals(){
			Scanner c=new Scanner(System.in);
			System.out.println("Do you need meals yes or no");
				System.out.println("meals");
				meals=c.nextLine();
				if(meals=="yes" ){
					System.out.println("meals included");
				}
				else
					System.out.println("meals not included");
		}
		public void payment(){
			Scanner t=new Scanner(System.in);
			System.out.println("enter your payment method");
			paymentMethod=t.nextLine();
			if(paymentMethod=="card"){
				System.out.println("gimme your card");
			}
			else if(paymentMethod=="paytm"){
				System.out.println("take this code and show");
			}
			else 
				System.out.println("plaese gimme cash");
		}
}


class hotelManagement{
	public static void main(String args[]){
		hhi h=new hhi();
		h.enterdata();
		h.hi();
		h.display();
		h.laundry();
		h.meals();
		h.payment();
	}
}