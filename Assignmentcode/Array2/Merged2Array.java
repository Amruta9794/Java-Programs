import java.io.*;
class Merged2Array{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size Of First Array");
		int size1=Integer.parseInt(br.readLine());

		System.out.println("Enter Size Of Second Array");
		int size2=Integer.parseInt(br.readLine());

		int arr1[]=new int[size1];
		int arr2[]=new int [size2];

		System.out.println("Enter Elements in First Array");
		for(int i=0;i<arr1.length;i++){
			arr1[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Enter Elements in Second Array");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
	
			Merged(arr1,arr2);
	}
	public static void Merged(int arr1[],int arr2[]){
		int arr3[]=new int[arr1.length+arr2.length];

		for(int i=0;i<arr1.length;i++){
			arr3[i]=arr1[i];
		}

		for(int i=0;i<arr2.length;i++){
			arr3[arr1.length+i]=arr2[i];
		}

		System.out.println("Merge Array");
		for(int i=0;i<arr3.length;i++){
			System.out.println(arr3[i]);
		}
	}
}

