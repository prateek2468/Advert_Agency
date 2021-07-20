package project;

import java.util.Scanner;

public class Client {
	String name ;
	inherit i;
	Scanner scan = new Scanner(System.in);
	int a1;
	public Client() {
		
		System.out.println("Enter name or Company's name  (plus add '_' and the number of your visit) : ");
		name  = scan.nextLine();
		print();
		 a1 = scan.nextInt();
		
		switch(a1) {
		case 1:
			i = new Audio();
			break;
		case 2:
			i = new Television();
			
			break;
		case 3:
			i = new Newspaper();
			break;
		case 4:
			i = new Web();
			break;
			
		}
		
		if(a1 <=3 )i.set_days();
		i.details_of_ad();
		
		i.display(name);
		
		help();
		
	}
	
	private void  print() {
		System.out.println("Select the type of Advertisement :-  (select the corresponding number) \n"
				+ "\t --->Radio and Spotify(1) \n"
				+ "\t --->Television(2) \n"
				+ "\t --->Newspaper(3) \n"
				+ "\t --->Web and App(4) \n");
	}
	
	private void print1() {
		System.out.println("\n\t\t Select any of the following :- \n"
				+ "-->See the Quote (1)\n"
				+ "-->Make Additions to the Quote(2)\n"
				+ "-->Talk about AgreeMent(3)\n"
				+ "-->Status of Quote (4)\n"
				+ "-->Make the payment(5)\n"
				+ "-->Cost of Preparation(6) \n"
				+ "-->Cost of Airing (7) \n"
				+ "-->Exit(8) \n");
	}
	
	public void help() {
		print1();
		int a = scan.nextInt();
		
		while(true) {
			if(a == 1) {
				i.display(name);
			}else if(a == 2) {
				System.out.println("___UPDATE____");
				if(i.accept == false) {
				i.further_details();
				i.display(name);
				}else {
					System.out.println("Cannot do it As the Quote is Confirmed");
				}
			}else if(a == 3) {
				if(i.accept == false )i.acceptance(name);
				if(i.accept == true) {
					if(a1 == 3 || a1==4) {
						i.payment();
					}else {
						System.out.println("Select one of the Options :- \n"
								+ "-->Complete(1)\n"
								+ "-->Installments(2)\n");
						int i2 = scan.nextInt();
						if(i2 == 1) {
							i.payment();
						}else {
							i.payment("Installment");
						}
						i.display1();
					}
				}else {
					break;
				}
			}else if(a == 4) {
				System.out.println("Status : -- "+ i.get_status());
			}else if(a == 5){
				if(i.accept && i.payment_check()) {
					if(a1 == 3 || a1==4) {
						i.payment();
					}else {
						System.out.println("Select one of the Options :- \n"
								+ "-->Complete(1)\n"
								+ "-->Installments(2)\n");
						int i2 = scan.nextInt();
						if(i2 == 1) {
							i.payment();
						}else {
							i.payment("Installment");
						}
						i.display1();
					}
				}else {
					System.out.println("!!!!!________SYSTEM ERROR - CANNOT PROCEED WITH PAYMENT________!!!!!!!");
				}
			}else if(a== 6){
				System.out.println("Cost of Preparation :-  $"+ i.get_cost_of_preparation());
			}else if(a == 7) {
				System.out.println("Cost of Airing :-  $"+i.get_cost_of_airing());
			}else {
				break;
			}
			print1();
			a = scan.nextInt();
		}
	}
	

}
