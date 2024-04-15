import java.util.Scanner;

//Area of rectangle and perimeter

public class Area_rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variable declaration
		
		int length,breadth,width;
		double area,perimeter;
		
		//Accept value from the user
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length :");
		length=sc.nextInt();
		System.out.println("Enter the breadth:");
		breadth=sc.nextInt();
		System.out.println("Enter the width: ");
		width=sc.nextInt();
		
		//Formulas of area and perimeter
		area=length*breadth;
	    perimeter=2*(length+width);
	    
	    //Display the accepted value
	    
		System.out.println("Total Area of the rectangle:" +area);
		System.out.println("Total Perimeter of the rectangle:" +perimeter);

	}

}
