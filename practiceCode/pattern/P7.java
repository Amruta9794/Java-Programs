import java.util.Scanner;

class P7{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Row");
		int row =sc.nextInt();
		System.out.println("Enter Columns");
		int col = sc.nextInt();

			for(int i=1;i<=row;i++) {
				for(int j=1;j<=col;j++) {
					if(j>=i && j<=(col+1)-i) {
						System.out.print("*");
					}
					else {
						System.out.print(" "); 
					}
				}
				System.out.println();
			}
		}
	}