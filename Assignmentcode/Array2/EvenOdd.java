import java.io.*;
class EvenOdd{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size of array");
		int size=Integer.parseInt(br.readLine());
		int count=0;
		int count1=0;
		int arr[]=new int[size];
		System.out.println("Enetr elements in the array");
		for(int i=0;i<arr.length;i++){
							
			arr[i]=Integer.parseInt(br.readLine());

			if(arr[i]%2==0){
				count++;
			} else {
				count1++;
			}
		}
		System.out.println("even elements:"+count);
		System.out.println("odd elements:"+count1);
	}
}



