import java.io.*;
class ProdOddIndex3{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Array Size");
		int size=Integer.parseInt(br.readLine());
		int arr[]=new int[size];
		int Prod=1;

		System.out.println("Enter Array elements");
		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
			if(i%2!=0){
				Prod=Prod*i;
			}
		}
		System.out.println("Product Of Odd Index:"+Prod);
	}
}


