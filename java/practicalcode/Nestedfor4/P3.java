class Pattern{
	public static void main(String[] args) {
		int n=10;
		int row=4;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(n+" ");
				n--;
			}
			n++;
			System.out.println();
		}
	}
}

