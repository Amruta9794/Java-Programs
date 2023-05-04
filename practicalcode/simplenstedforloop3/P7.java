class Pattern{
	public static void main(String[] args) {
		int row=6;
		char ch='F';
		char ch1;

		for(int i=1;i<=row;i++) {
				 ch1=ch;
			for(int j=1;j<=i;j++) {
				System.out.print(ch1+ " ");
				ch1++;
			}
			System.out.println();
			ch--;
		}
	}
}

