package project;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	static HashMap<String , Client> map  = new HashMap<>();
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		
		System.out.println("           ____________WELCOME TO ADVERTISEMENT AGENCY____________ \n\n");
		help();
		

	}
	
	static void help() {
		print();
		int a = scan.nextInt();
		while(true) {
		if(a ==  1 ) {
			Client client = new Client();
			String name = client.name;
			map.put(name, client);
		}else if(a == 2) {
			System.out.print("Enter Company Name:- \n (Add '_' after the company name "
					+ "enter the Number of that vist ) :-  ");
			String s = scan.next();
			System.out.println();
			if(map.containsKey(s)) {
				Client c = map.get(s);
				c.help();
			}else {
				System.out.println("No Such Username or Company");
				
			}
		}else {
			System.out.println("_____!!!!! THANKYOU !!!!______");
			break;
		}
		System.out.println();
			print();
			a = scan.nextInt();
		}
			
	}
	
// printing of initial menu 	
	static void print() {
		System.out.println("Select Option to proceed further \n "
				+ "--> new QUOTE (1) \n"
				+ "--> see old QUOTE (2) \n"
				+ "-->Exit the program(3)");
	}

}
