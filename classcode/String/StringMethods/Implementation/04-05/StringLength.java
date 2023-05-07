import java.io.*;
class StringLength{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter A String");
		String str1=br.readLine();

		int len=myStrLen(str1);

		System.out.println(len);
	}

	public static int myStrLen(String str1){

		char arr[]=str1.toCharArray();
		
		int i=0;
		for(int x:arr){
			i++;
		}
		return i;
	}
}

		
