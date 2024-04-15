import java.util.Scanner;

public class Profit_loss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variable declarations
		int profit,loss;
		
		//Accept  value from  the user
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the cost price:");
		int cp=sc.nextInt();
		System.out.println("Enter the Selling price:");
		int sp=sc.nextInt();
		
		//Display the accepted value
		if(sp>cp)
		{
			profit=sp-cp;
			System.out.println("Profit:"+profit);
		}else if(sp<cp)
		{
			loss=cp-sp;
			System.out.println("Loss:"+loss);
		}
		else {
			System.out.println("No proft and No loss:");
		}
	}

}
