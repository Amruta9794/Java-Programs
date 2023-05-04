import java.io.*;
class MaxEle{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Size of array");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		int max=Maximum(arr);
		System.out.println("Maximum Element is:" +max);
	}

	public static int Maximum(int arr[]){
		int Max=arr[0];
		for(int i=0;i<arr.length;i++){
			if(arr[i]>Max){
				Max=arr[i];
			}
		}
		return Max;
	}
}

