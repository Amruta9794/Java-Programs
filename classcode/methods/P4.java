import java.util.*;
class Div{
	static void div(int x, int y){
		float ans=x/y;
		System.out.println(ans);

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter two integer values");

		int a=sc.nextInt();
		int b=sc.nextInt();
		
		div(a,b);
	}
}

