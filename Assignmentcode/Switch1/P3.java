import java.io.*;
class SwitchCase3{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter First Number");
		int N1=Integer.parseInt(br.readLine());

		System.out.println("Enter Second Number");
		int N2=Integer.parseInt(br.readLine());

		if(N1<0||N2<0){
			System.out.println("Sorry Negative Numbers Are Not Allowed");
		}
		else {
			switch((N1*N2)%2){
				case 0:
					System.out.println("The Multiplication Is Even");
					break;

				case 1:
					System.out.println("The Multiplication Is Odd");
					break;
			}
		}
	}
}

					
