class Composite{
	public static void main(String[] args) {
		int N=10;
		int count=0;
		for(int i=1; i<=N; i++) {
			if(N%i==0) {
				count ++;
			}
		}
		if(count>=2) {
			System.out.println(" Composite No");
			} else {
			       	System.out.println("not composite no");
			}
	}
}
