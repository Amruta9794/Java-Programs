class Pattern{
	public static void main(String[] args) {
		char C='A';
		char c='b';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(j%2!=0) {
					System.out.print(C+" ");
					C++;
					C++;
				}
				else {
					System.out.print(c+" ");
					c++;
					c++;
				}
			}
			System.out.println();
		}
	}
}
