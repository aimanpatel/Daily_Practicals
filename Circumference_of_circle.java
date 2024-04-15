import java.util.Scanner;

public class Circumference_of_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable declarations
		int radius;
		double circumference;
		//Accepted value from user
		java.util.Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:");
		radius=sc.nextInt();
		circumference=Math.PI*2*radius;
		
		//Display the accepted value
		System.out.println("Circumference of the circle:"+circumference);

	}

}
