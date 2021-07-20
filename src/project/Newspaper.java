package project;

import java.util.Scanner;

public class Newspaper extends inherit{

	int duration ;
	int number , number1=0;
	int height , width ;
	int graphic , color , pro  , black;

	int days;
	int news ; 
	
	Scanner scan = new Scanner(System.in);
	@Override
	public void set_days() {
		System.out.print("Number of days of Airing Ad :--  ");
		duration = scan.nextInt();
		System.out.println();
		System.out.print("Number of different NewsPaper to publish Ad :- ");
		news = scan.nextInt();
		System.out.println();
		number = news + duration ; 
	}
	
	public void details_of_ad() {
		// number ads in newspaper
		
		System.out.print("Dimensions of the  Ad :- (All in Centimeters)\n"
				+ "Height -> ");
		height = scan.nextInt();
		System.out.print("Width -> ");
		width = scan.nextInt();
		System.out.println();
		
		further_details();
	}
	
	public void further_details() {
		int temp= 0;
		System.out.print("Color of the Ad :-- \n"
				+ "->Colored ( "+number +" is the Limit) == ");
		color = scan.nextInt();
		temp = color;
		System.out.print("Black and White ( "+ (number - temp)+" is the limit) ==  ");
		black = scan.nextInt();
		System.out.println("Graphic work needed in how many Ads ??\n"
				+ "(0 for None)\n"
				+ "( "+number +" is the limit  )");
		graphic = scan.nextInt();
		
		System.out.println("Place how many Ads in Prominent Place ??\n"
				+ "(0 for None)\n"
				+ "( "+number +" is the limit  )");
		pro = scan.nextInt();
		
		calculate1();
		calculate2();
		super.status = "Quoted";
	
	}
	
	private void calculate1() {
		double total = height * width * 1.35 * number;
		super.cost_of_prepartion = total;
	}
		

	private void calculate2() {
		double total = 0.0;
		total += height * width * color ;
		total += height * width * black;
		total += (graphic * 20);
		total += (pro * 10);
		this.cost_of_airing = total ; 
	}
	
	public void display(String name) {
		System.out.println("\n");
		System.out.println("\t\t Details of "+name +" Order :-   ");
		
		System.out.println(number + " X Newspaper Ads with set Dimensions "+"\t\t $"+super.cost_of_prepartion);
		System.out.println(color +" X Colored Ads :"+"\t\t\t\t $"+(height * width * color));
		System.out.println(black +" X Black & White Ads :"+"\t\t\t\t $"+(height * width * black));
		System.out.println(graphic+ " X Graphic Design Work :"+"\t\t\t $"+(graphic * 20));
		System.out.println(pro+ " X Prominent Places in NewsPaper :"+"\t\t $"+(pro * 10));
		super.display1();
	}
	
	
	
}
