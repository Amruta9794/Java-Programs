class SumEvenMulOdd5{
	public static void main(String[] args){
		int i=1, n=10;
		int sum=0;
		int mul=1;
		while(i<=10){
			if(i%2==0){
				sum=sum+i;
			}else {
				mul=mul*i;
			}
			i++;
		}
		System.out.println("Sum of Even Numbers 1 to 10="+sum);
		System.out.println("Multiplication of Odd Numbers 1 to 10="+mul);
	}
}
