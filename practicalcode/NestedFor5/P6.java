import java.io.*;
class NestedFor46{
	public static void main(String[] args)throws IOException{

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Two Characters");

		int C1=(char)(br.read());
		br.skip(1);
		int C2=(char)(br.read());
		//br.skip(1);
		

		if(C1==C2){
			System.out.println((char)C1);
		}else if(C1>C2){
			int x=C1-C2;
			System.out.println(x);
		}
		else{
			int y=C2-C1;
			System.out.println(y);
		}    
		System.out.println("end");
	}
}



		
