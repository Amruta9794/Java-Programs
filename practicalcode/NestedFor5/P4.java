import java.io.*;
class NestedFor54{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

				System.out.println("Enter Start No");
				int S=Integer.parseInt(br.readLine());

				System.out.println("Enter End No");
				int E=Integer.parseInt(br.readLine());

				for(int i=E;i>=S;i--){
					if(i%2==0){
						System.out.print(i+" ");
					}
				}
					System.out.println();
				for(int i=S;i<=E;i++){
					if(i%2!=0){
						System.out.print(i+" ");
					}
				}
				System.out.println();
	}
}


