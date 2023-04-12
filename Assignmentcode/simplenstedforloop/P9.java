class Pattern{
	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=3;i++) {
			char c='C';
			int n1=3;
			for(int j=1;j<=3;j++) {
				System.out.print(n*n);
				  System.out.print(c);
				    System.out.print(n1+" ");
				n++;
				c--;
				n1--;
			}
			System.out.println();
		}
	}
}


