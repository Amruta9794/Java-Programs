class Pattern{
	public static void main(String[] args) {
		int N=10;
		char ch='J';
		int row=4;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2!=0) {
					System.out.print(N+" ");
				}
				else
				{
					System.out.print(ch+" ");
				}
				N--;
				ch--;
			}
			
				System.out.println();
	
		}
	}
}

