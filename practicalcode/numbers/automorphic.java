class Automorphic{
	public static void main(String[] args) {
		int N=5;
	        int square=N*N;
		int lastdigit=square%10;
		if(lastdigit==N) {
			System.out.println("Automorphic no");
		}
		else {
			System.out.println("Not An Automorphic No");
		}
	}
}
