class Strongno{
	public static void main(String[] args) {
		int N=145;
		int temp=N;
		int rem=0;
		int sum=0;
		while(N!=0) {
			rem=N%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			 sum=sum+fact;
			N=N/10;
	} 
	if(sum==temp) {
		System.out.println("Strong no");
	} else {
		System.out.println("Not Strong No");
	}
    }
}



