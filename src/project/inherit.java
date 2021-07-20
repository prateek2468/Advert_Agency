package project;

import java.util.Scanner;

public class inherit {
	
	double cost_of_prepartion;
	double cost_of_airing;
	boolean accept = false;
	double paid = 0.0;
	double total_amount;
	String status ;
//	int amount_left;
	
	int days;
	Scanner scan = new Scanner(System.in);
	
	public void set_days() {
		System.out.print("Number of weeks of airing Ad :--  ");
		days = scan.nextInt();
		System.out.println ();
	}
	
	public int get_days() {
		return days;
	}
	
	public String get_status() {
		payment_check();
		return status;
	}
	
	public double get_total_amount() {
		total_amount = cost_of_airing+cost_of_prepartion;
		return cost_of_prepartion+cost_of_airing ; 
	}
	
	public int get_number(String s) {
		String s1 = "";
		if(s.equals("A") || s.equals("a")) s1 = "RADIO STATIONS ";
		if(s.equals("T") || s.equals("t")) s1 = "TELEVISION CHANNELS ";
		if(s.equals("N") || s.equals("n")) s1 = "NEWSPAPER in which it should appear ";
		System.out.print("Number of "+ s1 +":- ");
		int a = scan.nextInt();
		return a;
	}
	
	public void display(String name) {
		
	}
	public void display1() {
		System.out.println("Quote Total \t\t\t\t $"+get_total_amount());
		System.out.println("Amount Paid \t\t\t\t $"+paid);
		
	}
	
	public boolean check() {
		return false;
	}
	
	public void acceptance(String name) {
		status = "Design Work Done";
		System.out.println("\n");
		System.out.println("Does the |"+name +"| Accept the offer ?? (Y/N)");
		String s = scan.next();
		if(s.equals("Y")|| s.equals("y"))accept = true;
		else accept = false;
	}
	
	public boolean get_accept() {
		return accept;
	}
	
	
	
	// polymorphic function
	public void details_of_ad() {}
	
	public void further_details(){}
	
	public void payment() {
		
		System.out.println("Do the Complete Payment :-- ");
		System.out.println("Amount to be Paid :- "+(total_amount -paid));
		System.out.print("Enter Amount :- ");
		double a = scan.nextDouble();
		System.out.println();
		if(a == (total_amount-paid )) {
			System.out.println("!!!!! Payment Confirmed !!!!!");
			paid += a;
		}else {
			System.out.println("!!!No Payment Done ,  Try Again !!!");
		}
	}

	public void payment(String string) {
		System.out.println("Installment payment :--- ");
		System.out.println("Amount to be Paid :- "+(total_amount/days));
		System.out.print("Enter Amount :- ");
		double a = scan.nextDouble();
		System.out.println();
		if(a == (total_amount/days)) {
			System.out.println("!!!!! Payment Confirmed !!!!!");
			paid += a;
		}else {
			System.out.println("!!!No Payment Done ,  Try Again !!!");
		}
	}
	
	public boolean payment_check() {
		if(paid>= total_amount) status = "Complete";
		return total_amount>paid;
	}
	
	public double get_cost_of_preparation() {
		return cost_of_prepartion;
	}
	
	public double get_cost_of_airing() {
		return cost_of_airing;
	}

}
