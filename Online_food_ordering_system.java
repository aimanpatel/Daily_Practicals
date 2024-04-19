import java.util.Scanner;
public class Online_food_ordering_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,choice2,total=0;
		char ans;
		String order="";
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME TO HOTEL TAJ...!!!");
		do {
			System.out.println("menu:");
			System.out.println("1.Starters:");
			System.out.println("2.Main Course:");
			System.out.println("3.Desert:");
			System.out.println("4.Soft Drinks:");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("1.Paneertikka\t\t\t        Rs. 120");
				System.out.println("2.Vadapav\t\t\t            Rs. 140");
				System.out.println("3.Pakoda\t\t\t             Rs. 160");
				System.out.println("4.Samosa\t\t\t             Rs. 180");
				choice2=sc.nextInt();
				
				switch(choice2) {
				case 1: 
				total+=120;
				order+="\nItem1 Paneer tikka \t Rs.120";
				break;
				case 2:
				total+=140;
				order+="\nItem2 Vadapav \t Rs.140";
				break;
				case 3:
				total+=160;
				order+="\nItem3 Pakoda \t Rs.160";
				break;
				case 4:
				total+=180;
				order+="\nItem4 Samosa \t Rs.180";
				break;
				
				}
				break;
				
			case 2:
				System.out.println("1.Item Biryani \t\t\t      Rs. 120");
				System.out.println("2.Item Tandoori fry \t\t\t Rs. 140");
				System.out.println("3.Item Pizza \t\t\t        Rs. 160");
				System.out.println("4.Item fish fry \t\t\t     Rs. 180");
				choice2=sc.nextInt();
				
				switch(choice2) {
				case 1:
				total+=120;
				order+="\nItem1 Biryani  \t Rs.120";
				break;
				case 2:
				total+=140;
				order+="\nItem2 Tandoori fry \t Rs.140";
				break;
				case 3: 
				total+=160;
				order+="\nItem3 Pizza \t Rs.160";
				break;
				case 4:
				total+=180;
				order+="\nItem4 fish fry \t Rs.180";
				break;
				}
				break;
				
			case 3:
				System.out.println("1.Item Ice-Cream \t\t\t  Rs. 120");
				System.out.println("2.Item Custurd\t\t\t     Rs. 140");
				System.out.println("3.Item Cake\t\t\t        Rs. 160");
				System.out.println("4.Item Jalebi\t\t\t      Rs. 180");
				choice2=sc.nextInt();
				
				switch(choice2) {
				case 1: 
				total+=120;
				order+="\nItem1 Ice-Cream\t Rs.120";
				break;
				case 2: 
				total+=140;
				order+="\nItem2 Custurd\t Rs.140";
				break;
				case 3:
				total+=160;
				order+="\nItem3 Cake\t Rs.160";
				break;
				case 4:
				total+=180;
				order+="\nItem4 Jalebi\t Rs.180";
				break;
				
				}
				break;
			case 4:
				System.out.println("1.Tea \t\t\t          Rs. 120");
				System.out.println("2.Coffee \t\t\t       Rs. 140");
				System.out.println("3.Juice\t\t\t         Rs. 160");
				System.out.println("4.Falooda\t\t\t       Rs. 180");
				choice2=sc.nextInt();
				
				switch(choice2) {
				case 1:
				total+=120;
				order+="\nTea \t Rs.120";
				break;
				case 2:
				total+=140;
				order+="\nCoffee \t Rs.140";
				break;
				case 3: 
				total+=160;
				order+="\nJuice \t Rs.160";
				break;
				case 4: 
				total+=180;
				order+="\nFalooda \t Rs.180";
				break;
				
				}
				break;
				default:
				
					System.out.println("Invalid choice....");
					break;
				}
				System.out.println("Do you want to add any other Item YESS/NO....");
				ans=sc.next().charAt(0);
			
				
			}
			while(ans=='Y'||ans=='y');
			System.out.println("Thanks for coming:)\nVisit Again...");
			System.out.println("Your orders:\n"+order);
			System.out.println("Your total Bill amount is: "+total);
			System.out.println("Pay by Gpay or CASH...");
			
		
		
		

	          }

}
