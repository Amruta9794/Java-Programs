import java.io.*;
class NestedFor41{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter No Of Rows");
		int row=Integer.parseInt(br.readLine());

		int ch=row+64;
		int n=row;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row;j++){
				if(i%2!=0){
					System.out.print((char)ch+""+n+" ");
					ch--;
					n--;
				}else{
					System.out.print((char)ch+""+n+" ");
					ch++;
					n++;
				}
			}System.out.println();
				if(i%2!=0){
					ch++;
					n++;
				}
				else{
					ch--;
					n--;
				}
			}
			System.out.println();
		}
	}



