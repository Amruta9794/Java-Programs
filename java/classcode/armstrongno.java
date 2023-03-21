class Core2Web{
	public static void main(String[] args) {
		int N=153;
		int Temp=N;
		int Temp2=Temp;
		int count=0;
		int sum=0;
		int rem=0;
		while(N!=0) {
			count++;
			N=N/10;
		}
		while(Temp!=0) {
			rem=Temp%10;
			int mul=1;
			for(int i=1;i<=count;i++) {
			mul = mul * rem;
			}
		    sum=sum+mul;
		    Temp=Temp/10;
		}
		if(sum==Temp2) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not an armstrong");
		}
	}
}

