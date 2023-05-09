import java.io.*;
class ProdEven2{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Size Of Array");
		int size =Integer.parseInt(br.readLine());
		int Mul=1;
		int arr[]=new int[size];

		System.out.println("Enter Elements In Array");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			
			if(arr[i]%2==0){
				Mul=Mul*arr[i];
			}
		}
		System.out.println("Product Of Even Elements:" +Mul);
	}
}

			
				
