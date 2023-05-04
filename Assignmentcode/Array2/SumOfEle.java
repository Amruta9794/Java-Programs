import java.io.*;
class SumOfEle{
	public static void main(String[] args)throws IOException{
		BufferedReader Br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size Of Array");
		int size=Integer.parseInt(Br.readLine());

		int arr[]=new int[size];
		System.out.println("Enter Elements In Array");

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(Br.readLine());
		}

		int sum=ArrSum(arr);
		System.out.println(sum);
	}

	public static int ArrSum(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			 sum=sum+arr[i];
		}
		return sum;
	}
}
