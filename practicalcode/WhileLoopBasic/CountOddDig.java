class CountOddDig{
	public static void main(String[] args){

		int n=942111432;
		int count=0;
	

		while(n!=0){
		int rem=n%10;

		if(rem%2!=0){
			count++;
		}
		
		n=n/10;
		}
		System.out.println("count of odd digits:" +count);
	}
}

