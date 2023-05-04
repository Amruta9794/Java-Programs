import java.util.*;
import java.lang.*;
class PrimeNo{
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	        int n=sc.nextInt();
		 PrimeNo obj=new PrimeNo();
		 obj.isPrime(n);
	}
	void isPrime(int n) {
		int count=0;
		for(int i=0;i<=n;i++) {
			if(n%i==0){
				count++;
			}
		}
		if(count==2) {
			System.out.println("no is prime");
		}
		else {
			System.out.println("no is not prime");
		}
	}
}


