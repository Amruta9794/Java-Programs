class Automorphic{
	public static void main(String[] args) {
		int N=25;
		int flag=0;
		int sq=N*N;

		while(N>0) {
			if(N%10!=sq%10) {
				flag=1;
			}
			N=N/10;
			sq=sq/10;
		}
		if(flag==0) {
			System.out.println("Automorphic No");
		} else {
			System.out.println("Not an Automorphic No");
		}
	}
}

