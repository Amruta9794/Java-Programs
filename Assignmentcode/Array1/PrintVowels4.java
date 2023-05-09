import java.io.*;
class PrintVowels4{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
			System.out.println("Enter size Of Array");

			int size=Integer.parseInt(br.readLine());
			char ch[]=new char[size];

			System.out.println("Enter Characters In Array");
			for(int i=0;i<ch.length;i++){
				ch[i]=(char)br.read();
				br.skip(1);
			}
			System.out.println("Vowels");
			for(int i=0;i<ch.length;i++){
				if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||
				   ch[i]=='A'||ch[i]=='E'||ch[i]=='I'||ch[i]=='O'||ch[i]=='U'){
					System.out.println(ch[i]+" ");
				   }
			}
	}
}


