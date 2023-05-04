class ArmStrong{
	public static void main(String[] args) {
		int N=153;
		int Temp=N;
		int Temp2=Temp;
		int count=0;
		int sum=0;
		
		
		while(N!=0) {
			count++;
			N=N/10;
		}
		while(Temp!=0) 
		  {     int rem=0;
			rem=Temp%10;
			for(int i=1;i<count;i++) {
				rem=rem*rem;
			}
			sum=sum+rem;
			Temp=Temp/10;
		}
		System.out.println(sum);
		if(sum==Temp2) {
			System.out.println("Armstrong No");
		} else {
			System.out.println("not Armstrong no");
		}	
          } 
}
