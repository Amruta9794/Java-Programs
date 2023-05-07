import java.io.*;
class SwitchCase5{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Here The Menu!!!!!");
		System.out.println("1.Veg");
		System.out.println("2.NonVeg");
		System.out.println("Enetr your Choice");

		int Choice=Integer.parseInt(br.readLine());
		
		switch(Choice){
			case 1:{
				       System.out.println("VEG DISHES:");
				       System.out.println("1.Matar Paneer");
				       System.out.println("2.Veg Kolhapuri");
				       System.out.println("3.Paneer Tikka");
				       System.out.println("4.Gobi Mutter");
				       System.out.println("5.Kaju Masala");

				       int Dish=Integer.parseInt(br.readLine());
				       switch(Dish){
					       case 1:
						       System.out.println("1.Matar Paneer");
						       break;
					       case 2:
						       System.out.println("2.Veg Kolhapuri");
						       break;
					       case 3:
						       System.out.println("3.Paneer Tikka");
						       break;
					       case 4:
						       System.out.println("4.Gobi Mutter");
						       break;
					       case 5:
						       System.out.println("5.Kaju Masala");
						       break;
					       default:
						       System.out.println("Invalid Choice");
						       break;
				       }
			}
			break;

			case 2:{
				    System.out.println("NonVeg Menu!!!!");
				    System.out.println("1.Butter Chicken");
				    System.out.println("2.Mutton Curry");
				    System.out.println("3.Chicken Curry");
				    System.out.println("4.Egg Curry");
				    System.out.println("5.Fish Curry");
				    System.out.println("Enter Your Choice:");

				    int Dish=Integer.parseInt(br.readLine());

				    switch(Dish){
					    case 1:
						    System.out.println("1.Butter Chicken");
						    break;
					    case 2:
						    System.out.println("2.Mutton Curry");
						    break;
				            case 3:
						    System.out.println("3.Chicken Curry");
						    break;
					    case 4:
						    System.out.println("4.Egg Curry");
						    break;
					    case 5:
						    System.out.println("5.Fish Curry");
						    break;
				             default:
						    System.out.println("Invalid Choice");
				    }
			}break;
			default:
			       System.out.println("Invalid Choice");
		}
	}
}

