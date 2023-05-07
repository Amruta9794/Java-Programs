class PythagoreanTriplet{
	public static void main(String[] args){
		int a=3,b=4,c=5;
		int A=a*a;
		int B=b*b;
		int C=c*c;

		if(A==B+C || B==A+C || C==A+B){
			System.out.println("It is a Pythagorean Triplet");
		}else {
			System.out.println("It is Not a Pythagorean Triplet");
		}
	}
}


