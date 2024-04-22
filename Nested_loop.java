
public class Nested_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=0;i<=4;i++) {
			for(k=1;k<5-i;k++) {
				System.out.print("");
			}
			for(j=0;j<=i;j++) {
				if((i+j)%2==0) {
					System.out.print("1");
				}else
				{
					System.out.print("0");
				}
			}

			System.out.println();
		}

	}

}