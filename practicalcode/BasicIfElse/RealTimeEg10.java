class RealTimeEg10{
	public static void main(String[] args){
		int M1=60;
		int M2=70;
		int M3=80;

		float avg=(M1+M2+M3)/3;
		if(avg>=60){
			System.out.println("First Division");
		}else if(avg>=50 && avg<60){
			System.out.println("Second Division");
		}else if(avg>=35 && avg<50){
			System.out.println("Third Division");
		}else {
			System.out.println("Fail");
		}
	}
}
