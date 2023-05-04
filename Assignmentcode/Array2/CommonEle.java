import java.io.*;
class CommonEle{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];
		int arr2[]=new int[size];

		System.out.println("Enter First Array Elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}

		System.out.println("Enter Second Array Elements");
		for(int i=0;i<arr2.length;i++){
			arr2[i]=Integer.parseInt(br.readLine());
		}
		
		Common(arr,arr2);
	}

	public static void Common(int arr[],int arr2[]){
		System.out.println("Common Elements are:");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr2.length;j++){
				if(arr[i]==arr[j]){
					System.out.println(arr[i]);
					break;
				}
			}
		}
	}
}

