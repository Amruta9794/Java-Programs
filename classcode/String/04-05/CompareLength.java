import java.io.*;
class CompareLength{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enetr A String");
		 String str1=br.readLine();

		  System.out.println("Enetr A String");
		  String str2=br.readLine();

		  int len1=myStrLen(str1);
		  int len2=myStrLen(str2);

		  if(len1==len2){
			  System.out.println("Lengths are Same");
		  }
		  else {
			  System.out.println("Lengths are Different");
		  }
	}
	static int myStrLen(String str){
		char arr[]=str.toCharArray();
		int count=0;

		System.out.println(arr.length);

		for(int i=0;i<arr.length;i++){
			count++;
		}
		return count;
	}
}

