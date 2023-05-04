import java.io.*;
class SumEvenOddEle{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enetr Size of Array");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		int Esum=0;
		int Osum=0;
		System.out.println("Enter Elements in Array");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());

			if(arr[i]%2==0){
				Esum=Esum+arr[i];
			}
			else{
				Osum=Osum+arr[i];
			}
		}
		System.out.println("Sum of Even Elements:"+Esum);
		System.out.println("Sum of Odd Elements:"+Osum);
	}
}

