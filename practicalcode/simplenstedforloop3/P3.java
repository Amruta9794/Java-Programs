class Pattern{
	public static void main(String[] args) {
		int N=4;
		for(int i=1;i<=N;i++) {
			int n=3;
			char c='C';
			for(int j=1;j<=N-i+1;j++) {
				System.out.print(n+""+c+ " ");
			}
			System.out.println();
		}
	}
}


