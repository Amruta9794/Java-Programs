import java.io.*;
class NestedFor53{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Rows");

		int row=Integer.parseInt(br.readLine());
		
		int temp=row;
		for(int i=1;i<=row;i++){
			for(int j=row;j>=i;j--){
				System.out.print(temp*i+" ");
				temp--;
			}
			 temp=row-i;
			 System.out.println();
		}
	}
}
				
