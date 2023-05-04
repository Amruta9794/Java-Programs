import java.io.*;
import java.util.*;
class StringDemo{
	public static void main(String[] args)throws IOException{
	
  	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Society name,wing,flatno");

	String info=br.readLine();
	System.out.println(info);
	
	StringTokenizer obj=new StringTokenizer(info," "); //delimeter
        String Token1=obj.nextToken();
	String Token2=obj.nextToken();
 	String Token3=obj.nextToken();

	System.out.println("Society:" +Token1);
	System.out.println("Wing:" + Token2);
	System.out.println("Flat:" +Token3);

	}
}

