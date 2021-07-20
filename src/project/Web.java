package project;

import java.util.Scanner;

public class Web extends inherit {
	int i=0 ;
	String s = "";
	Scanner scan = new Scanner(System.in);
	int amt =0 ;
	int value= 0;
	
	public void details_of_ad() {
		System.out.println("Select any One :-- \n"
				+ "-->Static Image(1) \t"+"-->Animated Image(2)");
		i = scan.nextInt();
		if(i == 1) {
			s = "Static Image";
			value = 5;
		}else {
			s= "Animated Image";
			value = 7;
		}
		further_details();
	}
	
	public void further_details() {
		System.out.print("Maximum amount that can be paid :- ");
		amt = scan.nextInt();
		calculate1();
		calculate2();
		super.status = "Quoted";
	}
	
	private void calculate1() {
		super.cost_of_prepartion = value;
	}

	private void calculate2() {
		super.cost_of_airing = amt;
		
	}
	
	public void display(String name) {
		System.out.println("\n");
		System.out.println("\t\t Details of "+name +" Order :-   ");
		
		System.out.println("Ad with "+s+"\t\t $"+value) ;
		System.out.println("Availing Online Advertisment Services :"+"\t\t $"+amt);
		super.display1();
	}
	
	
	

}
