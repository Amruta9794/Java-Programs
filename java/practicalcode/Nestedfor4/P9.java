class Pattern{
	public static void main(String[] args) {
		int N=1;
		int row=4;
		for(int i=1;i<=row;i++) {
			N=i;
			for(int j=1;j<=i;j++) {
				if(j%2!=0) {
					System.out.print(N*N*N+" ");
					N++;
				}
				else {
					System.out.print(N*N+" ");
					N++;
				}
			}
			System.out.println();
		}
	}
}

