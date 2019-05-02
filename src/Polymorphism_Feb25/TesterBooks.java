package Polymorphism_Feb25;

import static Polymorphism_Feb25.Shipping.*;

import java.util.Scanner;

public class TesterBooks {
public static void main(String[] args) {
	
//	Shipping.staticMethod();                   //you dont have to create an object.
//	staticMethod();                           // you can do this without using Shipping class name. You have to do the importing above.
	
	
	UsedBooks book=new EBook();
	book.isUsableCondition();
	
	Book book1=new EBook(); 
	book1.isUsableCondition();
	
	
	Prime pm= new EBook();
	pm.isPrimeMember();
	
	
	Prime book3=new EBook();
	Shipping book4=new EBook();
	Object book5=new EBook();   
//Object book6=new Book();           //we can do this if only Book is a non abstract class
	Object str=new String();
	Object scan=new Scanner(System.in);
	
	
}
}
