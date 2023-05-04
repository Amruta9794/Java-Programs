import java.io.*;
class JaggedArrUserIO{
	public static void main(String[] args)throws IOException{
		int arr[][]=new int[3][];
		 arr[0]=new int[3];
		 arr[1]=new int[2];
		 arr[2]=new int[1];

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter array elements");

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=Integer.parseInt(br.readLine());
			//	br.skip(1); //error: How to manage space here......
			}
		}

		for(int[]x:arr){
			for(int y:x){
				System.out.print(y+" ");
			}
			System.out.println();
		}


		for(int[]x:arr){
			for(int y:x){
				System.out.print(x+" ");  //it gives address of each row
				 }
			System.out.println();
		}
	}


}
