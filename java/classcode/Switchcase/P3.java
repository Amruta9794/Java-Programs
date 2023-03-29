 class SwitchDemo{
	 public static void main(String[] args) {
		 int x=5;
		 switch(x) {
			 case 1:
				 System.out.println("1");
				 break;
			 case 1+1:
				  System.out.println("2");
				  break;
			 case 1+2:
				  System.out.println("3");
				  break;
			 case 2:                           // error: dupicate case label
				  System.out.println("2");
				  break;
		 }
	 }
 }

