class Automprphic{
	public static void main(String[] args) {
		int N=25;
		int temp=N;
	        int count=0;
		int count1=0;
	       	int sq=N*N;
		while(N>0) {
			count++;
			N=N/10;
		}
		while(temp>0) {
			if(temp%10==sq%10) {
				count1++;
			}
			temp=temp/10;
			sq=sq/10;
		}
		if(count==count1) {
			System.out.println("Automorphic No");
		}
		else {
			System.out.println("Not An Automorphic No");
		}
	}
}

