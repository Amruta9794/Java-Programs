import java.io.*;
class InputDemo{
	public static void main(String[] args)throws IOException{
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
	

		System.out.println("Enter Building Name");
		String BName = br.readLine();
	
		System.out.println("Enter Wing");
		char Wname = (char)br.read();
		br.skip(1);
		br.close();
		System.out.println("Room Number");
		 InputStreamReader isr1 =new InputStreamReader(System.in);
		  BufferedReader br1=new BufferedReader(isr1);
		int RNo = Integer.parseInt(br1.readLine());
    		
	

		System.out.println("Building name: "+ BName);
		System.out.println("Wingg name: "+ Wname);
		System.out.println("Room no: "+RNo);
	}
}

