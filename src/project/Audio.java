package project;

import java.util.Scanner;

public class Audio extends inherit {
	Scanner scan = new Scanner(System.in);
	int  number = 0 , number1 = 0 , number2 = 0;
	int num1 = 0 , num2 = 0 , num3 =0 , num4 = 0;
	
	int arr[] ;
	//20$ for 15 seconds
// this will lead to cost of preparation	
	public void details_of_ad() {
		System.out.print("Number of Ads required (as per needs ) :--  ");
		number = scan.nextInt();
		System.out.println();
		arr = new int[number+1];
		System.out.println("(Minimum Duration is 15 second)");
		for(int i=1 ; i<=number ; i++) {
			System.out.print("Duration of "+i+"th Ad :- ");
			arr[i] = scan.nextInt();
		}
		System.out.println("\n");
		further_details();
	}
	
// this will lead to cost of airing	
	public void further_details(){
		
		System.out.println("Want to play Ad in Business Hours ? -->(Y/N)");
		String s = scan.next();
		if(s.equals("Y") || s.equals("y")) {
			number1 += super.get_number("a");
			System.out.print("Number of WEEKS :- (Upto "+super.get_days()+" weeks)  ");
			number2 += scan.nextInt();
			System.out.println();
		}
		
		System.out.println("Want to play Ad in Evening Hours ? -->(Y/N)");
		s = scan.next();
		if(s.equals("Y") || s.equals("y")) {
			num1 += super.get_number("A");
			System.out.print("Number of WEEKS :- (Upto "+super.get_days()+" weeks)  ");
			num2 += scan.nextInt();
			System.out.println();
		}
		
		System.out.println("Want to play Ad in Overnight and Weekend Hours ? -->(Y/N)");
		s = scan.next();
		if(s.equals("Y") || s.equals("y")) {
			num3 += super.get_number("a");
			System.out.print("Number of WEEKS :- (Upto "+super.get_days()+" weeks)  ");
			num4 += scan.nextInt();
			System.out.println();
		}
		
		calculate1();	
		calculate2();
		super.status = "Quoted";
		}


	private void calculate1() {
		double total  = 0.0 ; 
		for(int i=1 ; i<arr.length ; i++) {
			double temp = arr[i]/15;
			total += temp*20 ; 
		}
		super.cost_of_prepartion = total ;
	}
	
	private void calculate2() {
		double total  = (number1 * number2 * 70) + (num1*num2*60)+ (num3*num4*35)  ;
		super.cost_of_airing = total;
	}
	
	public void display(String name) {
		System.out.println("\n");
		System.out.println("\t\t Details of "+name +" Order :-   ");
		
		System.out.println(number+" X Radio Ads Preparation(Of Same or Different Duration)"+"\t\t $"+super.cost_of_prepartion);
		if(number1 >0 && number2 >0) {
			System.out.println(number1+" X Radio advertising during Business hours for "+number2+" weeks:"+"\t\t $"+(number1 * number2 * 70));
		}
		
		if(num1 > 0 && num2 >0) {
			System.out.println(num1+" X Radio advertising during Evening hours for "+num2+" weeks:"+"\t\t\t $"+(num1 * num2 * 60));
		}
		if(num3 >0 && num4 >0) {
			System.out.println(num3+" X Radio advertising during OverNight and Weekends for "+num4+" weeks:"+"\t $"+(num3 * num4 *35 ));
		}
		
		System.out.println("\n");
		super.display1();
		
		
	}
	
	public void display1() {
		System.out.println("Quote Total \t\t\t\t $"+super.get_total_amount());
		System.out.println("Amount Paid \t\t\t\t $"+super.paid);
	}
	
	
	
	
	

}
