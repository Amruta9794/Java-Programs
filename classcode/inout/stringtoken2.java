import java.util.*;
import java.io.*;
class StringDemo{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("enter Employeename,mobileno,gruopname,salary");
		String info=br.readLine();
		System.out.println(info);

		StringTokenizer obj = new StringTokenizer(info," ");

		String Token1=obj.nextToken();
		String Token2 = obj.nextToken();
		String Token3 = obj.nextToken();
		String Token4 = obj.nextToken();

		
		int i= Integer.parseInt(Token2);
		char c =Token3.charAt(0);
		float f = Float.parseFloat(Token4);

		System.out.println("Employee name: " + Token1);
		System.out.println(" Mobile No: " + i);
		System.out.println("Gruop name: " + c);
		System.out.println("salary : " + f);


	}
}


