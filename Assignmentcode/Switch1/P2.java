import java.io.*;
class SwitchCase2{
	public static void main(String[] args)throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Entyer Your Choice in between 0 to 1");
		int num=Integer.parseInt(br.readLine());

		if(num>5){
			
			num=6;
		}
		if(num<0){
			num=-1;
		}
		switch(num){
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
			case 6:
				System.out.println("You Entered No Greater Than 5");
				break;
			case -1:
				System.out.println("you Entered No Less Than 0");
				break;
		}
	}
}

