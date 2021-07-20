package project;

import java.util.Scanner;

public class Television extends inherit {
	Scanner scan = new Scanner(System.in);
	int i =0 , number = 0 , j=0;
	int arr[]  = new int[4];
	int special[] = new int[5]; 
	
	public void details_of_ad() {
		System.out.println("Details of Ad :- (select the corresponding number) \n"
				+ "(all ads are 30 secs)\n"
				+ "\t\t-->Basic Ad with Still Images and Voice or Text over them (1) \n"
				+ "\t\t-->Complex Ad with Different Locations or Actors (2)");
		i = scan.nextInt();
		further_details();
	}
	
	public void further_details() {
		int temp = super.get_number("T");
		number += temp ; 
		for(int i=1 ; i<=temp ; i++) {
		System.out.println("Select Exposure for "+ i +"th Channel :- (Select Correpsonding Number)\n "
				+ "--->High Exposure(1) \t"+"--->Medium Exposure(2) \t"+"--->Low Exposure(3) ");
		j = scan.nextInt();
		arr[j]++;
		
		System.out.println();
		System.out.println("Do You want to feature it in Any Specific Programs :-- \n"
				+ "-->Sports(1) \t"+"-->News(2) \t"+"-->Children's(3) \t"+"-->Home-Imporovement(4) \t"+"-->None(0)");
		int i1 = scan.nextInt();
		special[i1]++;
		
		}
		calculate1();
		calculate2();
		super.status = "Quoted";
	}

	private void calculate1() {
		int total = 0;
		total = (arr[1]*400)+(arr[2]*280)+(arr[3]*150);
		
		for(int i=1 ; i<special.length ; i++) {
			total += (special[i]*100);
		}
		
		super.cost_of_airing = total*super.days;
	}

	private void calculate2() {
		if(i == 1)super.cost_of_prepartion = 110;
		else super.cost_of_prepartion = 250;
		
	}
	
	public void display(String name) {
		System.out.println("\n");
		System.out.println("\t\t Details of "+name +" Order :-   ");
		
		String s  = "";
		String s1 = "";
		if(i == 1) {
			s = "Basic" ; 
		}else {
			s = "Actors involved";
		}
		
		System.out.println("1 X TV Ad Preparation  - "+ s+"\t\t $"+super.cost_of_prepartion);
		for(int i=1 ; i<arr.length ; i++) {
			if(i == 1)s1 = "High";
			else if (i==2) s1 = "Medium";
			else s1 = "Low";
			
			if(arr[i]>0) {
				if(i == 1)
				System.out.println(arr[i]+" X "+s1+ " Exposure campaign for "+super.days+" weeks: \t\t"+"$"+(arr[1]*400*super.days));
				else if(i ==2)
					System.out.println(arr[i]+" X "+s1+ " Exposure campaign for "+super.days+" weeks: \t\t"+"$"+(arr[2]*280*super.days));
				else
					System.out.println(arr[i]+" X "+s1+ " Exposure campaign for "+super.days+" weeks: \t\t\t"+"$"+(arr[3]*150*super.days));
			}
		}
		int total  = 0;
		for(int i=1 ; i<special.length ; i++) {
			if(special[i] >0)total++;
		}
		System.out.println(total + " X Feature in specific programming for "+super.days+" weeks :"+"\t $"+(total*100*super.days));
		System.out.println("\n");
		display1();
		
	}
	
	
	
	
	

}
