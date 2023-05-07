class SquareOfEvenDig6{
	public static void main(String[] args){
		int n=942111423;
		int squ=0;
		int rem=0;

		while(n!=0){
			rem=n%10;
			if(rem%2==0){
				squ=rem*rem;
				System.out.println(squ);
			}  
			n=n/10;
		}
	}
}
