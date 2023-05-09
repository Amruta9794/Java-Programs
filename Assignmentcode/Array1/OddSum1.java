import java.io.*;
class OddSum1{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size of Array");
		int size = Integer.parseInt(br.readLine());
		int sum=0;
		int arr[]=new int[size];
		System.out.println("Enter Array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			
			if(arr[i]%2!=0){
			 sum=sum+arr[i];
			}	
		}
		System.out.println("Sum Of Odd Elements:"+ sum);
	}
}


