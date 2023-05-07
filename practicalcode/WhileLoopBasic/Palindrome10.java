class Palindrome10{
	public static void main(String[] args){
		int n=3223;
		int temp=n;
		int rem=0;
		int rev=0;

		while(temp!=0){
			rem=temp%10;

		       rev=rev*10+rem;
			temp=temp/10;
		}
		if(rev==n){
			System.out.println(n+" is a Palindrome number");
		}
	}
}
