class ReverseNo7{
	public static void main(String[] args){
		int n=7;
		int i=n;
		while(i>0){
			if(n%2==0){
				System.out.println(i);
				i--;
			}else{
				System.out.println(i);
				i=i-2;
			}
		}
	}
}

