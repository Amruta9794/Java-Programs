import java.io.*;
class SwitchCase4{
	public static void main(String[] args)throws IOException{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("What's Your interest");
	System.out.println("1.Movies");
	System.out.println("2.Series");
	System.out.println("Enter Your Choice :");

	int Choice=Integer.parseInt(br.readLine());

	switch(Choice){
		case 1:{
			 System.out.println("Movie You Wish To Watch Today");
			 System.out.println("1.Founder");
			 System.out.println("2.Snowden");
			 System.out.println("3.Jobs");
			 System.out.println("4.Her");
			 System.out.println("5.Social Network");
			 System.out.println("6.Wall-E");
			 System.out.println("7.AI");
			 System.out.println("Enter Your Choice");

			 int Movie=Integer.parseInt(br.readLine());

			 switch(Movie){
				 case 1:
					 System.out.println("1.Founder");
					 break;
				 case 2:
					 System.out.println("2.Snowden");
					 break;
				 case 3:
					 System.out.println("3.Jobs");
					 break;
				 case 4:
					 System.out.println("4.Her");
					 break;
				 case 5:
					 System.out.println("5.Social Network");
					 break;
				 case 6:
					 System.out.println("6.Wall-E");	
					 break;
				 case 7: 
					 System.out.println("7.AI");
					 break;
				 default:
					 System.out.println("Invalid Choice");
					 break;
			 }
		}
		break;

		case 2:{
			       System.out.println("Best series To Watch");
			       System.out.println("1.Silicon Valley");
			       System.out.println("2.Devs");
			       System.out.println("3.the IT Crowd");
			       System.out.println("4.Mr.Robot");
			       System.out.println("Enter your Choice");
			       int Series=Integer.parseInt(br.readLine());
			       
			       switch(Series){

				       case 1:
					       System.out.println("1.Silicon Valley");
					       break;
				       case 2:
					       System.out.println("2.Devs");
					       break;
					case 3:
					       System.out.println("3.the IT Crowd");
					       break;
					case 4:
					       System.out.println("4.Mr.Robot");
					       break;
					default:
					       System.out.println("Invalid Choice");
					       break;
			       }
				
			     }
		       break;
		default:
		       System.out.println("Invalid Choice");
		       break;
	        }
	}
}
