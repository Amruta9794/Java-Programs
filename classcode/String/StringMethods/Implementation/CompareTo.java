import java.io.*;
class  CompareTo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BuffredReader(new InputstreamReader(System.in));

		System.out.println("Enter Two Strings To Compare");
		String str1=br.readLine();
		String str2=br.readLine();

		MyCompareTo(str1,str2);
	}

	public static int MYCompareTo(String str1,String str2){
		char arr1[]=str1.toCharArray();
		char arr2[]=str2.toCharArray();
		if(arr1.length==arr.length){
			for(int i=0;i<arr1.length;i++){
				if(	

