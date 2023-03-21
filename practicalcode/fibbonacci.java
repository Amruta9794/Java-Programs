class Fibonacci{
	public static void main(String[] args) {
		int a=-1;
		int b=1;
		int N=5;
		while(N>0) {
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			N--;
	      	}  
	}
}

