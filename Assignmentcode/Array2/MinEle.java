import java.io.*;
class MinEle{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size of Array");
		int size=Integer.parseInt(br.readLine());

		int arr[]=new int[size];

		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		int min=Minimum(arr);
		System.out.println("Minimum Element is:" +min);
	}

	public static int 
		Minimum(int arr[]){
			int Min=arr[0];
			for(int i=0;i<arr.length;i++){
				if(arr[i]<Min){
					Min=arr[i];
				}
			}
			return Min;
		}
}

