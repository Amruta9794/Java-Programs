import java.io.*;
class DivisibleBy5{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter 10 Array Elements");
		int arr[]=new int[10];

		for(int i=0;i<arr.length;i++){
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Elements Divisible By 5");
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%5==0){
				System.out.println(arr[i]);
			}
		}
	}
}

