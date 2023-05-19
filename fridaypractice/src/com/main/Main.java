package com.main;
import java.util.*;
import com.dto.*;
import com.exception.Something;
import com.dao.*;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int c;
		do {
			
			System.out.println("1. Add");
			System.out.println("2. delete");
			System.out.println("3. update");
			System.out.println("0. Exist");
			
			
			
			c=sc.nextInt();
			switch(c) {
			case 1:
				Add(sc);
				break;
			case 2:
				delete(sc);
				break;
			case 3:
				update(sc);
				break;
				
			case 0:
				System.out.println("thanks");
				break;
				
				default : 
					System.out.println("Invalid selection");
			}
			
		}while(c!=0);
		sc.close();
	}

	private static void update(Scanner sc) {
	
		
	}

	private static void delete(Scanner sc) {
		System.out.println("Enter roll");
		int roll=sc.nextInt();
		
		Interface a=new Imple();
		
		try {
			a.Delete(roll);
			System.out.println("Deleted Successfully");
		} catch (Something e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private static void Add(Scanner sc) {
		
		System.out.println("Enter roll");
		int roll=sc.nextInt();
		System.out.println("Evte name");
		String name=sc.next();
		System.out.println("Enter Address");
		String address=sc.next();
		
		Student a=new Student(roll, name, address);
		
		Interface b=new Imple();
		
		b.adddata(a);
	}
	
}
