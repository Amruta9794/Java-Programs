class Pattern{
	public static void main(String[] args) {
		char r=5;
		int row=6;
		int N=1;
		char a='A';
		char ch=(char) (r + a);
	
		char chc;
	
		for(int i=1;i<=row;i++) {
			chc=ch;
			for(int j=1;j<=i;j++) {
				if(j%2!=0) {
					System.out.print(chc+"" +" ");
					chc++;
				}
				else {
					System.out.print(N+" ");
					N++;
				}
			}
			ch--;
			System.out.println();
		}
	}
}

