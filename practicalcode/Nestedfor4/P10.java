class Pattern{
	public static void main(String[] args){
		int row=4;
		int n=1;

		for(int i=1;i<=row;i++){
			int temp=n;

			for(int j=1;j<=i;j++){
				if(i%2!=0){
					if(j%2==0){
						System.out.print(temp*temp*temp+ " ");
					}else{
						System.out.print(temp*temp+ "  ");
					}
				}else {
					if(j%2!=0){
						System.out.print(temp*temp*temp+ "  ");
					}else{
						System.out.print(temp*temp+ "  ");
					}
				}
				temp++;
			}
			n++;
			System.out.println();
		}
	}
}

