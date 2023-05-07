import java.io.*;
class SwitchCase1{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

				System.out.println("Enter Subject1 marks");
				int sub1=Integer.parseInt(br.readLine());

				System.out.println("Enter Subject2 marks");
				int sub2=Integer.parseInt(br.readLine());

				System.out.println("Enter Subject3 marks");
				int sub3=Integer.parseInt(br.readLine());
				
				System.out.println("Enter Subject4 marks");
				int sub4=Integer.parseInt(br.readLine());

				System.out.println("Enter Subject5 marks");
				int sub5=Integer.parseInt(br.readLine());

				double avg=(sub1+sub2+sub3+sub4+sub5)/5;
				char ch;

				if(sub1<35||sub2<35||sub3<35||sub4<35||sub5<35){
					System.out.println("You Faileed In Exam");
				}else{
					if(avg>75)
						ch='A';
					else if(avg>60)
						ch='B';
					else if(avg>50)
						ch='C';
					else if(avg>40)
						ch='D';
					else if(avg>=35)
						ch='E';
					else 
						ch='F';

					switch(ch){
						case 'A':
							System.out.println("First Class With Distinction");
							break;
						case 'B':
							System.out.println("First Class ");
							break;
						case 'C':
							System.out.println("Second Class ");
							break;
						case 'D':
							System.out.println("Third Class ");
							break;
						case 'E':
							System.out.println(" Pass ");
							break;
						case 'F':
							System.out.println("Fail");
							break;
					}
				}
	}
}

