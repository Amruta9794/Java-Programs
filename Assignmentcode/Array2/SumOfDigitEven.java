import java.io.*;
class SumOfDigitEven{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Enter Elements In Array");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		PrintEle(arr);

	}

	public static void PrintEle(int arr[]){
		

		for(int i=0;i<arr.length;i++){
			int rem=0;
			int sum=0;
			int temp=arr[i];
			
			while(temp!=0){
			rem=temp%10;
			sum=sum+rem;
			temp=temp/10;
			}
			if(sum%2==0){
				System.out.println(arr[i]);
			}
		}
	}
}

