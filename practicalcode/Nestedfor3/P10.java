class Pattern{
	public static void main(String[] args) {
		int N=4;
		int n=1;
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=N-i+1;j++) {
				System.out.print(n+" ");
				n++;
			}
			n--;
			System.out.println();
		}
	}
}

