import java.util.Scanner;

public class Sec_pro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// VARIABLE DECLARATION
		String name,address;
		int roll_no;
		double percentage;
		
		
		//ACCEPT VALUE FROM THE USER
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your Name : ");
		name=sc.nextLine();
		System.out.println("Enter your Address: ");
		address=sc.nextLine();
		System.out.println("Enter your roll_no: ");
		roll_no=sc.nextInt();
		System.out.println("Enter your percentage: ");
		percentage=sc.nextDouble();
		
		//DISPLAY THE ACCEPTED VALUE
		
		System.out.println("Welcome : " +name);
		System.out.println("Address : " +address);
		System.out.println("Roll_no : " +roll_no);
		System.out.println("Pecentage : " +percentage);

		

		
	}

}
