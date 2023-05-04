 class SwitchDemo{
	 public static void main(String[] args) {
		 int ch=65;
		 switch(ch) {
			 case 'A':
				 System.out.println("char-A");
				 break;
			 case 65:                              // error 1: duplicate case label
				 System.out.println("Num-65");
				 break;
		 	 case 'B':
				 System.out.println("char-B");
				 break;
			 case 66:                               // error 2: duplicate case label
				 System.out.println("Num-66");
				 break;
			 default:
				 System.out.println("No Match");
				 break;
		 }
		  System.out.println("After switch");
	 }
 }


