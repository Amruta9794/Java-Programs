class Pattern{
	public static void main(String[] args) {
		char ch='A';
		char ch1;
		int row=4;
		for(int i=1;i<=row;i++) {
			ch1=ch;
			for(int j=1;j<=row-i+1;j++) {
				System.out.print(ch1+" ");
				ch1++;
			}
			ch++;
			System.out.println();
		}
	}
}

